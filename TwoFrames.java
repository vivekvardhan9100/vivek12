import javax.swing.*;
import java.awt.*;

public class TwoFrames {
    public static void main(String[] args) {
        // First frame
        JFrame frame1 = new JFrame("Frame 1");
        frame1.setSize(500, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        JLabel label1 = new JLabel("This text is written using a label");
        label1.setBounds(0, 100, 500, 50);
        frame1.add(label1);
        frame1.setVisible(true);

        // Second frame
        JFrame frame2 = new JFrame("Frame 2");
        frame2.setSize(300, 200);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setLayout(null);
        JLabel label2 = new JLabel("This is a label in Frame 2");
        label2.setBounds(10, 50, 280, 30);
        frame2.add(label2);
        frame2.setLocation(frame1.getX() + frame1.getWidth() + 10, frame1.getY());
        frame2.setVisible(true);
    }
}
