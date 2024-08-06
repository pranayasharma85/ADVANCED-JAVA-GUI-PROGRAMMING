
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class choiceElement implements ItemListener {
    
    JFrame f;
    JLabel l1,l2;
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2;
    
    public choiceElement()
    {
        f = new JFrame("Choice Elements");
        l1=new JLabel("Program:");
        l2=new JLabel("Shift: ");
        c1=new JCheckBox("BCA");
        c2=new JCheckBox("CSIT");
        c3=new JCheckBox("BIT");
        r1=new JRadioButton("Morning");
        r2=new JRadioButton("Day");

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridLayout(2,2));
        
        f.add(l1);f.add(c1);f.add(c2);f.add(c3);
        f.add(l2);
        f.add(r1);
        f.add(r2);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);



    }

    public void itemStateChanged(ItemEvent e)
    {
        if(c1.isSelected())
        JOptionPane.showMessageDialog(f,"BCA is selected");
        if(c2.isSelected())
        JOptionPane.showMessageDialog(f,"CSIT is selected");
        if(c3.isSelected())
        JOptionPane.showMessageDialog(f,"BIT is selected");

        if(r1.isSelected())
        JOptionPane.showMessageDialog(f,"Morning Shift is selected");
        if(r2.isSelected())
        JOptionPane.showMessageDialog(f,"Day Shift is selected");


    }
    public static void main(String[] args) {
        new choiceElement();
    }
}
