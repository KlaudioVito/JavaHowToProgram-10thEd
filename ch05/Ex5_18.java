package ch05;

public class Ex5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		int principal = 1000;
		double rate = 0.05;
		
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");
		for (int year = 1; year <= 10; ++year){
			amount = (int)(Math.round(principal * Math.pow(1.0 + rate, year) * 100));
			int cents = amount % 100;
			int dollars = amount / 100;
			System.out.printf("%4d%,20d.%d%n", year, dollars, cents, rate*100);
		}
	}

}
