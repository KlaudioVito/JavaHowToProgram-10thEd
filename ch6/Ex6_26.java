package ch06;

import java.util.Scanner;

public class Ex6_26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		reverseDigits(number);
		input.close();
	}
	
	private static void reverseDigits(int number){
		System.out.print("Reversed: ");
		while(number > 0){
			System.out.print(number%10);
			number /= 10;
		}
	}
}
