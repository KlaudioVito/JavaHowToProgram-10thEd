package ch06;

import java.util.Scanner;

public class Ex6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		radius = input.nextInt();
		
		circleArea(radius);
		input.close();
	}
	
	private static void circleArea(int radius){
		System.out.printf("Area: %.2f ", Math.PI*Math.pow(radius, 2));
	}

}
