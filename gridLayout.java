
import javax.swing.*;
import java.awt.*;

public class gridLayout {
     JFrame f;
     JButton b1,b2,b3,b4;
     public gridLayout(){
        f = new JFrame("GridLayout");
        b1=new JButton("btn-1");
        b2=new JButton("btn-2");
        b3=new JButton("btn-3");
        b4=new JButton("btn-4");

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridLayout(2,2));

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
}
public static void main(String[] args) {
    new gridLayout();
}
}
