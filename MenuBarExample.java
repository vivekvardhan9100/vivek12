import javax.swing.*;
import java.awt.event.*;

public class MenuBarExample extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem newItem, openItem, exitItem;
    JMenuItem cutItem, copyItem, pasteItem;
    JMenuItem aboutItem;

    public MenuBarExample() {
        setTitle("JFrame with Menu Bar");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");


        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");

     
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();  // separator line
        fileMenu.add(exitItem);

    
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

    
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(this);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);


        JLabel label = new JLabel("Use the menu bar to perform actions.", SwingConstants.CENTER);
        add(label);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(this, "New File Created");
        } else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(this, "Opening File...");
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        } else if (e.getSource() == cutItem) {
            JOptionPane.showMessageDialog(this, "Cut Action Performed");
        } else if (e.getSource() == copyItem) {
            JOptionPane.showMessageDialog(this, "Copy Action Performed");
        } else if (e.getSource() == pasteItem) {
            JOptionPane.showMessageDialog(this, "Paste Action Performed");
        } else if (e.getSource() == aboutItem) {
            JOptionPane.showMessageDialog(this, "This is a menu bar demo.\nVersion 1.0");
        }
    }

    public static void main(String[] args) {
        new MenuBarExample();
    }
}
