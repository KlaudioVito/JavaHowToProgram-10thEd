package ch06;

import java.util.Scanner;

public class Ex6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter double (or -1 to exit): ");
		number = input.nextDouble();
		while(number != -1){
			System.out.println("Original:\t\t" + number);
			roundToInteger(number);
			roundToTenths(number);
			roundToHundredths(number);
			roundToThousandths(number);
			System.out.print("\nEnter next double (or -1 to exit): ");
			number = input.nextDouble();
		}
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static void roundToInteger(double number){
		System.out.println("Rounded to Integer:\t" +(int) Math.floor(number + 0.5));
	}
	
	private static void roundToTenths(double number){
		System.out.println("Rounded to Tenths:\t" + Math.floor(number*10 + 0.5)/10);
	}

	private static void roundToHundredths(double number){
		System.out.println("Rounded to Hundredths:\t" + Math.floor(number*100 + 0.5)/100);
	}

	private static void roundToThousandths(double number){
		System.out.println("Rounded to Thousandths: " + Math.floor(number*1000 + 0.5)/1000);
	}
}
