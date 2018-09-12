package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class UnbirthdayOrBirthday {
public static void main(String[] args) {
	String birthdate =JOptionPane.showInputDialog("What is your birthdate?");
	if (birthdate.equals( "9/13"))
		JOptionPane.showMessageDialog(null, "Happy birtday!");
	else JOptionPane.showMessageDialog(null, "Happy unbirthday.");
}
}
