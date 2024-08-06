import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestBean extends JFrame {
     JTextField t1;
     JTextField t2;
     JTextField t3;
     JButton b;
     JLabel l;

    public SimpleInterestBean() {
        setTitle("Simple Interest Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(3);
        setLayout(new GridLayout(5, 2));

        JLabel principalLabel = new JLabel("Principal:");
        JLabel rateLabel = new JLabel("Rate:");
        JLabel timeLabel = new JLabel("Time:");
        b = new JButton("Calculate");
        l = new JLabel("Simple Interest: ");
        
        
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();


        add(principalLabel);
        add(t1);
        add(rateLabel);
        add(t2);
        add(timeLabel);
        add(t3);
        add(b);
        add(l);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });
    }

    private void calculateSimpleInterest() {
        double principal = Double.parseDouble(t1.getText());
        double rate = Double.parseDouble(t2.getText());
        double time = Double.parseDouble(t3.getText());
        double simpleInterest = (principal * rate * time) / 100;
        l.setText("Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleInterestBean().setVisible(true);
            }
        });
    }
}
