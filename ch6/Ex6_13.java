package ch06;

import java.security.SecureRandom;

public class Ex6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		System.out.println("Random value in set [2,4,6,8,10]:    "  + (2 + 2 * random.nextInt(5)));
		System.out.println("Random value in set [3,5,7,9,11]:    "  + (3 + 2 * random.nextInt(5)));
		System.out.println("Random value in set [6,10,14,18,22]: "  + (6 + 4 * random.nextInt(5)));

	}

}
