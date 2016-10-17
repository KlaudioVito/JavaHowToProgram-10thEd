package ch06;

import java.util.Scanner;

public class Ex6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		x = input.nextInt();
		
		System.out.print("Enter second number: ");
		y = input.nextInt();
		
		System.out.println("GCD = " + gcd(x, y));
		input.close();
	}
	
	private static int gcd(int x, int y){
		while (x != 0 && y != 0){
			if(x > y)
				x %= y;
			else
				y %= x;
		}
		return Math.max(x, y);
	}

}
