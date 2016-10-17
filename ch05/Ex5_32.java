package ch05;

import java.util.Scanner;

public class Ex5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalTaxableExpenses = 0;
		String category;
		Scanner input = new Scanner(System.in);
		System.out.println("CATEGORIES ARE: "
				+ "\nHousing"
				+ "\nFood"
				+ "\nClothing"
				+ "\nTransportation"
				+ "\nEducation"
				+ "\nHealth Care"
				+ "\nVacations"
				+ "\nLuxuries");
		System.out.print("\nEnter expense category (or -1 to exit): ");
		category = input.nextLine();
		category = category.toLowerCase();
		while(!category.equals("-1")){
			switch(category){
			case "food": case "clothing":
				System.out.print("Enter amount spent: ");
				input.next();
				break;
			case "housing": case "transportation": case "education": case "health care": case "vacations": case "luxuries":
				System.out.print("Enter amount spent: ");
				totalTaxableExpenses += input.nextInt();
				break;
			default:
				System.out.println("Not a valid category.");
				break;
			}
			System.out.print("\nEnter expense category (or -1 to exit): ");
			category = input.next();
			category = category.toLowerCase();
		}
		double tax = 0.23 * (double)totalTaxableExpenses;
		System.out.printf("\nYou have to pay $%.2f in tax.", tax);
		input.close();
	}

}
