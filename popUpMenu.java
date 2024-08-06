import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class popUpMenu {
    JFrame f;
    JPopupMenu pm;
    JMenuItem i1, i2, i3;

    public popUpMenu() {
        f = new JFrame("POP UP Example");
        pm = new JPopupMenu();
        i1 = new JMenuItem("Copy");
        i2 = new JMenuItem("Paste");
        i3 = new JMenuItem("Cut");

        pm.add(i1);
        pm.add(i2);
        pm.add(i3);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                pm.show(f, e.getX(), e.getY());

            }
        });

    }

    public static void main(String[] args) {
        new popUpMenu();

    }

}
