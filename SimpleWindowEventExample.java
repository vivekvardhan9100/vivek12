import javax.swing.*;

import java.awt.event.*;

public class SimpleWindowEventExample extends JFrame implements WindowListener {

  public SimpleWindowEventExample() {

    setTitle("Window Event Demo");

    setSize(400, 250);

    setLocationRelativeTo(null); // Center the frame

    addWindowListener(this);

    JLabel label = new JLabel("Window demo");

    add(label);

    setVisible(true);

  }

  @Override

  public void windowOpened(WindowEvent e) {

    System.out.println("Window Opened");

  }

  @Override

  public void windowClosing(WindowEvent e) {

    System.out.println("Window Closing...");

    dispose(); // Close the frame

    System.exit(0); // Terminate the program

  }

  @Override

  public void windowClosed(WindowEvent e) {

    System.out.println("Window Closed");

  }

  @Override

  public void windowIconified(WindowEvent e) {

    System.out.println("Window Minimized");

  }

  @Override

  public void windowDeiconified(WindowEvent e) {

    System.out.println("Window Restored");

  }

  @Override

  public void windowActivated(WindowEvent e) {

    System.out.println("Window Activated");

  }

  @Override

  public void windowDeactivated(WindowEvent e) {

    System.out.println("Window Deactivated");

  }

  public static void main(String[] args) {

    new SimpleWindowEventExample();

  }

}

























