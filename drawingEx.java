

import javax.swing.*;
import java.awt.*;

public class drawingEx  extends Canvas{

public static void main(String[] args) {
    JFrame frame = new JFrame("Drawing Example");
    Canvas c=new drawingEx();

    c.setSize(400,400);
    frame.add(c);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(3);


    

}

@Override
public void paint(Graphics g) {
    g.setColor(Color.BLUE);
    g.drawLine(20, 20, 100, 15);
    g.drawRect(30, 60, 100, 80);
    g.setColor(Color.RED);
    g.fillOval(30, 180, 50 , 50);

    int[]x={50,100,150};
    int[]y={150,200,150};

    g.setColor(Color.ORANGE);
    g.fillPolygon(x,y,3);
    g.setColor(Color.BLACK);

    Font f=new Font("monospace",Font.BOLD,25);
    g.setFont(f);
    g.drawString("This is the drawing example", 20, 250);


}
    
}
