package ch04;

import java.util.Scanner;

public class Ex4_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary, decimal = 0, multiplier = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter binary nubmer: ");
		binary = input.nextInt();
		while(binary != 0){
			int rightMost = binary % 10;
			binary /= 10;
			decimal += rightMost * multiplier;
			multiplier *= 2;
		}
		System.out.println("Decimal Equivalent: " + decimal);
		input.close();
	}

}
