package ch06;

import java.util.Scanner;

public class Ex6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exponent;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		base = input.nextInt();
		System.out.print("Enter exponent (or -1 to exit): ");
		exponent = input.nextInt();
		
		while(exponent != -1){
			System.out.println(base + "^" + exponent + " = " + integerPower(base, exponent));
			
			System.out.print("\nEnter base: ");
			base = input.nextInt();
			System.out.print("Enter exponent (or -1 to exit): ");
			exponent = input.nextInt();
		}
		
		input.close();
	}

	private static int integerPower(int base, int exponent){
		int power = 1;
		for(int i = 0; i < exponent; i++){
			power *= base;
		}
		return power;
	}
}
