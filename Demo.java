import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Demo extends JFrame {

 JRadioButton rb1, rb2, rb3;

 ButtonGroup bg;

 JComboBox<String> countryBox;

 JTextArea addressArea;

 JButton submitBtn;

 public Demo() {

  setTitle("Radio Button, Dropdown, TextArea Demo");

  setSize(400, 300);

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  setLayout(new FlowLayout());

  // Radio Buttons

  rb1 = new JRadioButton("Male");

  rb2 = new JRadioButton("Female");

  rb3 = new JRadioButton("Other");

  bg = new ButtonGroup();

  bg.add(rb1);

  bg.add(rb2);

  bg.add(rb3);

  add(new JLabel("Select Gender:"));

  add(rb1);

  add(rb2);

  add(rb3);

  //ComboBox

  String countries[] = {"India", "USA", "UK", "Canada", "Australia"};

  countryBox = new JComboBox<>(countries);

  add(new JLabel("Select Country:"));

  add(countryBox);

  // Text Area

  addressArea = new JTextArea(3, 20);

  JScrollPane scroll = new JScrollPane(addressArea);

  add(new JLabel("Enter Address:"));

  add(scroll);

  // Submit Button

  submitBtn = new JButton("Submit");

  add(submitBtn);

  // Action Listener for Submit

  submitBtn.addActionListener(new ActionListener() {

   public void actionPerformed(ActionEvent e) {

    String gender = "";

    if (rb1.isSelected()) gender = "Male";

    else if (rb2.isSelected()) gender = "Female";

    else if (rb3.isSelected()) gender = "Other";

    else gender = "Not selected";

    String country = (String) countryBox.getSelectedItem();

    String address = addressArea.getText();

    JOptionPane.showMessageDialog(null,

      "Gender: " + gender +

      "\nCountry: " + country +

      "\nAddress: " + address,

      "Your Selection", JOptionPane.INFORMATION_MESSAGE);

   }

  });

  setVisible(true);

 }

 public static void main(String[] args) {

  new Demo();

 }

}