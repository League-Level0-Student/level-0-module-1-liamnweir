package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class SecretBox {
public static void main(String[] args) {
	
	String Secret = ("This is my secret: secret!");
	String Passcode = JOptionPane.showInputDialog("What do you want your password to be?");
String Answer = JOptionPane.showInputDialog("What is the passcode?");
if (Answer.equals(Passcode) ) {
	JOptionPane.showMessageDialog(null, "You opened the box! "+Secret);
}
 else {
	 JOptionPane.showMessageDialog(null, "INTRUDER!!!");
 }
}
}
