package ch04;

import java.util.Scanner;

public class Ex4_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter number between 1 and 20: ");
		number = input.nextInt();
		while(number < 1 && number > 20){
			System.out.print("Wrong input. Enter number between 1 and 20: ");
			number = input.nextInt();
		}

		int width = 0;
	    while (width < number) {
	        System.out.print("* ");
	        width++;
	    }
	    System.out.println();
	    
	    width = 0;
	    while (width < number - 2) {
	        System.out.print('*');
	        int height = 0;
	        while (height < number - 2) {
	            System.out.print("  ");
	            height++;
	        }
	        System.out.println(" *");
	        width++;
	    }
	    
	    width = 0;
	    while (width < number) {
	        System.out.print("* ");
	        width++;
	    }
	    
		input.close();
	}

}
