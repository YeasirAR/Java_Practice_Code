package exam.fall20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Oceans App");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        String[] oceans = {"Arctic", "North Atlantic", " South Atlantic",
                " Indian", " North Pacific", "South Pacific", " Antarctic"};

        JTextField tf1 = new JTextField(20);
        JTextField tf2 = new JTextField(20);
        JButton b = new JButton("Show");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i= Integer.parseInt(tf1.getText());
                tf2.setText(oceans[i]);
            }
        });
        f.add(tf1);
        f.add(tf2);
        f.add(b);
        f.setVisible(true);
    }
}
