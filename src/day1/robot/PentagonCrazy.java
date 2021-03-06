package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot Justin = new Robot ();
		
		Justin.penDown();
		// 8. Make the robot go at maximum speed (10)
		Justin.setSpeed(10);
		// 9. Set the pen to a color that you like for the shape
	
		for (int i = 0; i < 200; i++) {
			Justin.setRandomPenColor();
		Justin.setPenWidth(400);
		
		int sides = 5;
		int angle = 360/sides;
		
		
	
	Justin.move(200);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	Justin.move(i);
	
		Justin.turn(360/sides);
	
	
	
	
	
			
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}