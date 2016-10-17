package ch2;

import java.util.Scanner;

public class Ex2_16 {
	public static void main(String[] args){
		System.out.println("Enter two integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x > y){
			System.out.println(x + " is larger!");
		}
		else if(x < y){
			System.out.println(y + " is larger!");
		}else{
			System.out.println("These numbers are equal!");
		}
		scan.close();
	}
}
