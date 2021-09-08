import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyColorPanel1 extends JPanel
{
	
	MyColorPanel1()
	{	}
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = Color.black;
        Color color2 = Color.GRAY;
        GradientPaint gp = new GradientPaint(200, 300, color1, 200, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }

}


public class second extends MyColorPanel1 implements ActionListener
{
	String lab;
	JLabel pname1,pname2,name1,name2,name3,name4;
	static JTextField pf1,pf2;
	int count;
	JButton play,home;
	second(int c)
	{
		count=c;
		
		setLayout(null);
		setVisible(false);
		
		Font f1=new Font("Arial",Font.BOLD,100);
		Font f2=new Font("Arial",Font.PLAIN,35);
		
		name1=new JLabel("X");
		name1.setBorder(null);
		name1.setLayout(null);
		name1.setFont(f1);
		name1.setBackground(Color.black);
		name1.setForeground(Color.cyan);
		name1.setBounds(220,40,100,100);	
		
		name2=new JLabel("O");
		name2.setBorder(null);
		name2.setLayout(null);
		name2.setFont(f1);
		name2.setBackground(Color.black);
		name2.setForeground(Color.white);
		name2.setBounds(310,40,100,100);
		
		name3=new JLabel("X");
		name3.setBorder(null);
		name3.setLayout(null);
		name3.setFont(f1);
		name3.setBackground(Color.black);
		name3.setForeground(Color.CYAN);
		name3.setBounds(410,40,100,100);
		
		name4=new JLabel("O");
		name4.setBorder(null);
		name4.setLayout(null);
		name4.setFont(f1);
		name4.setBackground(Color.BLACK);
		name4.setForeground(Color.white);
		name4.setBounds(500,40,100,100);
		
		Font f3=new Font("Arial",Font.PLAIN,20);
		
		
		pname1=new JLabel("Player1 Name: ");
		if(count==1)
		{
			pname1.setText("Player Name: ");
		}
		pname1.setBorder(null);
		pname1.setLayout(null);
		pname1.setFont(f2);
		pname1.setOpaque(false);
		pname1.setForeground(Color.cyan);
		pname1.setBounds(100,250,300,70);
		
		pname2=new JLabel("Player2 Name: ");
		pname2.setBorder(null);
		pname2.setLayout(null);
		pname2.setFont(f2);
		pname2.setOpaque(false);
		pname2.setForeground(Color.cyan);
		pname2.setBounds(100,350,300,70);
		
		pf1=new JTextField();
		pf1.setBounds(400,250,350,50);
		pf1.setText("");
		pf1.setLayout(null);
		pf1.setOpaque(false);
		pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
		pf1.setFont(f3);
		pf1.setForeground(Color.white);
		
		pf2=new JTextField();
		pf2.setBounds(400,350,350,50);
		pf2.setText("");
		pf2.setLayout(null);
		pf2.setOpaque(false);
		pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
		pf2.setFont(f3);
		pf2.setForeground(Color.white);
		
		if(count==1)
		{
			pf2.setText("123");
			pf2.setVisible(false);
			pname2.setVisible(false);
		}
		
		play=new JButton("Play");
		play.setLayout(null);
		play.setBounds(300,450,200,100);
		play.setBackground(Color.YELLOW);
		play.setForeground(Color.black);
		play.setFont(f2);
		play.setFocusable(false);
		play.setBorder(null);
		play.setBorderPainted(false);
		
		home=new JButton("Home");
		home.setBounds(680,10,100,20);
		home.setOpaque(false);
		home.setBorder(null);
		home.setContentAreaFilled(false);
		home.setBorderPainted(false);
		home.setForeground(Color.white);
		home.setFocusable(false);
		
		play.addActionListener(this);
		//play.addMouseListener(this);
		
		home.addActionListener(this);
		//home.addMouseListener(this);
		
		add(name1);
		add(name2);
		add(name3);
		add(name4);
		add(pname1);
		add(pname2);
		add(pf1);
		add(pf2);
		add(play);
		add(home);
		
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
    	if(EventSource.equals(play))
    	{
    		EventSource.setBackground(Color.GREEN);
    	}
    	else if(EventSource.equals(home))
    	{
    		EventSource.setForeground(Color.cyan);
    	}
    } 
    public void mouseExited(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(play))
    	{
    		EventSource.setBackground(Color.yellow);
    	}
    	else if(EventSource.equals(home))
    	{
    		EventSource.setForeground(Color.white);
    	}
    }  
    public void mousePressed(MouseEvent e) 
    {
    	
    }  
    public void mouseReleased(MouseEvent e) 
    {
    	
    }  

}
