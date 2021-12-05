package Codes.GUI;

import java.awt.*;
import javax.swing.*;

public class Border {
    JFrame f;
    Border(){
        f=new JFrame();
        f.setSize(300,300);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton b1=new JButton("1");;
        JButton b2=new JButton("2");;
        JButton b3=new JButton("3");;
        JButton b4=new JButton("4");;
        JButton b5=new JButton("5");;
        JButton b6=new JButton("6");;
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        JPanel p = new JPanel();
        // p.setLayout(new FlowLayout());
        p.add(b5);
        p.add(b6);
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Border();
    }
}
