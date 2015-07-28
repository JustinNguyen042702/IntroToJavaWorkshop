package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Justin = new Robot ();
	
	void go() {
		drawTriangle(100); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible

		
		int length = 50;
		// 7. Do the following (up to step 10) 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
		
			// 10. Turn the tortoise 6 degrees to the right

	}


	private void drawTriangle(int length) {
		Justin.penDown();
		for (int i = 0; i < 3; i++) {
			Justin.move(length);	Justin.turn(360/3);
		}
		
	
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
