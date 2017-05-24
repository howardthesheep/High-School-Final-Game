

package bro.the.game.pkg2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GameOver extends JPanel implements GameVariables
{
	ImageIcon gameOver;
	boolean replay;
	
	
	public GameOver()
	{
		gameOver = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\play button_1.png");
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int score = masterPanel.chipsCollected;
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 600);
		gameOver.paintIcon(this, g, -0,-150);
		g.setColor(Color.RED);
		g.setFont(new Font("",Font.BOLD , 75));
		g.drawString("Your Score: " + score, 150, 300);
		g.setFont(new Font("", Font.BOLD, 50));
		g.drawString("Press 'P' to play again!", 150, 375);
		replay = true;
		
		
	}
}
