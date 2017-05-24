package bro.the.game.pkg2;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Timer;


public class Chad extends JComponent implements GameVariables
{
    ImageIcon ChadRight;
    Rectangle chadBorder;
    ImageIcon ChadLeft;
    int chadXPos = chadDefaultX;
    int chadYPos = chadDefaultY;
    int i;
    int health = 10;
    Timer timer;
   int count;
    
   public Chad()
    {
        ChadRight = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\Chad right walk.png");
        ChadLeft = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\Chad walk left.png");
		
        
      
    } 
	
	public void paintComponent(Graphics g)
	{
		ChadLeft.paintIcon(this, g, chadXPos, chadYPos);
	}
    
	 public int getChadX()
	{
		return chadXPos;
	}
	 
	 public Rectangle getChadBounds()
	 {
		 chadBorder = new Rectangle(getChadX(),getChadY(), 23, 33);
		 return chadBorder;
	 }
    
	 public void setChadX(int i)
	{

		this.i = i;
		chadXPos = i;
	}
    
	 public int getChadY()
	{
		return chadYPos;
	}

	 public void setChadY(int i)
	{
		this.i = i;
		chadYPos =  i;
	}
}
