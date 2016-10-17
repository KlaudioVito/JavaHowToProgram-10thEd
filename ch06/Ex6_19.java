package ch06;

import java.util.Scanner;

public class Ex6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		char fillCharacter;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		System.out.print("Enter character: ");
		fillCharacter = input.next().charAt(0);
		
		square(number, fillCharacter);
		input.close();
	}
	
	private static void square(int number, char fillCharacter){
		for(int i = 0; i < number; i++){
			for(int j = 0; j < number; j++)
				System.out.print(fillCharacter);
			System.out.println();
		}
	}
}
