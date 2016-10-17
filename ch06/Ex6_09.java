package ch06;

import java.util.Scanner;

public class Ex6_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter double (or -1 to exit): ");
		number = input.nextDouble();
		while(number != -1){
			roundToNearestInt(number);
			System.out.print("\nEnter next double (or -1 to exit): ");
			number = input.nextDouble();
		}
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static void roundToNearestInt(double number){
		System.out.println("Original: " + number + "\nRounded to: " +(int) Math.floor(number + 0.5));
	}

}
