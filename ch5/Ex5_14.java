package ch05;

public class Ex5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		double principal = 1000.0;
		//double rate = 0.05;
		
		System.out.printf("%s%20s%12s%n", "Year", "Amount on deposit", "Rate");
		for (int year = 1; year <= 10; ++year){
			for(double rate = 0.05; rate <= 0.09; rate += 0.01){
				amount = principal * Math.pow(1.0 + rate, year);
				System.out.printf("%4d%,20.2f\t%.0f %%%n", year, amount, rate*100);
			}
		}
	}

}
