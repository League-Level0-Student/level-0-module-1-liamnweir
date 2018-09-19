package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String devil = ("Nothing. Good riddles like this never get old.");
String Devil =	JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die? ");
if (devil.equals(Devil)) {
	JOptionPane.showMessageDialog(null, "You got it right, you got one point!");
	score = score+1;}
else {
	JOptionPane.showMessageDialog(null, "Sorry, you got it wrong. The correct answer was "+devil);
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String Travel = ("A stamp.");
String travel =	JOptionPane.showInputDialog("What can travel around the world while staying in a corner?  ");
if (Travel.equals(travel)) {
	JOptionPane.showMessageDialog(null, "You got it right, you got one point!");
	score = score+1;}
else {
	JOptionPane.showMessageDialog(null, "Sorry, you got it wrong. The correct answer was "+Travel);
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	
}
JOptionPane.showMessageDialog(null, "Your total score is "+score);

}}

