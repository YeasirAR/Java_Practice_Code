package AOOP;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(512, 512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        try{
            BufferedImage brImage = ImageIO.read(new File("src/AOOP/sample1.png"));

            Image sampleImage = brImage.getScaledInstance(256, 256, Image.SCALE_SMOOTH);

            JLabel imageLabel = new JLabel(new ImageIcon(sampleImage));

            imageLabel.setBounds(0, 0, 256, 256);

            frame.add(imageLabel);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        frame.setVisible(true);


    }
}
