package ch05;

public class Ex5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial = 1;
		for(int i = 20; i > 1; i--){
			factorial *= i;
		}
		System.out.println("20! = " + factorial);
	}

}
