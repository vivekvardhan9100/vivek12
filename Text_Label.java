 import javax.swing.*;
 import java.awt.*;
 public class Text_Label{
   public static void main(String args[]){
     JFrame frame=new JFrame("text using label");
     frame.setSize(500,500);
     frame.setBackground(Color.white);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLayout(null);
     JLabel label=new JLabel();
     label.setBounds(0,100,500,50);
     frame.add(label);
     String str="This text is written using a label";
     label.setText(str);
     frame.setVisible(true);
   }
 }