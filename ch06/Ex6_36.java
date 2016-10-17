package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_36 {

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
				response(1);
				System.out.print("How much is " + x + " * " + y + "? ");
				answer = input.nextInt();
			}
			response(0);
			System.out.print("Enter 1 for the next question or any other number to exit: ");
			choice = input.nextInt();
		}
		
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static int askQuestion(int x, int y){
		return x*y;
	}

	private static void response(int status){
		SecureRandom random = new SecureRandom();
		int choice = random.nextInt(4);
		if(status == 0){	
			switch(choice){
			case 0:
				System.out.println("\nVery Good!");
				break;
			case 1:
				System.out.println("\nExcellent!");
				break;
			case 2:
				System.out.println("\nNice Work!");
				break;
			case 3:
				System.out.println("\nKeep up the good work!");
				break;
			}
		}
		else if(status == 1){
			switch(choice){
			case 0:
				System.out.println("\nNo.Please try again.");
				break;
			case 1:
				System.out.println("\nWrong. Try once more.");
				break;
			case 2:
				System.out.println("\nDon't give up!");
				break;
			case 3:
				System.out.println("\nNo. Keep trying.");
				break;
			}
		}
	}
}
