package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	
	Robot Justin = new Robot ();
	
	void go() {
		// 3. Make the robot move as fast as possible
		Justin.setSpeed(10);
		// 4. Set the pen width to 5
		Justin.setPenWidth(20);
		Justin.penDown();

	

			
		Justin.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			
		drawSquare();
	}	
		
		Justin.turn(90);


	}


	void drawSquare() {
	
		for (int i = 0; i < 4; i++) {

			Justin.turn(360/4);	Justin.move(200);
		}
		
	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
