import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


class ImagePan1 extends JPanel{

    private BufferedImage img;

    public ImagePan1() {
       try {                
          img = ImageIO.read(new File("/home/kirtan/eclipse-workspace/Tic_Tac_toe/img/cover3.jpg"));
       } catch (IOException ex) 
       {
    	   System.out.println("Error : "+ex.getMessage());
       }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);          
    }
}
class MyColorPanel extends JPanel
{
	
	MyColorPanel()
	{	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.black;
        Color color2 = Color.GRAY;
        GradientPaint gp = new GradientPaint(200, 300, color1, 300, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}
/*class ImagePanel11 extends JPanel {

	  private Image img;
	  public ImagePanel11() 
	  {
	    this(new ImageIcon("img/cover3.jpg").getImage());
	  }
//	  public ImagePanel(Image img) {
//	    this.img = img;
//	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
//	    setPreferredSize(size);
//	    setMinimumSize(size);
//	    setMaximumSize(size);
//	    setSize(size);
//	    setLayout(null);
//	  }
	  @Override
	  public void paintComponent(Graphics g) {
	    g.drawImage(img, 0, 0, null);
	  }
}*/

public class first_page extends MyColorPanel implements ActionListener
{
	String lab;
	ButtonGroup G;
	JRadioButton p1;
	JRadioButton p2;
	Image myBackgroundImage;
	JLabel mainname,imgname,name1,name2,name3,name4,circ1,circ2;
	JButton onep;
	JButton twop;
	public first_page() {
		
		setLayout(null);
		
		mainname=new JLabel("Tic Tac Toe");
		mainname.setForeground(Color.MAGENTA);
		mainname.setBorder(null);
		mainname.setLayout(null);
		mainname.setBackground(Color.white);
		mainname.setBounds(380,25,300,30);
		
		URL url = first_page.class.getResource(
                "/img/icon3.png");
		
		imgname=new JLabel();
		imgname.setIcon(new ImageIcon(url));
		imgname.setBounds(60,30,200,200);
		//imgname.setVisible(false);
		//imgname.setDisabledIcon(null);
		//imgname.setBackground(Color.white);
		
		Font f1=new Font("Arial",Font.BOLD,80);
		Font f2=new Font("Arial",Font.PLAIN,20);
		
		mainname.setFont(f2);
		
		name1=new JLabel("X");
		name1.setBorder(null);
		name1.setLayout(null);
		name1.setFont(f1);
		name1.setBackground(Color.black);
		name1.setForeground(Color.cyan);
		name1.setBounds(300,40,100,100);	
		
		name2=new JLabel("O");
		name2.setBorder(null);
		name2.setLayout(null);
		name2.setFont(f1);
		name2.setBackground(Color.black);
		name2.setForeground(Color.white);
		name2.setBounds(370,40,100,100);
		
		name3=new JLabel("X");
		name3.setBorder(null);
		name3.setLayout(null);
		name3.setFont(f1);
		name3.setBackground(Color.black);
		name3.setForeground(Color.CYAN);
		name3.setBounds(450,40,100,100);
		
		name4=new JLabel("O");
		name4.setBorder(null);
		name4.setLayout(null);
		name4.setFont(f1);
		name4.setBackground(Color.BLACK);
		name4.setForeground(Color.white);
		name4.setBounds(520,40,100,100);
		
		Font f3=new Font("Arial",Font.BOLD,38);
		
		URL url1 = first_page.class.getResource(
                "/img/cir2.png");
		
		
		circ1=new JLabel();
		circ1.setLayout(null);
		circ1.setIcon(new ImageIcon(url1));
//		circ1.setContentAreaFilled(false);
//		circ1.setFocusable(false);
//		circ1.setBorderPainted(false);
		circ1.setOpaque(false);
		circ1.setBorder(null);
		circ1.setVisible(false);
		circ1.setBounds(200,275,50,50);
		
		circ2=new JLabel();
		circ2.setLayout(null);
		circ2.setIcon(new ImageIcon(url1));
//		circ2.setContentAreaFilled(false);
//		circ2.setFocusable(false);
//		circ2.setBorderPainted(false);
		circ2.setOpaque(false);
		circ2.setBorder(null);
		circ2.setVisible(false);
		circ2.setBounds(200,375,50,50);
		
		onep=new JButton("One Player");
		onep.setBackground(null);
		onep.setBounds(240,250,300,100);
		onep.setOpaque(false);
		onep.setContentAreaFilled(false);
		onep.setBorderPainted(false);
		onep.setFocusable(false);
		onep.setForeground(Color.decode("#e3a624"));
		onep.setFont(f3);
		
		twop=new JButton("Two Player");
		twop.setBackground(null);
		twop.setBounds(240,350,300,100);
		twop.setOpaque(false);
		twop.setContentAreaFilled(false);
		twop.setBorderPainted(false);
		twop.setFocusable(false);
		twop.setForeground(Color.decode("#e3a624"));
		twop.setFont(f3);
		
		
		onep.setActionCommand("one");
		twop.setActionCommand("two");
		
		onep.addActionListener(this);
		//onep.addMouseListener(this);
		twop.addActionListener(this);
		//twop.addMouseListener(this);
		
		add(mainname);
		add(imgname);
		add(name1);
		add(name2);
		add(name3);
		add(name4);
		add(circ1);
		add(circ2);
		add(onep);
		add(twop);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		lab=ae.getActionCommand();		
	}
	public void mouseClicked(MouseEvent e) 
	{  
		
    }  
    public void mouseEntered(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(onep))
    	{
    		EventSource.setForeground(Color.CYAN);
    		circ1.setVisible(true);
    	}
    	else if(EventSource.equals(twop))
    	{
    		EventSource.setForeground(Color.CYAN);
    		circ2.setVisible(true);
    	}
    } 
    public void mouseExited(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(onep))
    	{
    		EventSource.setForeground(Color.decode("#e3a624"));
    		circ1.setVisible(false);
    	}
    	else if(EventSource.equals(twop))
    	{
    		EventSource.setForeground(Color.decode("#e3a624"));
    		circ2.setVisible(false);
    	}
    }  
    public void mousePressed(MouseEvent e) 
    {
    	
    }  
    public void mouseReleased(MouseEvent e) 
    {
    	
    }  

}
