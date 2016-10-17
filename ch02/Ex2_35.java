package ch2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex2_35 {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter total miles driven per day: ");
		double miles = scan.nextDouble();
		System.out.print("Enter cost per gallon of gasoline: ");
		double cost = scan.nextDouble();
		System.out.print("Enter average miles per gallon: ");
		double avg = scan.nextDouble();
		System.out.print("Enter parking fees per day: ");
		double parking = scan.nextDouble();
		System.out.print("Enter toll fees per day: ");
		double tolls = scan.nextDouble();
		
		scan.close();
		double gallonsSpent = miles/avg;
		double gallonsCost = gallonsSpent*cost;
		double totalCostDaily = gallonsCost + parking + tolls;
		double totalCost = 365 * totalCostDaily;
		System.out.println("The total cost of traveling for one day is: " + NumberFormat.getCurrencyInstance().format(totalCostDaily));
		System.out.println("The total cost of traveling for one year is: " + NumberFormat.getCurrencyInstance().format(totalCost));
		for(int i = 2; i < 6; i++){
			System.out.println("If you carpool with " + i + " persons, each pays "
					+ NumberFormat.getCurrencyInstance().format(totalCostDaily/i) + " per day and each pays " + 
					NumberFormat.getCurrencyInstance().format(totalCost/i) + " per year");
		}
		
	}
}
