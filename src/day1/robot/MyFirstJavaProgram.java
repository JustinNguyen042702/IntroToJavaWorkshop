package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Justin = new Robot();
	Justin.penDown();
	for (int i = 0; i < 360; i++) {
		Justin.setSpeed(100);
		Justin.setPenWidth(30);
		Justin.setRandomPenColor();
		Justin.move(70);
		Justin.turn(14);
	}
	}
}