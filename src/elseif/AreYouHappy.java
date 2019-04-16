package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are You Happy");
	String doYou;
	
	if(happy.equals("yes")) {
		JOptionPane.showMessageDialog(null,"KEEP DOING WHAT YOU'RE DOING");
	}
	
	if(happy.equals("no")) {
		doYou = JOptionPane.showInputDialog("Do you want to be happy?");
		if(doYou.equals("yes")) {
			JOptionPane.showMessageDialog(null,"CHANGE SOMETHING");
		}else{
			JOptionPane.showMessageDialog(null,"KEEP DOING WHAT YOU'RE DOING");
		}
	}
	
}
}
