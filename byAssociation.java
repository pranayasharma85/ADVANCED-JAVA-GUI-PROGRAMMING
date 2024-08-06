import javax.swing.*;

public class byAssociation {
    
    JFrame f;
    JLabel l;

    public byAssociation()
    {
        f=new JFrame("Frame 2");
        l=new JLabel("This is frame 2");

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        
        l.setBounds(60,50,200,20);
        f.add(l);

    }
    public static void main(String[]args)
    {
        new byAssociation();

    }
}
