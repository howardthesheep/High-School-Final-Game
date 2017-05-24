package bro.the.game.pkg2;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



public class MusicBox implements Runnable, GameVariables
{
	int i;
	Clip clip;
    public MusicBox() throws LineUnavailableException, IOException, UnsupportedAudioFileException
	{
		 try
		{
			AudioInputStream crunch = AudioSystem.getAudioInputStream(new File("C:\\Users\\Parker\\Documents\\NetBeansProjects\\Bro the Game 2\\src\\bro\\the\\game\\pkg2\\Random_chiptune_mix_2.wav"));
			 clip  = AudioSystem.getClip();
			 clip.open(crunch);
			 FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			 gainControl.setValue(-20.0f);
			 
		 }
        
		 catch(FileNotFoundException e)
		{
			System.out.println('e');
		 }
	}
	
	public void run()
	{
		clip.start();
	}
}

