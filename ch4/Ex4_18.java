package ch04;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accNumber, startBalance, charges, credits, limit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		accNumber = input.nextInt();
		
		System.out.print("Enter starting balance: ");
		startBalance = input.nextInt();
		
		System.out.print("Enter total of all items charged: ");
		charges = input.nextInt();
		
		
		System.out.print("Enter total of all credits applied: ");
		credits = input.nextInt();
		
		System.out.print("Enter credit limit or -1 to quit: ");
		limit = input.nextInt();
		
		while(limit != -1){
			double newBalance = startBalance + charges - credits;
			System.out.printf("%nNew balance for account #%d is $%.2f%n", accNumber, newBalance);
			if(newBalance > limit) System.out.println("Credit limit exceeded");
			
			System.out.print("\nEnter account number: ");
			accNumber = input.nextInt();
			
			System.out.print("Enter starting balance: ");
			startBalance = input.nextInt();
			
			System.out.print("Enter total of all items charged: ");
			charges = input.nextInt();
			
			
			System.out.print("Enter total of all credits applied: ");
			credits = input.nextInt();
			
			System.out.print("Enter credit limit or -1 to quit: ");
			limit = input.nextInt();	
		}
		System.out.println("Goodbye!");
		input.close();
	}
}
