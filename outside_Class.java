
// import javax.swing.*;
// import java.awt.event.*;

// public class outside_Class {

//     JFrame f;
//     JLabel l1,l2,l3,l4;
//     JTextField t1,t2,t3,t4;
//     JButton b1;

//     public outside_Class()
//     {
//         f=new JFrame("Simple Interest:");

//         l1=new JLabel("Principle :");
//         l2=new JLabel("Time:");
//         l3=new JLabel("Rate:");
//         l4=new JLabel("SI:");

//         t1=new JTextField(25);
//         t2=new JTextField(25);
//         t3=new JTextField(25);
//         t4=new JTextField(25);

//         b1=new JButton("Simple Interest");

//         //setting a frame
//         f.setSize(400,400);
//         f.setVisible(true);
//         f.setDefaultCloseOperation(3);
//         f.setLayout(null);
        

//     //setting bounds 
//     l1.setBounds(20,50,100,20);
//     t1.setBounds(150,50,100,20);
//     l2.setBounds(20,100,100,20);
//     t2.setBounds(150,100,100,20);
//     l3.setBounds(20,150,100,20);
//     t3.setBounds(150,150,100,20);
//     b1.setBounds(150,150,80,20);
//     l4.setBounds(20,250,100,20);
//     t4.setBounds(150,250,100,20);



//     //adding into frame 
//     f.add(l1);
//     f.add(l2);
//     f.add(l3);
//     f.add(l4);
//     f.add(t1);
//     f.add(t2);
//     f.add(t3);
//     f.add(t4);
//     f.add(b1);

//     b1.addActionListener(new Handler(this));
//     }
//     public static void main(String[] args) {
//         new outside_Class();

//     }
    
// }

// public class Handler implements ActionListener
// {
//     outside_Class ex;
//     public Handler(outside_Class ex)
//     {
//         this.ex=ex;

//     }
//     @Override
//     public void actionPerformed(ActionEvent e)
//     {
//         double p=Double.parseDouble(ex.t1.getText());
//         double t=Double.parseDouble(ex.t2.getText());
//         double r=Double.parseDouble(ex.t3.getText());

//         double si=(p*t*r)/100;
//         ex.t4.setText(String.valueOf(si));

//     }

// }
