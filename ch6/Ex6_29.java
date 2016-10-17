package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_29 {

	private enum side {HEADS, TAILS}; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sumHeads = 0, sumTails = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Toss coin (1) or exit (-1): ");
		number = input.nextInt();
		while(number == 1){
			side coin = flip();
			if(coin == side.HEADS)
				sumHeads++;
			else if(coin == side.TAILS)
				sumTails++;
			
			System.out.print("Toss coin (1) or exit (-1): ");
			number = input.nextInt();
		}
		
		System.out.println("You tossed " + sumHeads + " heads and " + sumTails + " tails");
		input.close();
	}
	
	private static side flip(){
		SecureRandom random = new SecureRandom();
		int n = random.nextInt(2);
		if(n == 0)
			return side.HEADS;
		else
			return side.TAILS;
	}

}
