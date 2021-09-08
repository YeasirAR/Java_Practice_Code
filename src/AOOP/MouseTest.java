package AOOP;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MouseTest  {
    void go(){
        JFrame frame = new JFrame("Image Mover");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel image1 = getImage("images/sample1.png", 256, 256);
        image1.setBounds(128, 128, 256, 256);
        frame.add(image1);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX() - 8;
                int y = e.getY() - 31;

                image1.setBounds(x, y, 256, 256);
            }
        });

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX() - 8;
                int y = e.getY() - 31;

                image1.setBounds(x, y, 256, 256);
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
        MouseTest mouseTest = new MouseTest();
        mouseTest.go();
    }
}
