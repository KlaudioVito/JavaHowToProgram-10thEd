package ch05;

import java.util.Scanner;

public class Ex5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter odd number between 1 and 19: ");
		int n = input.nextInt();
		while((n < 1 || n%2 == 0) || n > 19){
			System.out.print("Wrong input.\nEnter odd number between 1 and 19: ");
			n = input.nextInt();
		}
		n = n/2 + 1;
		int space = n - 1;
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= space; j++)
		      System.out.print(" ");
		    space--;
		    for (int j = 1; j <= 2 * i - 1; j++)
		      System.out.print("*");

		    System.out.print("\n");
		}
		space = 1;
		for (int i = 1; i <= n - 1; i++){
		    for (int j = 1; j <= space; j++)
		      System.out.print(" ");
		    space++;
		    for (int j = 1; j <= 2*(n - i)-1; j++)
		      System.out.print("*");
		 
		    System.out.println("");
		}
		input.close();
	}

}
