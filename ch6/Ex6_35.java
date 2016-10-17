package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, choice = 1, answer;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		while(choice == 1){
			int x = 1 + random.nextInt(8);
			int y = 1 + random.nextInt(8);
			result = askQuestion(x,y);
			System.out.print("\nHow much is " + x + " * " + y + "? ");
			answer = input.nextInt();
			while(answer != result){
				System.out.println("\nNo. Please try again.");
				System.out.print("How much is " + x + " * " + y + "? ");
				answer = input.nextInt();
			}
			System.out.println("\nVery good!");
			System.out.print("Enter 1 for the next question or any other number to exit: ");
			choice = input.nextInt();
		}
		
		System.out.println("Goodbye!");
		input.close();
	}
	
	private static int askQuestion(int x, int y){
		return x*y;
	}
}
