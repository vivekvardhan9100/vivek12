import javax.swing.*;
import java.awt.event.*;

public class WindowEventDemo extends JFrame implements WindowListener {

    public WindowEventDemo() {
        setTitle("Window Event Demo");
        setSize(400, 200);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Perform window actions and check the console.", SwingConstants.CENTER);
        add(label);

       
        addWindowListener(this);

        setVisible(true);
    }



    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized (iconified)");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window restored (deiconified)");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated (focused)");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated (lost focus)");
    }

    public static void main(String[] args) {
        new WindowEventDemo();
    }
}
