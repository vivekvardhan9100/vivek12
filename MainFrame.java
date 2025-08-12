import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Main Frame");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnOpenFrame1 = new JButton("Open Frame 1");
        btnOpenFrame1.setBounds(50, 40, 200, 30);
        add(btnOpenFrame1);


        JButton btnOpenFrame2 = new JButton("Open Frame 2");
        btnOpenFrame2.setBounds(50, 90, 200, 30);
        add(btnOpenFrame2);

     
        btnOpenFrame1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameOne().setVisible(true);
            }
        });

        btnOpenFrame2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FrameTwo().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}


class FrameOne extends JFrame {
    public FrameOne() {
        setTitle("Frame 1");
        setSize(250, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(new JLabel("This is Frame 1", SwingConstants.CENTER));
    }
}


class FrameTwo extends JFrame {
    public FrameTwo() {
        setTitle("Frame 2");
        setSize(250, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(new JLabel("This is Frame 2", SwingConstants.CENTER));
    }
}
