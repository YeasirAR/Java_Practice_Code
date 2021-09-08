package AOOP;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class KeyboardTest {
    int xpos = 128;
    int ypos = 128;
    int speed = 4;
    void go(){
        JFrame frame = new JFrame("Image Mover");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel image1 = getImage("images/sample1.png", 256, 256);
        image1.setBounds(xpos, ypos, 256, 256);
        frame.add(image1);

//        JLabel image2 = getImage("images/sample2.png", 128, 128);
//        image2.setBounds(300, 100, 128, 128);
//        frame.add(image2);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char pressedKey = e.getKeyChar();
                System.out.println(pressedKey);

                // Move image left
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

    JLabel getImage(String filePath, int width, int height){
        try{
            BufferedImage brImage = ImageIO.read(new File(filePath));

            Image sampleImage = brImage.getScaledInstance(width, height,
                    Image.SCALE_SMOOTH);

            return new JLabel(new ImageIcon(sampleImage));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        KeyboardTest keyboardTest = new KeyboardTest();
        keyboardTest.go();
    }
}
