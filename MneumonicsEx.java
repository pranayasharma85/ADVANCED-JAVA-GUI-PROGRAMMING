import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MneumonicsEx {
JFrame f;
JMenuBar mb;
JMenu m1,m2;
JCheckBoxMenuItem cb1,cb2;
JRadioButtonMenuItem rb1,rb2;
JMenuItem i1,i2;

public MneumonicsEx()
{
    f=new JFrame("Menu example");
    mb=new JMenuBar();
    m1=new JMenu("File");
    m2=new JMenu("Edit");
    cb1=new JCheckBoxMenuItem("Copy");
    cb2=new JCheckBoxMenuItem("Paste");
    rb1=new JRadioButtonMenuItem("Radio1");
    rb2=new JRadioButtonMenuItem("Radio2");

    ButtonGroup bg=new ButtonGroup();
    bg.add(rb1);
    bg.add(rb2);
    i1=new JMenuItem("New", KeyEvent.VK_N);
    i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
    i2=new JMenuItem("Open", KeyEvent.VK_O);
    i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.ALT_DOWN_MASK));

    f.setJMenuBar(mb);
    mb.add(m1);
    mb.add(m2);
    m1.add(i1);
    m1.add(i2);
    m2.add(cb1);
    m2.add(cb2);
    m2.add(rb1);
    m2.add(rb2);
    f.setSize(400,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    i1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(f, "New Menu item is clicked");
            }

    });
    i2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(f, "Open Menu item is clicked");
            }

    });
}
public static void main(String[] args) {
    new MneumonicsEx();

}
    
}
