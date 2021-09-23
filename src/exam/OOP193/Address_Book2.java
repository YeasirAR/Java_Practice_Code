package exam.OOP193;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Address_Book2 implements ActionListener {
    JFrame f = new JFrame("Address Book");
    JButton onAction = new JButton("Print Sorted Information");
    JTextArea ta = new JTextArea(13,20);

    Address_Book2(){
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350,350);
        f.add(ta);
        f.add(onAction);
        f.setVisible(true);
        onAction.addActionListener( this);

    }
    public void actionPerformed(ActionEvent e){
        try {
            Scanner s = new Scanner(new File("src/exam/OOP193/data.txt"));

            while (s.hasNext()) {
                ta.setText(s.nextLine());
            }
            s.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}


class GuiTest2 {

    public static void main(String[] args) {
        Address_Book2 obj = new Address_Book2();
    }

}
