package ch2;

import java.util.Scanner;

public class Ex2_26 {
	public static void main(String[] args){
		System.out.println("Enter two integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		System.out.println(x%y == 0 ? x + " is a multiple of " + y : x + " is not a multiple of " + y);
	}
}
