package day1.robot;

import javax.swing.JOptionPane;

public class Day3WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
 String q = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(q.equals("yes")){
JOptionPane.showMessageDialog(null, "You'll will rule the world! >:)");
	// 3. Otherwise, wish them good luck washing dishes.
}
else{
 speak("No? Good Luck tieing my shoe");
}
	}

static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {

}
}
}