package exam;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Car{
    private int speed;

    public Car(){
        speed = 0;
    }

    public void accelerate(){
        speed = speed + 10;
    }

    public void fastAccelerate(){
        speed = speed + 20;
    }

    public void brake(){
        speed = speed / 2;
    }

    public int getSpeed(){
        return speed;
    }
}


class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar()=='s'){
                    System.out.println("What a fine morning!");
                }
                else{
                    System.out.println("It is very hot today!");
                }
            }
        });
        frame.setVisible(true);
    }
}