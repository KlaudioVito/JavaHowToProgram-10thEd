package ch06;

import java.util.Scanner;

public class Ex6_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1, x2, y1, y2;
		
		System.out.print("Enter x1: ");
		x1 = input.nextInt();
		
		System.out.print("Enter x2: ");
		x2 = input.nextInt();
		
		System.out.print("Enter y1: ");
		y1 = input.nextInt();
		
		System.out.print("Enter y2: ");
		y2 = input.nextInt();
		
		System.out.printf("Distance = %.2f", distance(x1,x2,y1,y2));
		input.close();
	}
	
	private static double distance(double x1, double x2, double y1, double y2){
		return Math.sqrt((Math.pow(y1-x1, 2)+Math.pow(y2-x2, 2)));
	}

}
