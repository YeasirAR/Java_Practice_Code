package exam.oop212;

import javax.swing.*;
import java.awt.*;

class GUITest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JPanel bigPanel = new JPanel();
        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        JLabel label = new JLabel("Label 1");
        JTextField tf = new JTextField(15);

        topPanel.add(label);
        topPanel.add(tf);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        bottomPanel.add(button1);
        bottomPanel.add(button2);
        bottomPanel.add(button3);

//        bigPanel.add(topPanel);
//        bigPanel.add(bottomPanel);
//
//        frame.add(bigPanel);
//        frame.setContentPane(topPanel);
//        frame.setContentPane(bottomPanel);
//        frame.add(topPanel);
//        frame.add(bottomPanel);
//        frame.add(label);
//        frame.add(tf);
//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
        frame.setVisible(true);
    }
}
