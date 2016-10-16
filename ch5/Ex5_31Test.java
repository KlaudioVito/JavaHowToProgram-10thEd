package ch05;

import java.util.Scanner;

public class Ex5_31Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		user = input.nextLine();
		Ex5_31 user1 = new Ex5_31(user);
		
		user1.takeQuiz();
		
		int points = user1.getPoints();
		switch(points){
		case 0: case 1: case 2: case 3: 
			System.out.println("\n" +user1.getUser() + ", time to brush up your knowledge of global warming");
			break;
		case 4:
			System.out.println("\nVery Good " + user1.getUser() + ".");
			break;
		case 5:
			System.out.println("\nExcellent " + user1.getUser() + ".");
			break;
		}
		System.out.println("\nCheck more facts about Global Warming at "
				+ "\nhttp://www.conserve-energy-future.com/various-global-warming-facts.php");
		
		input.close();
	}

}
