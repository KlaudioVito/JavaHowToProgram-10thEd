package ch06;

import java.util.Scanner;

public class Ex6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number (or -1 to exit): ");
		number = input.nextInt();
		
		while(number != -1){
			if(isEven(number))
				System.out.println("Even");
			else
				System.out.println("Odd");
			
			System.out.print("\nEnter next number (or -1 to exit): ");
			number = input.nextInt();
		}
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static boolean isEven(int number){
		return number % 2 == 0 ? true : false;
	}
}
