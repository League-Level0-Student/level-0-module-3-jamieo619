package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are You Happy");
	
	String doYou = null;
	if (happy == "yes") {
		doYou = JOptionPane.showInputDialog("Do you want to be happy?");
		if (doYou == "yes" ) {
			JOptionPane.showMessageDialog(null,"Keep Doing What You're Doing...");
			
		}
		else{
			JOptionPane.showMessageDialog(null,"Change Something...");
		}
		
	}
	else {
		
		JOptionPane.showMessageDialog(null,"Keep Doing What You're Doing...");
		
	}
	
	
}
}
