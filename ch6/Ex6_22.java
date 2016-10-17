package ch06;

import java.util.Scanner;

public class Ex6_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp;
		char choice;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Conver to Fahrenheits (f) or Celsius (c): ");
		choice = input.next().charAt(0);
		while(choice != 'c' && choice != 'f'){
			System.out.println("Wrong input");
			System.out.print("Conver to Fahrenheits (f) or Celsius (c): ");
			choice = input.next().charAt(0);
		}
		
		if(choice == 'c'){
			System.out.print("\nEnter temperature in fahrenheit: ");
			temp = input.nextDouble();
			System.out.printf("%.2fF is %.2fC", temp, celsius(temp));
		}
		else if(choice == 'f'){
			System.out.print("\nEnter temperature in celsius: ");
			temp = input.nextDouble();
			System.out.printf("%.2fC is %.2fF", temp, fahrenheit(temp));
		}
		input.close();
	}
	
	private static double celsius(double f){
		return 5.0 / 9.0 *(f-32);
	}
	
	private static double fahrenheit(double c){
		return 9.0 / 5.0 * c + 32;
	}

}
