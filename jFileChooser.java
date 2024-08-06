import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class jFileChooser {
    JFrame f;
    JMenuBar mb;
    JMenu m;
    JMenuItem i;

    public jFileChooser() {
        f = new JFrame("File chooser");
        mb = new JMenuBar();
        m = new JMenu("File");
        i = new JMenuItem("Open");

        f.setJMenuBar(mb);
        mb.add(m);
        m.add(i);

        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == i) {
                    JFileChooser fc = new JFileChooser();
                    int i = fc.showOpenDialog(f);
                    if (i == JFileChooser.APPROVE_OPTION) {
                        File f1 = fc.getSelectedFile();
                        JOptionPane.showMessageDialog(f, "FilePath:" + f1.getAbsolutePath());

                    }

                }

            }
        });

    }

    public static void main(String[] args) {
        new jFileChooser();
    }
}
