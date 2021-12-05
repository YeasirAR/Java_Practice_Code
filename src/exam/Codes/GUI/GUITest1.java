package Codes.GUI;

import javax.swing.*;

public class GUITest1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500, 300);
        f.setTitle("Simple Frame");

        JCheckBox c = new JCheckBox();
        f.add(c);

        JButton b = new JButton();
        b.setText("Ok");
        f.add(b);

        f.setVisible(true);
    }
}
