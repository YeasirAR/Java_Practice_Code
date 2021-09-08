import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame {

    CurrencyConverter(String n){
        super(n);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(340,150);
        JPanel p = new JPanel();
        JLabel l11= new JLabel("Currency Converter For USD TO Bangladeshi TAKA  ");
        p.add(l11);
        JLabel l1= new JLabel("USD:");
        p.add(l1);
        JTextField usd = new JTextField("0.0", 7);
        p.add(usd);
        JLabel l2= new JLabel("    BDT:");
        p.add(l2);
        JTextField bdt = new JTextField("0.0", 7);
        p.add(bdt);
        JButton b1 = new JButton("CLICK TO CONVERT");
        p.add(b1);
        JButton b2 = new JButton("RESET");
        p.add(b2);
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String str1 = usd.getText();
                int n = Integer.parseInt(str1);
                n = n*85;
                str1= n +"";
                bdt.setText(str1);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usd.setText("0");
                bdt.setText("0");
            }
        });
        setContentPane(p);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CurrencyConverter("CurrencyConverter");
    }
}