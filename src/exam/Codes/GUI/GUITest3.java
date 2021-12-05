package Codes.GUI;

import javax.swing.*;
import java.awt.*;

public class GUITest3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        f.setSize(300, 300);

        JButton b = new JButton("Click here");
        b.setBackground(Color.RED);
        b.setForeground(Color.BLUE);

        JPanel p = new JPanel();
        p.setBackground(Color.YELLOW);
        p.add(b);
        f.add(p);

        f.setVisible(true);
    }
}
