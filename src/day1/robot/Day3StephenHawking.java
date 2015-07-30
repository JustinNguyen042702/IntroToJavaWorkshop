package day1.robot;import java.io.IOException;

import javax.swing.JOptionPane;

public class Day3StephenHawking {
public static void main(String[] args) {
	for (int i = 0; i < 3; i++) {
		
	
	String v = JOptionPane.showInputDialog("Can you give me a sentence?");
	speak(v);
}
}   
    
    

/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014







