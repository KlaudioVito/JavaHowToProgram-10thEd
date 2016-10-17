package ch06;

import java.util.Scanner;

public class Ex6_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		first = input.nextInt();
		System.out.print("Enter second nubmer (or -1 to exit): ");
		second = input.nextInt();
		
		while(second != -1){
			boolean multiple = isMultiple(first, second);
			if(multiple)
				System.out.println("Second integer is a multiple of first integer");
			else
				System.out.println("Second integer is NOT a multiple of first integer");
			
			System.out.print("\nEnter first number: ");
			first = input.nextInt();
			System.out.print("Enter second nubmer (or -1 to exit): ");
			second = input.nextInt();
		}
		
		System.out.println("\nGoodbye!");
		input.close();
	}
	
	private static boolean isMultiple(int first, int second){
		return first % second == 0 ? true : false;
	}
}
