
package GUIComponents;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {

    ImageIcon img1 = new ImageIcon("GUIComponents/01-ladybug-icon.png");

    JLabel label1 = new JLabel("Label with text");
    

    JLabel label2 = new JLabel(
        "Label with text and Icon", img1, JLabel.LEFT
    );

    JLabel label3 = new JLabel("Label with icon and text bottom");

    public LabelFrame() {

        super("Testing JLabel");

        setLayout(new FlowLayout());

        label1.setToolTipText("This is label1");

        label3.setIcon(img1);
        label3.setToolTipText("This is label3");

        add(label1);
        add(label2);
        add(label3);

        label2.setHorizontalTextPosition(SwingConstants.CENTER);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {

        LabelFrame frame1 = new LabelFrame();

    }
}
