package ch06;

import java.util.Scanner;

public class Ex6_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		while(number < 1 && number > 1000){
			System.out.print("Input out of range. Enter number: ");
			number = input.nextInt();
		}
		
		isPerfect(number);
		input.close();
	}
	
	private static void isPerfect(int number){
		int sum = 0;
		System.out.println("Factors of " + number + " :");
		for(int i = 1; i < number; i++){
			if(number % i == 0){
				sum += i;
				System.out.print(i + " ");
			}
		}
		if(sum == number)
			System.out.println("\nThe number is perfect");
		else
			System.out.println("\nThe number is NOT perfect");
	}
	
}
