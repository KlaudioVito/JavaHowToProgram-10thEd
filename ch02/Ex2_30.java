package ch2;

import java.util.Scanner;

public class Ex2_30 {
	public static void main(String[] args){
		System.out.println("Enter an integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int[] digits = new int[5];
		int i = 0;
		while(x > 0){
			digits[i] = x%10;
			x = x/10;
			i++;
		}
		for(int index = digits.length-1; index >= 0; index--){
			System.out.print(digits[index] + " ");
		}
	}
}
