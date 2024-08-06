import javax.swing.*;
public class preBuiltDialogBox
{
    public static void main(String[] args) {
        int p=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Principle"));
        int t=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter time"));
        int r=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Rate"));
        int si=(p*t*r)/100;

        JOptionPane.showMessageDialog(null,"Simple Interest is "+si);
        
    }

}