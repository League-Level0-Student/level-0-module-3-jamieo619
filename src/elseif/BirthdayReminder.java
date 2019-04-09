
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 5th";
		String dadsBirthday = "May 4th";
		String myBirthday = "February 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String whosBirthday = JOptionPane.showInputDialog("Who's birthday would you like to know?");
		// 3. Print out what the user typed
		if(whosBirthday == "mom") {
			JOptionPane.showMessageDialog(null,momsBirthday);
		}else if(whosBirthday == "dad") {
			JOptionPane.showMessageDialog(null,dadsBirthday);
		}else if(whosBirthday == "your") {
			JOptionPane.showMessageDialog(null,myBirthday);
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
