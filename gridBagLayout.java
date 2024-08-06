
import javax.swing.*;
import java.awt.*;

public class gridBagLayout {

    JFrame f;
    JButton b1, b2, b3,b4;

    public gridBagLayout()
    {
        f=new JFrame("Grid Bag Layout");
        b1=new JButton("BTN-1");
        b2=new JButton("BTN-2");
        b3=new JButton("BTN-3");
        b4=new JButton("BTN-4");

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx=0;
        gbc.gridy=0;
        f.add(b1,gbc);

        gbc.gridx=1;
        gbc.gridy=0;
        f.add(b2,gbc);

        gbc.gridx=2;
        gbc.gridy=0;
        f.add(b3);

        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        f.add(b4,gbc);

    }
    public static void main(String[] args) {
        new gridBagLayout();
    }
    
}
