

import javax.swing.*;
public class swingcontrol2 {
JFrame f;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4;

public swingcontrol2()
{
    f=new JFrame("Calculator");
    l1=new JLabel("First number");
    t1=new JTextField(25);
    l2=new JLabel("Second Number");
    t2=new JTextField(25);
    b1=new JButton("ADD");
    b2=new JButton("SUB");
    b3=new JButton("MUL");
    b4=new JButton("DIV");
    l3=new JLabel("Result");
    t3=new JTextField(25);


    f.setSize(500,500);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);

    l1.setBounds(20,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(20,100,100,20);
    t2.setBounds(150,100,100,20);

    b1.setBounds(20,150,50,20);
    b2.setBounds(80,150,50,20);
    b3.setBounds(140,150,50,20);
    b4.setBounds(200,150,50,20);

    l3.setBounds(20,200,100,20);
    t3.setBounds(150,200,100,20);


    f.add(l1);f.add(l2);
    f.add(l3); f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);


}

public static void main(String[]args)
{
    new swingcontrol2();

}
}
