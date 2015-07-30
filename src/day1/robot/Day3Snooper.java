package day1.robot;

import javax.swing.JOptionPane;
































public class Day3Snooper {
public static void main(String[] args) {
String q = JOptionPane.showInputDialog("What's your name?");
String c = JOptionPane.showInputDialog("What's your street called?");
String a = JOptionPane.showInputDialog("What's your cellphone number?");
String b = JOptionPane.showInputDialog("I like Ice Cream, DO YOU?!?!?");
String d = JOptionPane.showInputDialog("What's your hair color?");
String e = JOptionPane.showInputDialog("ARE YOU SINGLE?!");
JOptionPane.showMessageDialog(null, q+" LOOK OUT YOUR WINDOW >:)");
JOptionPane.showMessageDialog(null, c+" I'll be there in 10 minutes >:)");
JOptionPane.showMessageDialog(null, a+" Ok, Let me track that real quick just in case >:)");
JOptionPane.showMessageDialog(null, b+" Ok, I'll buy you some before I come >:)");
JOptionPane.showMessageDialog(null, d+" I don't like that color, I'll buy some blue hair dye for you   >:)");
JOptionPane.showMessageDialog(null, e+" Ok, It doesn't matter >:)");
}
}
