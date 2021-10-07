package exam.oop212;

import javax.swing.*;
import java.awt.event.*;
public class GUITest2 implements ActionListener{
    JButton flip, rotate;
    JTextField text;
    GUITest2(){
        JFrame frame = new JFrame("EditMe");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        frame.setSize(280, 150);
        frame.setLocation(300, 200);
        text = new JTextField(10);
        text.setText(">");
        flip = new JButton("Flip");
        rotate = new JButton("Rotate");
        panel.add(flip);
        panel.add(rotate);
        panel.add(text);
        /// 1. Add your code here
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        /// 2. Add your code here
    }
    static String flipMe(String text) {
        if (text.equals(">")) return "<";
        if (text.equals("<")) return ">";
        return text;
    }

    static String rotateMe(String text){
        if(text.equals(">")) return "v";
        if(text.equals("v")) return "<";
        if(text.equals("<")) return "^";
        if(text.equals("^")) return ">";
        return text;
    }
    public static void main(String[] args) {
        new GUITest2();
    }
}
