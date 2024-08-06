import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboBox implements ItemListener, ActionListener {

    JFrame f;
    JLabel l1, l2, l3;
    JCheckBox c1, c2, c3;
    JRadioButton r1, r2;
    JComboBox<String> co1;

    public comboBox() {
        f = new JFrame("Choice Elements");
        l1 = new JLabel("Program:");
        l2 = new JLabel("Shift: ");
        l3 = new JLabel("College:");
        c1 = new JCheckBox("BCA");
        c2 = new JCheckBox("CSIT");
        c3 = new JCheckBox("BIT");
        r1 = new JRadioButton("Morning");
        r2 = new JRadioButton("Day");
        co1 = new JComboBox<>();

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        co1.addItem("Default");
        co1.addItem("Rr COLLEGE");
        co1.addItem("PK COLLEGE");
        co1.addItem("PMC COLLEGE");

        f.setSize(300, 300);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());

        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l2);
        f.add(r1);
        f.add(r2);
        f.add(l3);

        f.add(co1);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        co1.addActionListener(this);

        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
       
            if (c1.isSelected()) {
                JOptionPane.showMessageDialog(f, "BCA is selected");
            } 
       
            if (c2.isSelected()) {
                JOptionPane.showMessageDialog(f, "CSIT is selected");
            } 
            
            if (c3.isSelected()) {
                JOptionPane.showMessageDialog(f, "BIT is selected");
            }
           
            if (r1.isSelected()) {
                JOptionPane.showMessageDialog(f, "Morning Shift is selected");
            } 
            if (r2.isSelected()) {
                JOptionPane.showMessageDialog(f, "Day Shift is selected");
            } 
        }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == co1) {
            String selectedCollege = (String) co1.getSelectedItem();
            JOptionPane.showMessageDialog(f, "You selected " + selectedCollege);
        }
    }

    public static void main(String[] args) {
        new comboBox();
    }
}