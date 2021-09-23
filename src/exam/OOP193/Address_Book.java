package exam.OOP193;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Address_Book implements ActionListener {
    JFrame f = new JFrame("Address Book");
    JButton onAction = new JButton("Store Information");
    JLabel l1 = new JLabel("   Name   ");
    JLabel l2 = new JLabel("Phone No");
    JLabel l3 = new JLabel("Address ");
    TextField t1 = new TextField("",30);
    TextField t2 = new TextField("",30);
    TextField t3 = new TextField("",30);

    Address_Book(){
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350,200);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(onAction);
        f.setVisible(true);
        onAction.addActionListener( this);

    }
    public void actionPerformed(ActionEvent e){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/exam/OOP193/data.txt",true));
            bufferedWriter.write(t1.getText()+" "+ t2.getText()+" "+t3.getText()+"\n");
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}


class GuiTest {

    public static void main(String[] args) {
        Address_Book obj = new Address_Book();
    }

}