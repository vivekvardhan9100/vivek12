import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExample extends JFrame {

    public MenuExample() {
        // Window settings
        setTitle("Menu Bar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // ----- File Menu -----
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openNewFileWindow();
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showOpenDialog(MenuExample.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(MenuExample.this, "Opened: " + fileChooser.getSelectedFile().getName());
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // ----- Edit Menu -----
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        cutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuExample.this, "Cut action performed!");
            }
        });

        copyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuExample.this, "Copy action performed!");
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuExample.this, "Paste action performed!");
            }
        });

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // ----- Help Menu -----
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuExample.this, "Menu Example v1.0\nCreated in Java Swing");
            }
        });

        helpMenu.add(aboutItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Attach menu bar
        setJMenuBar(menuBar);

        // Center text
        add(new JLabel("Select a menu option above", SwingConstants.CENTER), BorderLayout.CENTER);
    }

    // Function to open a new file window
    private void openNewFileWindow() {
        JFrame newFrame = new JFrame("New File");
        newFrame.setSize(400, 300);
        newFrame.setLocationRelativeTo(null);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        newFrame.add(scrollPane);

        newFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MenuExample frame = new MenuExample();
                frame.setVisible(true);
            }
        });
    }
}
