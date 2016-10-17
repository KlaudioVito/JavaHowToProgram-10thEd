package ch04;

import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miles, gallons;
		float totalMiles = 0, totalGallons = 0, MPG = 0, avgMPG = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter miles or -1 to quit: ");
		miles = input.nextInt();
		System.out.print("Enter gallons or -1 to quit: ");
		gallons = input.nextInt();
		
		while(miles != -1 && gallons != -1){
			MPG =(float) miles / gallons;
			System.out.printf("%nCurrent MPG: %.2f miles/gallon%n", MPG);
			totalMiles += miles;
			totalGallons += gallons;
			avgMPG  = totalMiles/totalGallons;
			System.out.printf("Average MPG: %.2f miles/gallon%n", avgMPG);
			
			System.out.print("Enter miles or -1 to quit: ");
			miles = input.nextInt();
			System.out.print("Enter gallons or -1 to quit: ");
			gallons = input.nextInt();
		}
		
		System.out.println("Goodbye!");
		input.close();
	}
}
