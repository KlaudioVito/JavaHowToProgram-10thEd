package ch06;

import java.util.Scanner;

public class Ex6_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalCharges = 0;
		double currentCharges = 0;
		double hours;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter customer's parking hours (or -1 to exit): ");
		hours = input.nextDouble();
		while(hours != -1){
			currentCharges = calculateCharges(hours);
			totalCharges += currentCharges;
			System.out.printf("%nThis customer's charges: $%.2f%n", currentCharges);
			System.out.printf("Total charges: $%.2f%n", totalCharges);
			
			System.out.print("Enter next customer's parking hours (or -1 to exit): ");
			hours = input.nextDouble();
		}
		System.out.println("\nGoodbye!");
		input.close();
	}
	private static double calculateCharges(double hours){
		double charges = 0;
		if(hours <= 3){
			charges = 2;
		}
		else if(hours > 3 && hours < 24){
			charges = 2 + (hours-3) * 0.5;
		}
		else{
			charges = 10;
		}
		return charges;
	}
}
