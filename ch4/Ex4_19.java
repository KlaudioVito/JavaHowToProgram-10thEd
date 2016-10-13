package ch04;

import java.util.Scanner;

public class Ex4_19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value, total = 0;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of item sold or -1 to exit: ");
		value = input.nextDouble();
		
		while(value != -1){
			total += value;
			System.out.print("Enter value of item sold or -1 to exit: ");
			value = input.nextDouble();
			counter++;
		}
		System.out.printf("%n%d item(s) sold for $%.2f%nEarnings: $%.2f", counter, total,(200+0.09*total));
		input.close();
	}
}
