

package bro.the.game.pkg2;

import bro.the.game.pkg2.GameVariables;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
   

public class Background extends JComponent implements GameVariables
{
    ImageIcon backgroundImage;

    public Background()
    {
        backgroundImage = new ImageIcon("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\game background.jpg");
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        backgroundImage.paintIcon(this, g, 0, 0);
    }
}
