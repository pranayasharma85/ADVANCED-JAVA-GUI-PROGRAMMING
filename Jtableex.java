import javax.swing.*;
import java.awt.*;


public class Jtableex {
JFrame f;
JScrollPane sp;
JTable t;
public Jtableex()
{
    f=new JFrame("J table example");
    String [] col={"Roll", "Name", "College"};
    String [][] data={{"101","Ram","RR"}, {"102","shyam","PK"},{"103","kabita","PMC"}};
    t=new JTable(data, col);
    sp=new JScrollPane(t);
    f.add(sp);
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);

}
public static void main(String[] args) {
    new Jtableex();
    
}

}


