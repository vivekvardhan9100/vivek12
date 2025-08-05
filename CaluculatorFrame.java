import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends JFrame implements ActionListener {

    JTextField number1Field, number2Field, resultField;
    JButton addButton, subButton, mulButton, divButton;

    public CalculatorFrame() {
     
        setTitle("Basic Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Enter Number 1:");
        JLabel num2Label = new JLabel("Enter Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        number1Field = new JTextField();
        number2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false); // Make result field read-only

        addButton = new JButton("Add (+)");
        subButton = new JButton("Subtract (-)");
        mulButton = new JButton("Multiply (×)");
        divButton = new JButton("Divide (÷)");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Add components to frame
        add(num1Label);     add(number1Field);
        add(num2Label);     add(number2Field);
        add(resultLabel);   add(resultField);
        add(addButton);     add(subButton);
        add(mulButton);     add(divButton);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subButton) {
                result = num1 - num2;
            } else if (e.getSource() == mulButton) {
                result = num1 * num2;
            } else if (e.getSource() == divButton) {
                if (num2 == 0) {
                    resultField.setText("Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input!");
        }
    }

    public static void main(String[] args) {
        new CalculatorFrame();
    }
}
