package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Vote {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int age2 = Integer.parseInt(age);
		if(age2 >= 18) {
			String answer = JOptionPane.showInputDialog("Who should be the next president?");
		}
		else if(age2 <18) {
			JOptionPane.showMessageDialog(null,"Nobody cares what you think!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
