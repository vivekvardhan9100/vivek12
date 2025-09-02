import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class databasedemo1 extends JFrame implements ActionListener {

    JTextField idField, nameField, ageField, numberField, salaryField;
    JButton insertBtn;
    Connection con;

    public databasedemo1() {
        setTitle("Employee Database");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2));  // Updated rows for 5 fields + button
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Employee Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Employee Age:"));
        ageField = new JTextField();
        add(ageField);

        add(new JLabel("Employee Number:"));
        numberField = new JTextField();
        add(numberField);

        add(new JLabel("Employee Salary:"));
        salaryField = new JTextField();
        add(salaryField);

        insertBtn = new JButton("Insert");
        add(insertBtn);

        // To fill grid properly (button takes one cell)
        add(new JLabel(""));

        insertBtn.addActionListener(this);

        connectDB();
    }

    private void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "1234");
            System.out.println("Connected to MySQL DB");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DB Connection Failed: " + e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int eid = Integer.parseInt(idField.getText());
            String ename = nameField.getText();
            int eage = Integer.parseInt(ageField.getText());
            String enumber = numberField.getText();
            double esalary = Double.parseDouble(salaryField.getText());

            if (ae.getSource() == insertBtn) {
                PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO empdata (eid, ename, eage, enumber, esalary) VALUES (?, ?, ?, ?, ?)"
                );
                pst.setInt(1, eid);
                pst.setString(2, ename);
                pst.setInt(3, eage);
                pst.setString(4, enumber);
                pst.setDouble(5, esalary);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Inserted");
                pst.close();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new databasedemo1().setVisible(true);
    }
}
