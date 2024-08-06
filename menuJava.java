import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class menuJava implements ActionListener {

    JFrame f;
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5,i6;

    public menuJava(){
        f=new JFrame("Menu Bar");
        mb=new JMenuBar();
        m1=new JMenu("File");
        m2=new JMenu("Edit");
        i1=new JMenuItem("New");
        i2=new JMenuItem("Open");
        i3=new JMenuItem("Save");
        i4=new JMenuItem("Paste");
        i5=new JMenuItem("Undo");
        i6=new JMenuItem("Redo");
        
        
        f.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m2.add(i4);
        m2.add(i5);
        m2.add(i6);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);

        }
        public void actionPerformed(ActionEvent e){
            if(e.getActionCommand()=="New")
            JOptionPane.showMessageDialog(f, "New menu item is clicked");
            if(e.getActionCommand()=="Open")
            JOptionPane.showMessageDialog(f, "Open menu item is clicked");
            if(e.getActionCommand()=="Save")
            JOptionPane.showMessageDialog(f, "Save menu item is clicked");
            if(e.getActionCommand()=="Paste")
            JOptionPane.showMessageDialog(f, "Paste menu item is clicked");
            if(e.getActionCommand()=="Undo")
            JOptionPane.showMessageDialog(f, "Undo menu item is clicked");
            if(e.getActionCommand()=="Redo")
            JOptionPane.showMessageDialog(f, "Redo menu item is clicked");
            
            }
            public static void main(String[] args) {
                new menuJava();
                }


    }

    

