package ch5;

import java.util.Scanner;

public class Ex5_16 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 5 number between 1 and 30");
		
		
		System.out.print("First number:");
		int input1 = scan.nextInt();
		if(input1 >=1 && input1 <= 30){
			
		}
		else{
			System.out.println("Wrong input. Exiting...");
			System.exit(0);
		}
		
		System.out.print("Second number:");
		int input2 = scan.nextInt();
		if(input2 >=1 && input2 <= 30){
			
		}
		else{
			System.out.println("Wrong input. Exiting...");
			System.exit(0);
		}
		
		System.out.print("Third number:");
		int input3 = scan.nextInt();
		if (input3 >=1 && input3 <= 30){
			
		}
		else{
			System.out.println("Wrong input. Exiting...");
			System.exit(0);
		}
		
		System.out.print("Fourth number:");
		int input4 = scan.nextInt();
		if(input4 >=1 && input4 <= 30){
			
		}
		else{
			System.out.println("Wrong input. Exiting...");
			System.exit(0);
		}
		
		System.out.print("Fifth number:");
		int input5 = scan.nextInt();
		if(input5 >=1 && input5 <= 30) {
		}
		else{
			System.out.println("Wrong input. Exiting...");
			System.exit(0);
		}
		
		//printing out the asterisk based on input
		for(int i = 0; i < input1; i++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i = 0; i < input2; i++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i = 0; i < input3; i++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i = 0; i < input4; i++){
			System.out.print("*");
		}
		System.out.println("");
		
		for(int i = 0; i < input5; i++){
			System.out.print("*");
		}
		
		scan.close();
	}

}
