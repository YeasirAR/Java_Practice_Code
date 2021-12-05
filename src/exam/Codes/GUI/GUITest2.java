package Codes.GUI;

import javax.swing.*;
import java.awt.*;

public class GUITest2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("AWT Test");
        f.setSize(600, 300);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Label 1");
        JTextField tf = new JTextField(10);

        JButton b1 = new JButton();
        b1.setText("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(l);
        p1.add(tf);
        p2.add(b1); p2.add(b2); p2.add(b3);

        f.add(p1);
        f.add(p2);

        f.setVisible(true);
    }
}
