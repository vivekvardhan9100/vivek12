import javax.swing.*;
import java.awt.*;

public class LayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FlowLayoutFrame();
                new BorderLayoutFrame();
                new GridLayoutFrame();
                new NullLayoutFrame();
            }
        });
    }
}

class FlowLayoutFrame extends JFrame {
    public FlowLayoutFrame() {
        setTitle("FlowLayout Example");
        setLayout(new FlowLayout());

        for (int i = 1; i <= 5; i++) {
            add(new JButton("Button " + i));
        }

        setSize(300, 100);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


class BorderLayoutFrame extends JFrame {
    public BorderLayoutFrame() {
        setTitle("BorderLayout Example");
        setLayout(new BorderLayout());

        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);

        setSize(400, 200);
        setLocation(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


class GridLayoutFrame extends JFrame {
    public GridLayoutFrame() {
        setTitle("GridLayout Example");
        setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        for (int i = 1; i <= 6; i++) {
            add(new JButton("Button " + i));
        }

        setSize(400, 200);
        setLocation(100, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


class NullLayoutFrame extends JFrame {
    public NullLayoutFrame() {
        setTitle("Null Layout Example");
        setLayout(null); // No layout manager

        JButton b1 = new JButton("Button 1");
        b1.setBounds(50, 30, 100, 30);
        add(b1);

        JButton b2 = new JButton("Button 2");
        b2.setBounds(200, 80, 100, 30);
        add(b2);

        setSize(400, 200);
        setLocation(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
