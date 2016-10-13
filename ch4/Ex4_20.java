package ch04;

import java.util.Scanner;

public class Ex4_20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours, i = 1;
		double rate;
		Scanner input = new Scanner(System.in);
		
		while(i < 4){
			System.out.print("Enter employee " + i + " hours: ");
			hours = input.nextInt();
			System.out.print("Enter employee " + i + " rate: ");
			rate = input.nextDouble();
			if(hours <= 40){
				double pay = rate * hours;
				System.out.printf("%nEmployee %d gross pay: $%.2f%n%n", i, pay);
			}
			else{
				double pay = (rate * 40) + ((rate*0.5)+rate)*(hours-40);
				System.out.printf("Employee %d gross pay: $%.2f%n%n", i, pay);
			}
			i++;
		}
		System.out.println("Goodbye!");
		input.close();
	}

}
