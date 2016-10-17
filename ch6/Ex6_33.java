package ch06;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex6_33 {
	private static final SecureRandom randomNumbers = new SecureRandom();
	private enum Status { CONTINUE, WON, LOST };
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int myPoint = 0, bankBalance = 1000, wager;
		boolean positiveBalance = true;
		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch(sumOfDice){
		case SEVEN:
		case YO_LEVEN:
			System.out.println("You won with a SEVEN/YO_ELEVEN");
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY: 
		case BOX_CARS:
			System.out.println("You lost with SNAKE_EYES/TREY/BOX_CARS");
			gameStatus = Status.LOST;
			break;
		default: 
			gameStatus = Status.CONTINUE; 
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		System.out.println("Bank balance = " + bankBalance);
		while (gameStatus == Status.CONTINUE){
			System.out.println(chatter());
			System.out.print("Enter wager: ");
			wager = input.nextInt();
			while((wager < 0 && positiveBalance)|| wager > bankBalance){
				System.out.println("Wager exceeds bank balance or is negative.");
				System.out.println(chatter());
				System.out.print("Enter wager: ");
				wager = input.nextInt();
			}
			
			sumOfDice = rollDice();
			if(sumOfDice == myPoint)
				gameStatus = Status.WON;
			else
				if (sumOfDice == SEVEN)
					gameStatus = Status.LOST;
			if(gameStatus == Status.WON){
				System.out.println("Player wins");
				bankBalance += wager;
				System.out.println("New bank balance = " + bankBalance);
			}
				
			else{
				System.out.println("Player loses");
				bankBalance -= wager;
				if(bankBalance == 0){
					System.out.println("Sorry. You busted! New bank balance = 0");
					positiveBalance = false;
				}
				else{
					System.out.println(chatter());
					System.out.println("New bank balance = " + bankBalance);
				}
					
			}
		input.close();		
		}
	}
	
	public static int rollDice(){
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}
	
	private static String chatter(){
		SecureRandom rand = new SecureRandom();
		int msg = rand.nextInt(4);
		if(msg == 0)
			return "Oh, you're going for broke, huh?";
		else if(msg == 1)
			return "Aw c'mon, take a change!";
		else if(msg == 2)
			return "You're doing great.";
		else
			return "Keep it up!";
		
	}
}
