import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;


public class jDialogBox {
JFrame f;
JDialog d;
JButton b;
public jDialogBox()
{
    f=new JFrame();
    d=new JDialog(f,"Dialog box example",true);
    b=new JButton("Click me");
    
    d.setLayout(new FlowLayout());
    d.add(new JLabel("Press click me to continue"));
    d.add(b);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            d.setVisible(false);
        }
        
    });
    d.setSize(200,200);
    d.setVisible(true);
}
public static void main(String[] args) {
    new jDialogBox();
}
}
