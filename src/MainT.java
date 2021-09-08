import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
/*class MainX extends JFrame
{
	Container cont;
	MainX(String s)
	{
		super(s);
		cont = getContentPane();
		cont.setLayout(null);
		cont.setSize(512,512);
		setLayout(null);
		setBounds(400,200,800,600);
		//setUndecorated(true);
		setVisible(true);
		
		ImageIcon img = new ImageIcon("img/t01.png");
		this.setIconImage(img.getImage());
		
		first_page f1=new first_page();
		f1.setBounds(0,0,800,600);
		f1.setVisible(true);
		f1.setLayout(null);
		
		cont.add(f1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}*/
public class MainT
{
	public static void main(String[] args) {
		
		main_panel m1=new main_panel("TicTac");

	}

}
