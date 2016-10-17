package ch06;

import java.util.Scanner;

public class Ex6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		squareOfAsterisks(number);
		input.close();
	}
	
	private static void squareOfAsterisks(int number){
		for(int i = 0; i < number; i++){
			for(int j = 0; j < number; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
