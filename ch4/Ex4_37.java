package ch04;

import java.util.Scanner;

public class Ex4_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, x;
		double e = 1, ex = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("PART A");
		System.out.print("Enter n: ");
		n = input.nextInt();
		while(n < 0){
			System.out.print("Wrong input. Enter n: ");
			n = input.nextInt();
		}
		System.out.println("n! = " + factorial(n));
		
		System.out.println("PART B");
		System.out.print("Enter n: ");
		n = input.nextInt();
		while(n < 0){
			System.out.print("Wrong input. Enter n: ");
			n = input.nextInt();
		}
		int i = 1;
		while( i <= n){
			e += 1/factorial(i);
			i++;
		}
		System.out.printf("e = %.2f%n", e);
		
		System.out.println("PART C");
		System.out.print("Enter n: ");
		n = input.nextInt();
		while(n < 0){
			System.out.print("Wrong input. Enter n: ");
			n = input.nextInt();
		}
		System.out.print("Enter x: ");
		x = input.nextInt();
		while(x < 0){
			System.out.print("Wrong input. Enter x: ");
			x = input.nextInt();
		}
		i = 1;
		while(i <= n){
			ex += power(x, i)/factorial(i);
			i++;
		}
		System.out.printf("e^x = %.2f%n", ex);
		
		input.close();
	}
	private static double factorial(int n){
		double f = 1;
		int i = n;
		while(i > 0){
			f *= n--;
			i--;
		}
		
		return f;
	}
	
	private static double power(int base, int exponent){
		double power = 1;
		if(exponent == 0)
			return base;
		while(exponent > 0){
			power *= base;
			--exponent;
		}
		return power;
	}
}
