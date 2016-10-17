package ch06;

public class Ex6_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers from 1 to 10000.\nMethod 1|\tMethod2");
		for(int i = 2; i <= 10000; i++){
			if(isPrime(i))
				System.out.print(i + "\t|\t");
			if(isPrime2(i))
				System.out.print(i);
			if(isPrime(i))
				System.out.println();
		}
	}

	private static boolean isPrime(int number){
		for(int i = 2; i <= number/2; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	private static boolean isPrime2(int number){
		for(int i = 2; i <= Math.sqrt(number); i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
}
