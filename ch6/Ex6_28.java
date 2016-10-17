package ch06;

import java.util.Scanner;

public class Ex6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade: ");
		grade = input.nextInt();
		
		System.out.println("Quality point = " + qualityPoints(grade));
		input.close();
	}

	private static int qualityPoints(int grade){
		if(grade > 89 && grade < 101)
			return 4;
		else if(grade > 79 && grade < 90)
			return 3;
		else if(grade > 69 && grade < 80)
			return 2;
		else if(grade > 59 && grade < 70)
			return 1;
		else
			return 0;
	}
}
