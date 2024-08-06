
import javax.swing.*;
import java.awt.*;



public class borderlayout {

    JFrame f;
    JButton b1, b2, b3, b4,b5;

    public borderlayout()
    {
        f=new JFrame("Border Layout");
        b1=new JButton("btn-1");
        b2=new JButton("btn-2");
        b3=new JButton("btn-3");
        b4=new JButton("btn-4");
        b5=new JButton("btn-5");

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new BorderLayout());

        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);



    }

    public static void main(String[] args) {
        new borderlayout();
    }
}
