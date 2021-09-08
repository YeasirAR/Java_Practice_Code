package exam.fall20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILogin extends JFrame implements ActionListener {
    JLabel j1,j2;
    JTextField t;
    JPasswordField p;
    JButton b;
    GUILogin(){
        setSize(250,250);
        setTitle("Login");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        j1 = new JLabel("Username");
        j2 = new JLabel("Password");
        t = new JTextField(10);
        p = new JPasswordField(10);
        b = new JButton("Sign In");
        b.addActionListener(this);
        add(j1);
        add(t);
        add(j2);
        add(p);
        add(b);
        setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(t.getText().equals("admin") && p.getText().equals("1234")){
            System.out.println("Login Successful");
    }
        else
        {
            System.out.println("Try Again");
        }


    }

    public static void main(String[] args) {
        new GUILogin();
    }

}
