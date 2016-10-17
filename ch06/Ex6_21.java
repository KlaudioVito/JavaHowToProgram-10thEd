package ch06;

import java.util.Scanner;

public class Ex6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		while(number < 1 && number > 99999){
			System.out.print("Input out of range. Enter number: ");
			number = input.nextInt();
		}
		
		displayDigits(number);
		input.close();
	}
	
	private static void displayDigits(int number){
		int exponent =(int) Math.floor( Math.log10((double)number));
		int divisor;
		while(number > 0){
			divisor = (int)Math.pow(10.0, exponent);
			System.out.print(getQuotient(number, divisor) + "  ");
			number = getReminder(number,divisor);
			exponent--;
		}
	}
	
	private static int getQuotient(int number, int divisor){
		return number / divisor;
	}
	
	private static int getReminder(int number, int divisor){
		return number % divisor;
	}

}
