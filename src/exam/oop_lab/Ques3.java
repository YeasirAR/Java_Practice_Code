package exam.oop_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class RoboticsT implements ActionListener {
    JFrame f = new JFrame(" Robotics Tournament");
    JFrame f2 = new JFrame(" Robotics Tournament");
    JFrame f3 = new JFrame(" Robotics Tournament");
    JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("ID:");
    JLabel l3 = new JLabel("Marks:");
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JButton btn = new JButton("Add");
    JButton btn2 = new JButton("Show");
    JTextArea ta = new JTextArea();
    JTextArea ta2 = new JTextArea();
    JLabel l4 = new JLabel("Show Winner");
    JButton btn3 = new JButton("Show Winner");
    RoboticsT(){
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(180,250);
        f2.setLayout(new FlowLayout());
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f2.setSize(300,350);
        f2.add(ta);
        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tf3);
        f.add(btn);
        f.add(btn2);
        f2.add(btn3);
        f2.add(ta2);
        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        f.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<Tst> arr = new ArrayList<>();
        if(e.getSource() ==btn){
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("src/exam/oop212/data.txt",true));
                bw.write(tf1.getText()+" "+tf2.getText()+" "+tf3.getText()+"\n");
                bw.close();
            } catch (IOException ea) {
                ea.printStackTrace();
            }
        }
        if(e.getSource() ==btn2){
            f.setVisible(false);
            f2.setVisible(true);
            try {
                Scanner sc = new Scanner(new File("src/exam/oop212/data.txt"));
                while (sc.hasNext()){
                    arr.add(new Tst(sc.next(), sc.nextInt(), sc.nextDouble()));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            arr.sort(new Comparator<Tst>() {
                @Override
                public int compare(Tst o1, Tst o2) {
                    if(o1.marks > o2.marks){
                        return -1;
                    }
                    return 1;
                }
            });
            for(Tst t: arr){
                ta.append(t.name+" "+t.id+" "+t.marks+"\n");
            }

        }
        if(e.getSource() ==btn3){
            try {
                Scanner sc = new Scanner(new File("src/exam/oop212/data.txt"));
                while (sc.hasNext()){
                    arr.add(new Tst(sc.next(), sc.nextInt(), sc.nextDouble()));
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            arr.sort(new Comparator<Tst>() {
                @Override
                public int compare(Tst o1, Tst o2) {
                    if(o1.marks > o2.marks){
                        return -1;
                    }
                    return 1;
                }
            });
            double maxMark = arr.get(0).marks;
            for(Tst t: arr){
                if(maxMark != t.marks){
                    break;
                }
                ta2.append(t.name+" "+t.id+" "+t.marks+"\n");
            }
        }
    }

    public static void main(String[] args) {
        new RoboticsT();

    }
}
class Tst{
    String name;
    int id;
    double marks;

    public Tst(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

}