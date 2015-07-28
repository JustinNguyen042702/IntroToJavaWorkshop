package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot Justin = new Robot ();
		Justin.penDown();
		
	
		for (int i = 0; i < 75; i++) { 
			
		
			Justin.setSpeed(i);
	
		Justin.setPenColor(Color.BLUE);

		Justin.move(5*i);
		Justin.turn(360/7);
			
		Justin.setPenWidth(i);
	}
	}
}
