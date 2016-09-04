package ch2;

import java.util.Scanner;

public class Ex2_17 {
	public static void main(String[] args){
		System.out.println("Enter three integers: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.print("Sum: " + (x+y+z) + "\nAverage: " + average(x,y,z) + "\nProduct: " + (x*y*z) + "\nSmallest: " + smallest(x,y,z) + 
				"\nLargest: " + largest(x,y,z));
		scan.close();
	}
	private static int average(int a, int b, int c){
		return (a+b+c)/2;
	}
	private static int smallest(int a, int b, int c){
		if(a < b && a < c){
			return a;
		}else if(b < a && b < c){
			return b;
		}
		return c;
	}
	private static int largest(int a, int b, int c){
		if(a > b && a > c){
			return a;
		}else if(b > a && b > c){
			return b;
		}
		return c;
	}
}
