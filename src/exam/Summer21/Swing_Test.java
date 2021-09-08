package exam.Summer21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Swing implements ActionListener{
    JFrame f = new JFrame("Class Test Numbers");
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    TextField tf1,tf2,tf3,tf4,tf5;
    JButton b = new JButton();
    JLabel l1,l2,l3,l4,l5;
    Swing(){
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);
        tf4 = new TextField(10);
        tf5 = new TextField(10);
        l1 = new JLabel("ID");
        l2 = new JLabel("Name");
        l3 = new JLabel("CT1");
        l4 = new JLabel("CT2");
        l5 = new JLabel("CT3");
        tf1.setBounds(200,50,150,40);
        l1.setBounds(100,50,150,40);
        b.setText("Calculate");
        b.addActionListener( this);
        f.add(l1);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(b);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String id = tf1.getText();
        String name = tf2.getText();
        try{
            double ct1 = Double.parseDouble(tf3.getText());
            double ct2 = Double.parseDouble(tf4.getText());
            double ct3 = Double.parseDouble(tf5.getText());
            double avg = (ct1+ct2+ct3)/3;
            System.out.println("Your ID is: "+id);
            System.out.println("Your name is: "+name);
            System.out.println("Avg_CT marks: "+avg);
        }
        catch (NumberFormatException ex){
            System.out.println("Please Enter Double Type Value");
        }
    }
}

public class Swing_Test {
    public static void main(String[] args) {
        new Swing();
    }
}
