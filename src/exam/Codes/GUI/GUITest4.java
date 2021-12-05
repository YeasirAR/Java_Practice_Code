package Codes.GUI;

import javax.swing.*;
import java.awt.*;

public class GUITest4 extends JFrame {
    GUITest4(int w, int h) {
        super("My Frame");
        setSize(w, h);

        JButton b = new JButton("Click here");
        b.setBackground(Color.RED);
        b.setForeground(Color.BLUE);

        JPanel p = new JPanel();
        p.setBackground(Color.YELLOW);
        p.add(b);

        add(p);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUITest4(500, 500);
        new GUITest4(100, 100);
    }
}
