package AOOP;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AnimationTest {
    void go(){
        JFrame frame = new JFrame("Image Mover");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        int x = 512-256;
        int y = 512-256;
        int speed = 4;
        int direction = 1;

        JLabel image1 = getImage("images/sample1.png", 256, 256);
        image1.setBounds(x, y, 256, 256);
        frame.add(image1);

        frame.setVisible(true);

        for(int i = 0; i < 300; i++){
            x = x + (speed * direction);
            image1.setBounds(x, y, 256, 256);

            if(x + 256 >=  512) direction = -1;
            if(x <= 0) direction = 1;

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


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
        AnimationTest animationTest = new AnimationTest();
        animationTest.go();
    }
}
