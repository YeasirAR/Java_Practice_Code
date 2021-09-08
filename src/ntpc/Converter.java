package ntpc;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.NumberFormat;

public class Converter {
    Frame f;
    TextField tf, tf2;
    Button b1, b2, b3;
    Label l1;
    public Converter(){
        f = new Frame("Currency Calculator");
        f.setLayout(new FlowLayout());
        f.setSize(360, 170);
        l1 = new Label("American Dollar & Bangladeshi  Taka Converter");
        l1.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
        f.add(l1);
        f.add(new Label("BDT:"));
        tf = new TextField(10);
        f.add(tf);
        f.add(new Label("USD:"));
        tf2 = new TextField(10);
        f.add(tf2);
        tf.setText("0");
        tf2.setText("0");

        b1 = new Button("Convert BDT to USD");
        f.add(b1);
        b3 = new Button("Convert USD to BDT");
        f.add(b3);
        b2 = new Button("Clear");
        f.add(b2);

        b1.addActionListener(new Converter.CounterAction1());
        b2.addActionListener(new Converter.CounterAction2());
        b3.addActionListener(new Converter.CounterAction3());
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });


        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Converter();
    }
    public class CounterAction1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            double temp1,temp2;
            NumberFormat n1 = NumberFormat.getInstance();
            n1.setMaximumFractionDigits(2);
            temp1 = Double.parseDouble(tf.getText());
            temp2 = (temp1/84);
            String s1 = String.valueOf(n1.format(temp2));
            tf2.setText(s1);
        }
    }
    public class CounterAction2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tf.setText("0");
            tf2.setText("0");

        }
    }
    public class CounterAction3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double temp3,temp4;
            NumberFormat n2 = NumberFormat.getInstance();
            n2.setMaximumFractionDigits(2);
            temp3 = Double.parseDouble(tf2.getText());
            temp4 = (temp3*84);
            String s2 = String.valueOf(n2.format(temp4));
            tf.setText(s2);

        }
    }

}
