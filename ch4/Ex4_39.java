package ch04;

public class Ex4_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currPopulation = 2000000000;
		double rate =  0.13;
		System.out.println("Starting in 2016");
		System.out.println("Year\tPopulation\t\tIncrease");
		for(int i = 1; i < 76; i++){
			double increase = Math.pow(Math.E, rate*i);
			currPopulation *= increase;
			System.out.println(i + "\t" + currPopulation + "\t" + increase);
		}
	}

}
