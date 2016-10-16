package ch05;

public class Ex5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double users = 1000000000;
		double futureUsers = 0;
		double rate = 0.04;
		int year = 1;
		
		while(futureUsers <= 1500000000){
			futureUsers = users * Math.pow(1+rate, year);
			year++;
		}
		
		System.out.println("\nIt will take facebook about " + year + " years to reach 1.5 billion users");
	
		futureUsers = 0;
		year = 1;
		while(futureUsers <= 2000000000){
			futureUsers = users * Math.pow(1 + rate, year);
			year++;
		}
		
		System.out.println("\nIt will take facebook about " + year + " years to reach 2 billion users");
	}

}
