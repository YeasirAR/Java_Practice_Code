package AOOP;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class star {
    void go(){
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JLabel img1 = readImage("src/AOOP/star.png", 50, 50);

        // YOUR CODE HERE
        int x = 300-50;
        int y = 300-50;
        int speed = 4;
        int dir = 1;
        img1.setBounds(x, y, 50, 50);

        for(int i = 0; i < 200; i++){
            x = x + (speed * dir);
            img1.setBounds(x, y, 50, 50);

            if(x + 50 >=  300) dir = -1;
            if(x <= 0) dir = 1;

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //


    }


    JLabel readImage(String imagePath, int width, int height){
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));


            Image imageScaled = image.getScaledInstance(width, height,
                    Image.SCALE_SMOOTH);


            return new JLabel(new ImageIcon(imageScaled));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        new star().go();
    }
}