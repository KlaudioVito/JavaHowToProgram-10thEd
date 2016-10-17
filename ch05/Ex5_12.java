package ch05;

public class Ex5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product = 1;
		for(int i = 1; i < 16; i++){
			if(i%2 != 0)
				product *= i;
		}
		System.out.println("Product of odd integers from 1 to 15 is " + product);
	}

}
