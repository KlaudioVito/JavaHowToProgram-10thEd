package ch8;
/**
 * 
 * @author Klaudio
 * Exercise 8.6
 */
public class SavingsAccount {
	static double annualInterest;
	private double savingsBalance;
	
	SavingsAccount(double savingsBalance){
		if(savingsBalance < 0.0){
			throw new IllegalArgumentException("Balance must be greater than zero!");
		}
		this.savingsBalance = savingsBalance;
	}
	public double calculateMonthlyInterest(){
		savingsBalance += (savingsBalance*annualInterest)/12;
		return (savingsBalance*annualInterest)/12;
	}
	static public void setAnnualInterest(double annualInterest){
		SavingsAccount.annualInterest = annualInterest;
	}
	public double getBalance(){
		return this.savingsBalance;
	}
}
