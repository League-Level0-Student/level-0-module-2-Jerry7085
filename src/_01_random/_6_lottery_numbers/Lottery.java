package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		int number = 0;
		int numbe = 0;
		int numb = 0;
		int num = 0;
		int nu = 0;
		int n = 0;
		Random ran = new Random();
		
		
		number = ran.nextInt(101);
		numbe = ran.nextInt(101);
		numb = ran.nextInt(101);
		num = ran.nextInt(101);
		nu = ran.nextInt(101);
		n = ran.nextInt(101);
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "LOTTERY\n"+number+
				" "+numbe+" "+numb+" "+num+" "+nu+" "+n);
		JOptionPane.showMessageDialog(null,"Your lottery number\n"+number+
				" "+numbe+" "+numb+" "+num+" "+nu+" "+n );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
