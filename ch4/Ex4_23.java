package ch04;

import java.util.Scanner;

public class Ex4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0, number, largest = 0, secondLargest = 0;
		Scanner input = new Scanner(System.in);
		
		while(counter < 10){
			System.out.print("Enter number: ");
			number = input.nextInt();
			if(number > largest){
				secondLargest = largest;
				largest = number;
			}
			counter++;
		}
		System.out.println("\nLargest number is " + largest + " and the second largest is " + secondLargest + ". Goodbye!");
		input.close();
	}
}
