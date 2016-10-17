package ch06;

import java.util.Scanner;

public class Ex6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y,z;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		x = input.nextDouble();
		
		System.out.print("Enter second number: ");
		y = input.nextDouble();
		
		System.out.print("Enter third number: ");
		z = input.nextDouble();
		
		System.out.println("The minium is " +  minimum3(x,y,z));
		input.close();
	}
	
	
	private static double minimum3(double x, double y, double z){
		return Math.min(x, Math.min(y, z));
	}

}
