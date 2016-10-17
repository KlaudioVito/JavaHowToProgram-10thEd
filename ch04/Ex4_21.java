package ch04;

import java.util.Scanner;

public class Ex4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, number, largest = 0;
		Scanner input = new Scanner(System.in);
		
		while(counter < 10){
			System.out.print("Enter number: ");
			number = input.nextInt();
			if(number > largest) largest = number;
			counter++;
		}
		System.out.println("\nLargest number is " + largest + ". Goodbye!");
		input.close();
	}
}
