package ch7;

import java.util.Scanner;

public class Ex7_14 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print(product(2,4,5,10,101,11,3));
		scan.close();
	}
	private static int product(int... numbers){
		int product = 1;
		for(int i : numbers){
			product *= i;
		}
		return product;
	}
}
