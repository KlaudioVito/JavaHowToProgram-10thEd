package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int number, guess, choice = 1;
		
		while(choice == 1){
			number = 1 + random.nextInt(1001);
			System.out.print("\nGuess a number between 1 and 1000: ");
			guess = input.nextInt();
			while(guess != number){
				if(guess > number){
					System.out.print("Too high. Try again: ");
					guess = input.nextInt();
				}
				else{
					System.out.print("Too low. Try again: ");
					guess = input.nextInt();
				}
			}
			System.out.print("Congratulations. You guessed the number!\nEnter 1 to play again or anything else to quit:");
			choice = input.nextInt();
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
