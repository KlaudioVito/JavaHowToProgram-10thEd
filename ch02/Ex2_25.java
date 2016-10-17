package ch2;

import java.util.Scanner;

public class Ex2_25 {
	public static void main(String[] args){
		System.out.println("Enter an integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		System.out.println(x%2 == 0 ? x + " is even" : x + " is odd" );
	}
}
