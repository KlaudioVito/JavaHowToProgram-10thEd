package ch03;

import java.util.Scanner;

public class Ex3_14Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_14 date = new Ex3_14(10,22,1991);
		
		System.out.print("Date is: ");
		date.displayDate();
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nSet month: ");
		date.setMonth(input.nextInt());
		
		System.out.print("Set day: ");
		date.setDay(input.nextInt());
		
		System.out.print("Set year: ");
		date.setYear(input.nextInt());
		
		System.out.print("\nDate is: ");
		date.displayDate();
	
		input.close();
	}

}
