package ch05;

import java.util.Scanner;

public class Ex5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1 = 2.98, p2 = 4.50, p3 = 9.98, p4 = 4.49, p5 = 6.87;
		int number, quantity;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter product number (1-5) or any other number to exit: ");
		number = input.nextInt();
		while(number > 0 && number < 6){
			System.out.print("Enter quantity sold: ");
			quantity = input.nextInt();
			while(quantity < 0){
				System.out.print("Wrong input. Enter quantity sold: ");
				quantity = input.nextInt();
			}
			switch(number){
			case 1:
				System.out.printf("Total retail value: $%.2f%n", p1*quantity);
				break;
			case 2:
				System.out.printf("Total retail value: $%.2f%n", p2*quantity);
				break;
			case 3:
				System.out.printf("Total retail value: $%.2f%n", p3*quantity);
				break;
			case 4:
				System.out.printf("Total retail value: $%.2f%n", p4*quantity);
				break;
			case 5:
				System.out.printf("Total retail value: $%.2f%n", p5*quantity);
				break;
			}
			System.out.print("Enter product number (1-5) or any other number to exit: ");
			number = input.nextInt();
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
