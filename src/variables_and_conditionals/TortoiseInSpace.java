package variables_and_conditionals;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.teachingextensions.logo.Tortoise;

public class TortoiseInSpace implements KeyEventDispatcher {


	/*  Make the Tortoise move around the screen when the arrow keys are pressed... */
	private void moveTortoise(int keyPressed) {
		// 0. Print out the keyPressed variable and write down the numbers for each arrow key
System.out.println(keyPressed);
		// 1. If the up arrow is pressed, move the Tortoise up the screen.
			if(38==keyPressed){
				Tortoise.setAngle(0);
				Tortoise.move(10);
				}
			
		// 2. If the down arrow is pressed, move the Tortoise down.
			if(40==keyPressed){
				Tortoise.setAngle(0);
				Tortoise.turn(180);
				Tortoise.move(10);	
			}
			
		// 3. If the left arrow is pressed, make the tortoise go left. Hint: Make sure to end with the Tortoise facing UP.
			if(37==keyPressed){
				Tortoise.setAngle(0);
				Tortoise.turn(270);
				Tortoise.move(10);
			}
		// 4. If right is pressed, move the Tortoise right.\
			if(39==keyPressed){
				Tortoise.setAngle(0);
				Tortoise.turn(90);
				Tortoise.move(10);
			}
		// 5. Then move the Tortoise to RD-2D for a surprise! 
	}

	private void checkIfR2D2Found() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		if (tortoiseLocationX <= 510 && tortoiseLocationX >= 505 && tortoiseLocationY >= 110 && tortoiseLocationY <= 115)
			playEureka();
	}

	public static void main(String[] args) {
		new TortoiseInSpace().controlTheTortoise();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.getBackgroundWindow().setBackgroundImage(
				"http://cdn.playbuzz.com/cdn/ae928505-70fe-4538-8fc4-034d1acef441/b7a29f96-7410-440b-9d93-3cfc0abccce9.jpg");

		Tortoise.penUp();
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			moveTortoise(e.getKeyCode());
			try {
				checkIfR2D2Found();
			} catch (Exception exception) {
			}
		}
		return false;
	}

	public void playEureka() {
		System.out.println("EUREKA!");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/league/Desktop/Level0Module3/league-sound/r2d2-eureka.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}


