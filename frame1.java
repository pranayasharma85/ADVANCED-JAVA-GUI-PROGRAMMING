// creating frame using inheritnce method 
import javax.swing.*;
public class frame1 extends JFrame {
    
    JLabel l1;
    
    public frame1()
    {
        setTitle("Frame 1");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(null);
        l1=new JLabel("This is frame 1");
        l1.setBounds(120,150,200,20);
        add(l1);
    }
    public static void main(String[]args)
    {
        new frame1();

    }
}
