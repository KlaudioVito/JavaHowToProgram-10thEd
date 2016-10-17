package ch05;

import java.util.Scanner;

public class Ex5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,x2,x3,x4,x5;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number between 1 and 30: ");
		x1 = input.nextInt();
		while(x1 < 1 && x1 > 30){
			System.out.print("Wrong input.Enter first number (1-30): ");
			x1 = input.nextInt();
		}
		
		System.out.print("Enter second number between 1 and 30: ");
		x2 = input.nextInt();
		while(x2 < 1 && x2 > 30){
			System.out.print("Wrong input.Enter second number (1-30): ");
			x2 = input.nextInt();
		}
		
		System.out.print("Enter third number between 1 and 30: ");
		x3 = input.nextInt();
		while(x3 < 1 && x3 > 30){
			System.out.print("Wrong input.Enter third number (1-30): ");
			x3 = input.nextInt();
		}
		
		System.out.print("Enter fourth number between 1 and 30: ");
		x4 = input.nextInt();
		while(x4 < 1 && x4 > 30){
			System.out.print("Wrong input.Enter fourth number (1-30): ");
			x4 = input.nextInt();
		}
		
		System.out.print("Enter fifth number between 1 and 30: ");
		x5 = input.nextInt();
		while(x5 < 1 && x5 > 30){
			System.out.print("Wrong input.Enter second number (1-30): ");
			x5 = input.nextInt();
		}
		
		for(int i = 0; i < x1; i++)
			System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < x2; i++)
			System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < x3; i++)
			System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < x4; i++)
			System.out.print("*");
		System.out.println();
		
		for(int i = 0; i < x5; i++)
			System.out.print("*");
		System.out.println();
		
		input.close();
	}

}
