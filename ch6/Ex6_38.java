package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_38 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result, choice = 1, answer, score = 0, difficulty = 0;
		Scanner input = new Scanner(System.in);
		SecureRandom random = new SecureRandom();
		
		while(choice < 11 && choice != -1){
			if(choice == 1){
				System.out.print("Select difficulty level (1-5): ");
				difficulty = input.nextInt();
				while(difficulty < 1 || difficulty > 5){
					System.out.print("Wrong difficulty level. Select difficulty level (1-5): ");
					difficulty = input.nextInt();	
				}
				System.out.println("Answer the following 10 questions.");
			}
			int x = 0, y = 0;
			switch(difficulty){
			case 1:
				x = 1 + random.nextInt(8);
				y = 1 + random.nextInt(8);
				break;
			case 2:
				x = 10 + random.nextInt(89);
				y = 10 + random.nextInt(89);
				break;
			case 3:
				x = 100 + random.nextInt(99);
				y = 100 + random.nextInt(99);
				break;
			case 4:
				x = 1000 + random.nextInt(999);
				y = 1000 + random.nextInt(999);
				break;
			case 5:
				x = 10000 + random.nextInt(9999);
				y = 10000 + random.nextInt(9999);
				break;
			}
			
			result = askQuestion(x,y);
			System.out.print("Question " + choice + "\nHow much is " + x + " * " + y + "? ");
			answer = input.nextInt();
			if(answer == result){
				response(0);
				score++;
			}
			else
				response(1);
			
			choice++;
			if(choice == 11){
				double average = score/10.0;
				if(average < 0.75){
					System.out.println("Your average is " + average*100 + "%. Please ask your teacher for extra help.");
					System.out.print("Enter any number for the next student or -1 to exit: ");
					score = 0;
					choice = input.nextInt();
				}
				else{
					System.out.println("Your average is " + average*100 + "%. Congratulations, you are ready to go the next level.");
					System.out.print("Enter any number for the next student or -1 to exit: ");
					score = 0;
					choice = input.nextInt();
				}
			}
			
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
