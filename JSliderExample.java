import javax.swing.*;
import java.awt.*;


public class JSliderExample {
JFrame f;
JSlider s;

public JSliderExample(){
    f = new JFrame("JSlider Example");
    s = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
    s.setMajorTickSpacing(2);
    s.setMinorTickSpacing(10);
    s.setPaintTicks(true);
    s.setPaintLabels(true);

    f.setSize(300,300);
    f.setDefaultCloseOperation(3);
    f.setVisible(true);
    f.setLayout(new FlowLayout());

    f.add(s);


}

public static void main(String[] args) {
    new JSliderExample();
}
}
