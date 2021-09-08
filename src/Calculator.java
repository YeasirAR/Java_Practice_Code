import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    JFrame frame;
    JTextField textfield;
    JButton[] number = new JButton[10];
    JButton[] f = new JButton[9];
    JButton add, sub, mul, div;
    JButton decButton, equ, del, clr, neg;
    JPanel panel;

    Font font1 = new Font("", Font.BOLD, 30);

    double n1 = 0, n2 = 0, r = 0;
    char operator;

    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(font1);
        textfield.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        decButton = new JButton(".");
        equ = new JButton("=");
        del = new JButton("Del");
        clr = new JButton("Clr");
        neg = new JButton("(-)");

        f[0] = add;
        f[1] = sub;
        f[2] = mul;
        f[3] = div;
        f[4] = decButton;
        f[5] = equ;
        f[6] = del;
        f[7] = clr;
        f[8] = neg;

        for (int i = 0; i < 9; i++) {
            f[i].addActionListener(this);
            f[i].setFont(font1);
            f[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            number[i] = new JButton(String.valueOf(i));
            number[i].addActionListener(this);
            number[i].setFont(font1);
            number[i].setFocusable(false);
        }

        neg.setBounds(50, 430, 100, 50);
        del.setBounds(150, 430, 100, 50);
        clr.setBounds(250, 430, 100, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(number[1]);
        panel.add(number[2]);
        panel.add(number[3]);
        panel.add(add);
        panel.add(number[4]);
        panel.add(number[5]);
        panel.add(number[6]);
        panel.add(sub);
        panel.add(number[7]);
        panel.add(number[8]);
        panel.add(number[9]);
        panel.add(mul);
        panel.add(decButton);
        panel.add(number[0]);
        panel.add(equ);
        panel.add(div);

        frame.add(panel);
        frame.add(neg);
        frame.add(del);
        frame.add(clr);
        frame.add(textfield);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == number[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == add) {
            n1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
        }
        if (e.getSource() == sub) {
            n1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
        }
        if (e.getSource() == mul) {
            n1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
        }
        if (e.getSource() == div) {
            n1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
        }
        if (e.getSource() == equ) {
            n2 = Double.parseDouble(textfield.getText());

            switch (operator) {
                case '+':
                    r = n1 + n2;
                    break;
                case '-':
                    r = n1 - n2;
                    break;
                case '*':
                    r = n1 * n2;
                    break;
                case '/':
                    r = n1 / n2;
                    break;
            }
            textfield.setText(String.valueOf(r));
            n1 = r;
        }
        if (e.getSource() == clr) {
            textfield.setText("");
        }
        if (e.getSource() == del) {
            String string = textfield.getText();
            textfield.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textfield.setText(textfield.getText() + string.charAt(i));
            }
        }
        if (e.getSource() == neg) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));
        }
    }
}
