
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MouseTest {
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


        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                xpos = e.getX()-8;
                ypos = e.getY()-31;
                image1.setBounds(xpos, ypos, 256, 256);

            }
        });
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                xpos = e.getX()-8;
                ypos = e.getY()-31;
                image1.setBounds(xpos, ypos, 256, 256);

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