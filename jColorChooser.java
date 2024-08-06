import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class jColorChooser {
    JFrame f;
    JButton b;

    public jColorChooser() {
        f = new JFrame("Color Chooser");
        b = new JButton("Choose Color");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(f, "Color Chooser", Color.RED);
                if (color!= null) {
                    f.getContentPane().setBackground(color);
                }
            }
        });
        f.getContentPane().add(b);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new jColorChooser();
    }
}