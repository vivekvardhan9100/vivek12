import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class GreetingFrame extends JFrame implements ActionListener {
    JButton greetButton;
    JLabel messageLabel;

    public GreetingFrame() {
        setTitle("Time-Based Greeting");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        greetButton = new JButton("Click Me");
    messageLabel = new JLabel("Click the button to get a greeting");

        add(greetButton);
add(messageLabel);

greetButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
       
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY); 

        if (hour < 12) {
            messageLabel.setText("Good Morning!");
        } else if (hour < 17) {
            messageLabel.setText("Good Afternoon!");
        } else {
            messageLabel.setText("Good Evening!");
        }
    }

    public static void main(String[] args) {
        new GreetingFrame();
    }
}

