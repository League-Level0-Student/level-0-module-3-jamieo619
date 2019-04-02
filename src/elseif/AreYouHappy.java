package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are You Happy");
	String doYou;
	
	if(happy == "yes") {
		JOptionPane.showMessageDialog(null,"KEEP DOING WHAT YOU'RE DOING");
	}
	
	if(happy == "no") {
		doYou = JOptionPane.showInputDialog("Do you want to be happy?");
		if(doYou == "yes") {
			JOptionPane.showMessageDialog(null,"CHANGE SOMETHING");
		}else{
			JOptionPane.showMessageDialog(null,"KEEP DOING WHAT YOU'RE DOING");
		}
	}
	
}
}
