package ch8;

import java.text.NumberFormat;

/**
 * 
 * @author Klaudio
 * Exercise 8.6
 */
public class SavingsAccountTest {
	public static void main(String[] args){
		SavingsAccount.setAnnualInterest(0.04);
		SavingsAccount a1 = new SavingsAccount(2000.00);
		SavingsAccount a2 = new SavingsAccount(3000.00);
		System.out.println("Monthly interests at 4% annual interest rate:");
		System.out.printf("%-10s%-30s%-30s%-30s%-30s%n", "Month", "Account 1 (M) Interest", "Account 2 (M) Interest", "Account 1 Balance", "Account 2 Balance");
		for(int month = 0; month < 12; month++){
			String interest1 = NumberFormat.getCurrencyInstance().format(a1.calculateMonthlyInterest());
			String interest2 = NumberFormat.getCurrencyInstance().format(a2.calculateMonthlyInterest());
			String balance1 = NumberFormat.getCurrencyInstance().format(a1.getBalance());
			String balance2 = NumberFormat.getCurrencyInstance().format(a2.getBalance());
			System.out.printf("%-10d%-30s%-30s%-30s%-30s%n", (month+1),interest1,interest2,balance1,balance2);
		}
		SavingsAccount.setAnnualInterest(0.05);
		System.out.println("\nMonthly interests at 5% annual interest rate:");
		System.out.printf("%-10s%-30s%-30s%-30s%-30s%n", "Month", "Account 1 (M) Interest", "Account 2 (M) Interest", "Account 1 Balance", "Account 2 Balance");
		
		for(int month = 12; month < 24; month++){
			String interest1 = NumberFormat.getCurrencyInstance().format(a1.calculateMonthlyInterest());
			String interest2 = NumberFormat.getCurrencyInstance().format(a2.calculateMonthlyInterest());
			String balance1 = NumberFormat.getCurrencyInstance().format(a1.getBalance());
			String balance2 = NumberFormat.getCurrencyInstance().format(a2.getBalance());
			System.out.printf("%-10d%-30s%-30s%-30s%-30s%n", (month+1),interest1,interest2,balance1,balance2);
		}
		
		
	}
}
