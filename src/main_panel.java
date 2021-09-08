import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class main_panel extends JFrame implements ActionListener
{
	String lab;
	Container cont;
	JButton cancel,mini;
	first_page f1;
	static second s1;
	//static int reload=0;
	static int chk=0;
	third t1;
	main_panel(String s)
	{
		super(s);
		cont = getContentPane();
		cont.setLayout(null);
		setLayout(null);
		setBounds(400,200,800,600);
		setUndecorated(true);
		setVisible(true);
		
		//reload=0;
		
		ImageIcon img = new ImageIcon(main_panel.class.getResource("/img/t01.png"));
		this.setIconImage(img.getImage());
		
		cancel=new JButton();
		cancel.setLayout(null);
		cancel.setBounds(10,10,15,15);
		cancel.setFocusable(false);
		cancel.setBackground(Color.black);
		cancel.setBorder(new LineBorder(Color.red,1));
		//cancel.setIcon(new ImageIcon("img/cancel.png"));
		
		
		mini=new JButton();
		mini.setLayout(null);
		mini.setBounds(30,10,15,15);
		mini.setFocusable(false);
		mini.setBackground(Color.black);
		mini.setBorder(new LineBorder(Color.yellow,1));
		//mini.setIcon(new ImageIcon("img/mini.png"));
		
		
		f1=new first_page();
		f1.setBounds(0,0,800,600);
		f1.setVisible(true);
		f1.setLayout(null);
		
		f1.onep.setActionCommand("one");
		f1.twop.setActionCommand("two");
		
		f1.onep.addActionListener(this);
		//onep.addMouseListener(this);
		f1.twop.addActionListener(this);
		//twop.addMouseListener(this);
		
		
		cont.add(f1);
		cont.add(mini);
		cont.add(cancel);
		
		cancel.setActionCommand("x");
		mini.setActionCommand("-");
		
		cancel.addActionListener(this);
		mini.addActionListener(this);
		//cancel.addMouseListener(this);
		//mini.addMouseListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f1.setVisible(false);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		lab=ae.getActionCommand();
		if(lab.equals("-"))
		{
			setState(this.ICONIFIED);
		}
		else if(lab.equals("x"))
		{
			this.dispose();
			System.exit(0);
		}
		else if(lab.equals("one"))
		{
			s1=new second(1);
			s1.setBounds(0,0,800,600);
			cont.add(s1);
			f1.setVisible(false);
			s1.setVisible(true);
			
			s1.play.addActionListener(this);
			//s1.play.addMouseListener(this);
			
			s1.home.addActionListener(this);
			//s1.home.addMouseListener(this);
			
			
		}
		else if(lab.equals("two"))
		{
			s1=new second(2);
			s1.setBounds(0,0,800,600);
			cont.add(s1);
			f1.setVisible(false);
			s1.setVisible(true);
			
			s1.play.addActionListener(this);
			//s1.play.addMouseListener(this);
			
			s1.home.addActionListener(this);
			//s1.home.addMouseListener(this);
			
		}
		else if(lab.equals("Play"))
		{
			checknames();
			if(chk==1)
			{
				t1=new third(s1.count, s1.pf1.getText(), s1.pf2.getText());
				t1.setBounds(0,0,800,600);
				t1.setVisible(false);
				t1.setLayout(null);
				cont.add(t1);
				f1.setVisible(false);
				s1.setVisible(false);
				t1.setVisible(true);
				
				t1.home.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println("IN Anonymous main");
						t1.setVisible(false);
						s1.setVisible(false);
						f1.setVisible(true);
					}
				});
			}
		}
		else if(lab.equals("Home"))
		{
			try {
				t1.setVisible(false);
			}
			catch(Exception e)
			{
				System.out.println("-- >  "+e.getMessage());
			}
			s1.setVisible(false);
			f1.setVisible(true);
		}
		
	}
	public static void checknames()
	{
		chk=0;
			if(s1.pf1.getText().equals("") || s1.pf2.getText().equals(""))
			{
				if(s1.pf1.getText().equals(""))
				{
					s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
				}
				else
				{
					s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				}
				if(s1.pf2.getText().equals(""))
				{
					s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
				}
				else
				{
					s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				}
			}
			else
			{
				chk=1;
				s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
			}
	}
	public void mouseClicked(MouseEvent e) 
	{  
		AbstractButton EventSource = (AbstractButton)e.getSource();
		if(EventSource.equals(s1.play))
		{
			if(s1.pf1.getText().equals("") || s1.pf2.getText().equals(""))
			{
				if(s1.pf1.getText().equals(""))
				{
					s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
				}
				else
				{
					s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				}
				if(s1.pf2.getText().equals(""))
				{
					s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
				}
				else
				{
					s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				}
			}
			else
			{
				s1.pf1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
				s1.pf2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
			}
		}
    }  
    public void mouseEntered(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(cancel))
    	{
    		EventSource.setBackground(Color.red);
    	}
    	else if(EventSource.equals(mini))
    	{
    		EventSource.setBackground(Color.YELLOW);
    	}
    }  
    public void mouseExited(MouseEvent e) 
    {  
    	AbstractButton EventSource = (AbstractButton)e.getSource();
    	if(EventSource.equals(cancel))
    	{
    		EventSource.setBackground(Color.black);
    	}
    	else if(EventSource.equals(mini))
    	{
    		EventSource.setBackground(Color.black);
    	}
    }  
    public void mousePressed(MouseEvent e) 
    {
    	
    }  
    public void mouseReleased(MouseEvent e) 
    {
    	
    }  

}
