

import javax.swing.*;
public class swingcontrol {
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;

    public swingcontrol()
    {
        f=new JFrame("Login");
        l1=new JLabel("UserName");
        l2=new JLabel("Password");
        t1=new JTextField(25);
        p1=new JPasswordField(25);
        b1=new JButton("Login");

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

    l1.setBounds(20,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(20,100,100,20);
    p1.setBounds(150,100,100,20);
    b1.setBounds(150,150,100,20);

    f.add(b1);
    f.add(l1);
    f.add(l2);
    f.add(t1);
    f.add(p1);
    
    }
    public static void main(String[]args)
    {
        new swingcontrol();
        
    }
}
