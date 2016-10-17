package ch06;

import java.security.SecureRandom;

public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		System.out.println("Random value in rage (1 <= n <= 2):\t  "    + (1    + random.nextInt(2  )));
		System.out.println("Random value in rage (1 <= n <= 100):\t  "  + (1    + random.nextInt(100)));
		System.out.println("Random value in rage (0 <= n <= 9):\t  "    + (       random.nextInt(9  )));
		System.out.println("Random value in rage (1000 <= n <= 1112): " + (1000 + random.nextInt(112)));
		System.out.println("Random value in rage (-1 <= n <= 1):\t  "   + (1    - random.nextInt(2  )));
		System.out.println("Random value in rage (-3 <= n <= 11):\t  "  + (8    - random.nextInt(11 )));
	}

}
