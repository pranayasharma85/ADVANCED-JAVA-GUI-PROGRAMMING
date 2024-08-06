
import javax.swing.*;
import java.awt.event.*;


public class example3Keylistener implements KeyListener{
    JFrame f;
    JLabel l1;
    JTextArea t1;

    public example3Keylistener()
    {
        f=new JFrame("Key event example");
        l1=new JLabel("Total Character:");
        t1=new JTextArea();
        t1.setLineWrap(true);
        t1.setWrapStyleWord(true);

        f.setSize(600,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);

        l1.setBounds(20,20,200,20);
        t1.setBounds(20,50,540,400);
        

        f.add(l1);
        f.add(t1);

        t1.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        updateCharCount();

    }
    @Override
    public void keyPressed(KeyEvent e)
    {

    }
    public void keyReleased(KeyEvent e)
    {

    }

    private void updateCharCount()
    {
        int n1=t1.getText().length();
        l1.setText("Total Character:"+n1);

    
    }

    public static void main(String[] args) {
        new example3Keylistener();
        
    }
    
}
