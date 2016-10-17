package ch2;

import java.util.Scanner;

public class Ex2_15 {
	public static void main(String[] args){
		System.out.println("Enter two integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.print("Sum: " + (x+y) + "\nProduct: " + (x*y) + "\nDifference: " + (x-y) + "\nQuotient: " + (x/y));
		
		scan.close();
	}
}
