

package bro.the.game.pkg2;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JComponent;


public class BrotatoChip extends JComponent implements GameVariables 
{
	ImageIcon bag;
	Random generator = new Random();
	Rectangle chipBorder;
	int x = 100;
	int y = 100;
	
	
	public BrotatoChip()
	{
		generateX();
		generateY();
		chipBorder = new Rectangle(getX(),getY(), 43, 47);
		bag = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\brotato chip.png");
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		bag.paintIcon(this, g, x, y);
	}
	
	public void setX(int i)
	{
		i = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(int i)
	{
		i = y;
	}
	 
	public int getY()
	{
		return y;
	}
	
	public int generateX()
	{
		x = generator.nextInt(601) + 100;
		return x;
	}
	
	public int generateY()
	{
		y = generator.nextInt(401) + 100;
		return y;
	}
	
	 public Rectangle getChipBounds()
	 {
		 return chipBorder;
	 }
	 
	 public void remove()
	 {
		 chipBorder.setLocation(generateX(), generateY());
		 repaint();
	 }
	
	
}
