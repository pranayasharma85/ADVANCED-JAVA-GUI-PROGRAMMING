import javax.swing.*;
import java.awt.*;

public class TooltipDemo extends JFrame {
    public TooltipDemo() {
        // Set up the frame
        setTitle("Tooltip Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a button with a tooltip
        JButton button = new JButton("Hover over me");
        button.setToolTipText("This is a button tooltip");

        // Create a label with a tooltip
        JLabel label = new JLabel("Hover over this text");
        label.setToolTipText("This is a label tooltip");

        // Create a text field with a tooltip
        JTextField textField = new JTextField("Hover over this text field", 20);
        textField.setToolTipText("This is a text field tooltip");

        // Set layout manager and add components
        setLayout(new FlowLayout());
        add(button);
        add(label);
        add(textField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TooltipDemo().setVisible(true);
            }
        });
    }
}
