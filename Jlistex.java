
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;

public class Jlistex {
JFrame f;
JList list;
JScrollPane sp;
JLabel l1;

public Jlistex()
{
f=new JFrame("Jlist ex");
l1= new JLabel("color");
String[]cname={"Red", "Green", "Yellow", "Blue"};
Color[] col= {Color.RED, Color.GREEN,Color.YELLOW,Color.BLUE};
list=new JList<>(cname);
list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
list.setVisibleRowCount(3);

sp=new JScrollPane(list);
f.add(l1);
f.add(sp);
f.setSize(300,300);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.setDefaultCloseOperation(3);




list.addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent e)
    {
        f.getContentPane().setBackground(col[list.getSelectedIndex()]);
    }
});
}

public static void main(String[] args) {
    new Jlistex();
    
}
}
