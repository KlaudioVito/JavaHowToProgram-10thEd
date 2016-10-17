package ch03;

import java.util.Scanner;

public class Ex3_15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_11 account1 = new Ex3_11("Jane Green", 50.00);
		Ex3_11 account2 = new Ex3_11("John Blue", -7.53);
		
		displayAccount(account1);
		displayAccount(account2);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter withdrawal amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter withdrawal amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nwithdrawing $%.2f from account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		
		displayAccount(account1);
		displayAccount(account2);
		
		input.close();
	}
	
	public static void displayAccount(Ex3_11 accountToDisplay){
		System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
