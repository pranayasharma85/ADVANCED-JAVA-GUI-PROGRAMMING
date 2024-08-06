
import javax.swing.*;
import java.awt.event.*;

public class within_Class implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;

    public within_Class()
    {
        f=new JFrame("Addition:");
        l1=new JLabel("First Number:");
        l2=new JLabel("Second Number:");
        l3=new JLabel();
        t1=new JTextField(25);
        t2=new JTextField(25);
        b1=new JButton("Add");

        //setting a frame
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        

    //setting bounds 
    l1.setBounds(20,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(20,100,100,20);
    t2.setBounds(150,100,100,20);
    b1.setBounds(150,150,80,20);
    l3.setBounds(20,200,100,20);

    //adding into frame 
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(t1);
    f.add(t2);
    f.add(b1);
   
    b1.addActionListener(this);    
    }



    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int s=n1+n2;
        l3.setText("Sum:"+s); 
    }

    public static void main(String[] args) {
        new within_Class();

    }
    
}
