package bro.the.game.pkg2;

import bro.the.game.pkg2.GameVariables;
import bro.the.game.pkg2.MusicBox;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class TitleMenu extends JPanel implements GameVariables
{
	String title = "Bro: The Game";
	ImageIcon backgroundImage, text;
	ImageIcon broCan;
	boolean PlaySelected = false;
	MusicBox introMusic;
	int key;

	
	public TitleMenu()
	{
		backgroundImage = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\titlemenubg.jpg");
		text = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\Title text .png");
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		backgroundImage.paintIcon(titleMenu,g ,0, 0);
		text.paintIcon(titleMenu, g, 20, 50);
	}	
}


