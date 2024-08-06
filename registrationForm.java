import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class registrationForm {
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3;
    JCheckBox c1, c2, c3;
    JRadioButton r1, r2;
    JComboBox<String> co1;
    JTextArea ta;
    JButton submit;

    public registrationForm() {

        f = new JFrame("Registration Form");
        l1 = new JLabel("Name:");
        l2 = new JLabel("Email:");
        l3 = new JLabel("Password:");
        l4 = new JLabel("Program:");
        l5 = new JLabel("Shift:");
        l6 = new JLabel("Address:");

        t1 = new JTextField(40);
        t2 = new JTextField(40);
        t3 = new JTextField(40);

        c1 = new JCheckBox("BCA");
        c2 = new JCheckBox("CSIT");
        c3 = new JCheckBox("BIT");

        r1 = new JRadioButton("Morning");
        r2 = new JRadioButton("Day");

        co1 = new JComboBox<>();
        
        submit = new JButton("Submit");

        // Frame
        f.setSize(500, 500);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

        l1.setBounds(10, 10, 100, 20);
        t1.setBounds(120, 10, 200, 20);

        l2.setBounds(10, 40, 100, 20);
        t2.setBounds(120, 40, 200, 20);

        l3.setBounds(10, 70, 100, 20);
        t3.setBounds(120, 70, 200, 20);

        l4.setBounds(10, 100, 100, 20);
        c1.setBounds(120, 100, 50, 20);
        c2.setBounds(180, 100, 50, 20);
        c3.setBounds(240, 100, 50, 20);

        l5.setBounds(10, 130, 100, 20);
        r1.setBounds(120, 130, 80, 20);
        r2.setBounds(220, 130, 80, 20);


        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        l6.setBounds(10, 160, 100, 20);
        co1.setBounds(120, 160, 200, 20);
        co1.addItem("KTM");
        co1.addItem("Pokhara");
        co1.addItem("Dhangadi");

        submit.setBounds(150, 200, 100, 20);


        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String email = t2.getText();
                String password = t3.getText();
                String program = "";
                if (c1.isSelected())
                    program += "BCA ";
                if (c2.isSelected())
                    program += "CSIT ";
                if (c3.isSelected())
                    program += "BIT ";
                String shift = r1.isSelected() ? "Morning" : "Day";
                String address = (String) co1.getSelectedItem();

                ta.setText("Name: " + name + "\nEmail: " + email + "\nPassword: " + password + "\nProgram: " + program
                        + "\nShift: " + shift + "\nAddress: " + address);
            }
        });

        ta = new JTextArea(10, 20);
        ta.setBounds(10, 250, 380, 200);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l5);
        f.add(r1);
        f.add(r2);
        f.add(l6);
        f.add(co1);
        f.add(submit);
        f.add(ta);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new registrationForm();
    }
}