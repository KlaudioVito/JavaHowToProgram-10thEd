package ch2;

import java.util.Scanner;

public class Ex2_28 {
	public static void main(String[] args){
		System.out.println("Enter radius of circle: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.printf("Diameter is: %f%nCircumference is: %f%nArea is: %f%n", (float)2*x, (float)2*x*Math.PI, (float)x*x*Math.PI);
		scan.close();
	}
}
