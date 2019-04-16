package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String zodiacSign = JOptionPane.showInputDialog("What is your Zodiac Symbol?");
	
	if(zodiacSign.equals("Aquarius")) {
		JOptionPane.showMessageDialog(null,"Aquarians are often generous with their time and resources. ");
	}else if(zodiacSign.equals("Pisces")) {
		JOptionPane.showMessageDialog(null,"Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves.");
	}else if(zodiacSign.equals("Aries")) {
		JOptionPane.showMessageDialog(null,"Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. ");
	}else if(zodiacSign.equals("Taurus")) {
		JOptionPane.showMessageDialog(null,"Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical.");
	}else if(zodiacSign.equals("Gemini")) {
		JOptionPane.showMessageDialog(null,"Rarely likes to do anything alone.");
	}else if(zodiacSign.equals("Cancer")) {
		JOptionPane.showMessageDialog(null,"The typical cancer person is all about home and family and is very dedicated and loyal to friends and family. Crabs often move sideways instead of moving in a straight line, and so will the person of this sign. Often, if it will avoid a fight, or achieve the goal, then moving in alternative directions to arrive at the destination is typical. They tend to grasp and hold tightly those things that make them happy, and never let go. The key characteristic of this sign is that Cancer people need to be needed. They need to know that they matter to someone and that they are secure in that love. Brave, courageous, protective, all describe the best possible traits of this sign. Shy, reserved, brooding, and moody, do not serve the cancer person well, but may surface if their needs are not being met.");
	}else if(zodiacSign.equals("Leo")) {
		JOptionPane.showMessageDialog(null,"Leo signs tend to like relaxation, preferably someplace warm and comfortable. Leo likes the big picture, not the small details and fine print. Things that are too complicated, involved, or boring, they have no patience for. They are natural leaders and don’t often do well in situations where they have to take orders from others.");
	}else if(zodiacSign.equals("Virgo")) {
		JOptionPane.showMessageDialog(null,"The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. They tend to be extremely detail oriented and particularly like producing something that is not only useful, but beautiful and skillful.");
	}else if(zodiacSign.equals("Libra")) {
		JOptionPane.showMessageDialog(null,"Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign. Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives. Because of this need Libra signs can sometimes seem wishy-washy when they are asked to make a decision. This is because they must ‘weigh’ all of their options. However, rest assured, that when a Libra makes up their mind the decision is likely to be the best win/win for all involved; benefiting the most people. This sign does not like to see people unhappy.");
	}else if(zodiacSign.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null,"The symbol for Scorpio is the scorpion. This creature was chosen because it typifies many of the characteristics of this sign. The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative. They crave alone time and often become extremely annoyed when they don’t get it. Scorpio people are great secret keepers and feel each emotion more intensely than other signs. Perhaps because of this they are able to be quite discerning when assisting people with their problems. They are able to cut to the bottom line and show others the best and the worst in their lives.");
	}else if(zodiacSign.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null,"Those born under this sign will love travelling, discovering new things, meeting new people, and learning new things.\r\n" + 
				"\r\n" + 
				"Sagittarians crave the freedom of the open road, both metaphorically and physically. They are most unhappy when they are tied to a normal routine and can become restless in situations where there is not enough variety involved. ");
	}else if(zodiacSign.equals("Capricorn" )) {
		JOptionPane.showMessageDialog(null,"Capricorn people are the type that are goal oriented and driven to succeed despite all odds. They will work long and hard hours toward a purposeful goal. Self-disciplined and successful, it is no wonder that some of the world’s greatest scientists, leaders, and teachers have been Capricorn.");
	}else {
		JOptionPane.showMessageDialog(null,"THAT'S NOT A STAR SIGN!");
	}
}
}
