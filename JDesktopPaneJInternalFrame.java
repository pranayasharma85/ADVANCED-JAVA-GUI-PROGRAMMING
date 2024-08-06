

import javax.swing.*;
import java.awt.*;

public class JDesktopPaneJInternalFrame {
JFrame mf;
JDesktopPane dp;
JInternalFrame f1,f2;

public JDesktopPaneJInternalFrame()
{
    mf=new JFrame("MDI App");
    dp=new JDesktopPane();

    mf.add(dp);
    f1=new JInternalFrame("Internal 1",true,true,true,true);
    f2=new JInternalFrame("Internal 2",true,true,true,true);

    f1.setSize(200,200);
    f2.setSize(200,200);
    f1.setVisible(true);
    f2.setVisible(true);
    f1.add(new JLabel("Frame 1"));
    f2.add(new JLabel("Frame 2"));
    dp.add(f1);
    dp.add(f2);

    mf.setSize(500,500);
    mf.setVisible(true);
    mf.setDefaultCloseOperation(3);
    // mf.setLayout(new FlowLayout());
}
public static void main(String[] args) {
    new JDesktopPaneJInternalFrame();
    
}
}
