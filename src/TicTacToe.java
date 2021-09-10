
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    int choice = 0, choice1 = 0, choice2 = 0;
    JFrame f1, f2;
    JPanel p1, p2, p3;
    JButton b1;
    JButton b2;
    JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
    JButton r;
    JLabel l1, pvc, pvp;
    Font font1 = new Font("Myriad Pro", Font.BOLD, 30);
    Font font2 = new Font("", Font.BOLD, 25);
    Font font3 = new Font("", Font.BOLD, 70);

    public TicTacToe() {
        f1 = new JFrame("Player VS Robot");
        f2 = new JFrame("Player VS Player");
        setSize(400, 210);
        setLayout(new FlowLayout());
        f1.setLayout(new FlowLayout());
        f2.setLayout(new FlowLayout());

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel("Select Any To Continue");
        b1 = new JButton("Play  Against  ROBOT");
        b2 = new JButton("Play Against PLAYER");
        r = new JButton("BACK TO MAIN MENU");
        r.setFont(font2);
        pvc = new JLabel("PLAYER VS COMPUTER");
        pvc.setFont(font2);
        pvp = new JLabel("PLAYER VS PLAYER");
        pvp.setFont(font1);
        l1.setFont(font1);
        l1.setForeground(Color.BLUE);
        b1.setFont(font2);
        b2.setFont(font2);

        p1.setLayout(new GridLayout(3, 3, 5, 5));
        bt0 = new JButton("   ");
        bt0.setFont(font3);
        bt1 = new JButton();
        bt1.setFont(font3);
        bt2 = new JButton();
        bt2.setFont(font3);
        bt3 = new JButton();
        bt3.setFont(font3);
        bt4 = new JButton();
        bt4.setFont(font3);
        bt5 = new JButton();
        bt5.setFont(font3);
        bt6 = new JButton();
        bt6.setFont(font3);
        bt7 = new JButton();
        bt7.setFont(font3);
        bt8 = new JButton();
        bt8.setFont(font3);

        p1.add(bt0);
        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        p1.add(bt4);
        p1.add(bt5);
        p1.add(bt6);
        p1.add(bt7);
        p1.add(bt8);

        add(l1);
        add(l1);
        add(b1);
        add(b2);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        r.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == r) {
            f1.setVisible(false);
            f2.setVisible(false);
            setVisible(true);
            bt0.setText("   ");
            bt1.setText("   ");
            bt2.setText("   ");
            bt3.setText("   ");
            bt4.setText("   ");
            bt5.setText("   ");
            bt6.setText("   ");
            bt7.setText("   ");
            bt8.setText("   ");
            setter(0);
            setter1(0);
            setter2(0);
            p3.remove(pvc);
            p3.remove(pvp);


        }
        if (e.getSource() == b1) {
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(false);
            f1.setSize(400, 500);
            p2.add(r);
            p3.add(pvc);
            f1.add(p3);
            f1.add(p1);
            f1.add(p2);
            setter1(1);
        }
        if (e.getSource() == b2) {
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(false);
            f2.setSize(400, 500);
            p2.add(r);
            p3.add(pvp);
            f2.add(p3);
            f2.add(p1);
            f2.add(p2);
            setter2(2);
        }
        if (e.getSource() == bt0 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt0.setText("X");
                setter(choice + 1);
            } else {
                bt0.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt1 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt1.setText("X");
                setter(choice + 1);
            } else {
                bt1.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt2 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt2.setText("X");
                setter(choice + 1);
            } else {
                bt2.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt3 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt3.setText("X");
                setter(choice + 1);
            } else {
                bt3.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt4 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt4.setText("X");
                setter(choice + 1);
            } else {
                bt4.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt5 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt5.setText("X");
                setter(choice + 1);
            } else {
                bt5.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt6 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt6.setText("X");
                setter(choice + 1);
            } else {
                bt6.setText("O");
                setter(choice + 1);
            }
        }
        if (e.getSource() == bt7 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt7.setText("X");
            } else {
                bt7.setText("O");
            }
            setter(choice + 1);
        }
        if (e.getSource() == bt8 && choice2 == 2) {
            if (choice % 2 == 0) {
                bt8.setText("X");
                setter(choice + 1);
            } else {
                bt8.setText("O");
                setter(choice + 1);
            }
        }

        if (choice > 2) {
            if ((bt0.getText().equals("X") && bt1.getText().equals("X") && bt2.getText().equals("X")) ||
                    bt3.getText().equals("X") && bt4.getText().equals("X") && bt5.getText().equals("X") ||
                    bt6.getText().equals("X") && bt7.getText().equals("X") && bt8.getText().equals("X") ||
                    bt0.getText().equals("X") && bt3.getText().equals("X") && bt6.getText().equals("X") ||
                    bt1.getText().equals("X") && bt4.getText().equals("X") && bt7.getText().equals("X") ||
                    bt2.getText().equals("X") && bt5.getText().equals("X") && bt8.getText().equals("X") ||
                    bt0.getText().equals("X") && bt4.getText().equals("X") && bt8.getText().equals("X") ||
                    bt2.getText().equals("X") && bt4.getText().equals("X") && bt6.getText().equals("X")
            ) {
                JOptionPane.showMessageDialog(b2, "X Player WINS");
            }
            if ((bt0.getText().equals("O") && bt1.getText().equals("O") && bt2.getText().equals("O")) ||
                    bt3.getText().equals("O") && bt4.getText().equals("O") && bt5.getText().equals("O") ||
                    bt6.getText().equals("O") && bt7.getText().equals("O") && bt8.getText().equals("O") ||
                    bt0.getText().equals("O") && bt3.getText().equals("O") && bt6.getText().equals("O") ||
                    bt1.getText().equals("O") && bt4.getText().equals("O") && bt7.getText().equals("O") ||
                    bt2.getText().equals("O") && bt5.getText().equals("O") && bt8.getText().equals("O") ||
                    bt0.getText().equals("O") && bt4.getText().equals("O") && bt8.getText().equals("O") ||
                    bt2.getText().equals("O") && bt4.getText().equals("O") && bt6.getText().equals("O")
            ) {
                JOptionPane.showMessageDialog(b2, "O Player WINS");
            }

        }
        if ((e.getSource() == bt0 || e.getSource() == bt1 ||
                e.getSource() == bt2 || e.getSource() == bt3 ||
                e.getSource() == bt4 || e.getSource() == bt5 ||
                e.getSource() == bt6 || e.getSource() == bt7 ||
                e.getSource() == bt8) && (choice1 == 1)) {


            if (e.getSource() == bt0) {
                bt0.setText("X");
            }
            if (e.getSource() == bt1) {
                bt1.setText("X");
            }
            if (e.getSource() == bt2) {
                bt2.setText("X");
            }
            if (e.getSource() == bt3) {
                bt3.setText("X");
            }
            if (e.getSource() == bt4) {
                bt4.setText("X");
            }
            if (e.getSource() == bt5) {
                bt5.setText("X");
            }
            if (e.getSource() == bt6) {
                bt6.setText("X");
            }
            if (e.getSource() == bt7) {
                bt7.setText("X");
            }
            if (e.getSource() == bt8) {
                bt8.setText("X");
            }
            if (!bt3.getText().equals("X") && !bt3.getText().equals("O")) {
                bt3.setText("O");
            } else if (!bt8.getText().equals("X") && !bt8.getText().equals("O")) {
                bt8.setText("O");
            } else if (!bt5.getText().equals("X") && !bt5.getText().equals("O")) {
                bt5.setText("O");
            } else if (!bt2.getText().equals("X") && !bt2.getText().equals("O")) {
                bt2.setText("O");
            } else if (!bt6.getText().equals("X") && !bt6.getText().equals("O")) {
                bt6.setText("O");
            } else if (!bt1.getText().equals("X") && !bt1.getText().equals("O")) {
                bt1.setText("O");
            } else if (!bt7.getText().equals("X") && !bt7.getText().equals("O")) {
                bt7.setText("O");
            } else if (!bt0.getText().equals("X") && !bt0.getText().equals("O")) {
                bt0.setText("O");
            } else if (!bt4.getText().equals("X") && !bt4.getText().equals("O")) {
                bt4.setText("O");
            }
            setter(choice + 1);


        }


    }

    public void setter(int choice) {
        this.choice = choice;

    }

    public void setter2(int choice2) {
        this.choice2 = choice2;

    }

    public void setter1(int choice1) {
        this.choice1 = choice1;

    }


    public static void main(String[] args) {
        new TicTacToe();
    }
}
