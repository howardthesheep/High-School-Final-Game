
package bro.the.game.pkg2;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
public class MasterPanel extends JPanel implements GameVariables 
{   
	
	Background back = new Background();
	Chad chad = new Chad();
	BrotatoChip chip = new BrotatoChip();
	TitleMenu title = new TitleMenu();

	GameOver over = new GameOver();
	private final int moveDistance = 3;
	private final int time = 5;
	int key;
	int count;
	boolean timerStarted = false;
	int moveDirection;
	int chipsCollected = 0;
	int timeLeft =  10;
	int loadedPanel = 0;
	boolean musicPlaying = false;
	boolean clapping= false;
	
    
    public MasterPanel()
    {

        add(title);
        add(back);
        add(chad);
  
        
    }
	
	
		
    
    public void paintComponent(Graphics g) 
    {

		chad.setChadX(400);
		chad.setChadY(300);
		title.paintComponent(g);
			
    }
}
	