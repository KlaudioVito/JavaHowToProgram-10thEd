package ch04;

import java.util.Scanner;

public class Ex4_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, choice;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter choice encrypt (0)/decrypt(1): ");
		choice = input.nextInt();
		while(choice != 0 && choice != 1){
			System.out.print("Wrong input.\nEnter choice encrypt (0)/decrypt(1): ");
			choice = input.nextInt();
		}
		
		System.out.print("Enter 4-digit number: ");
		x = input.nextInt();
		while(x < 1000 && x > 9999){
			System.out.print("Wrong input. Enter 4-digit number: ");
			x = input.nextInt();
		}
		
		if(choice == 0){
			System.out.println("Encrypted number = " + encrypt(x));
		}
		else if (choice == 1){
			System.out.println("Decrypted number = " + decrypt(x));
		}
		input.close();
	}
	
	private static String encrypt(int x){
		int x1 = x%10;
		x /= 10;
		int x2 = x%10;
		x /= 10;
		int x3 = x%10;
		x/= 10;
		int x4 = x%10;
		
		x1 = (x1+7)%10;
		x2 = (x2+7)%10;
		x3 = (x3+7)%10;
		x4 = (x4+7)%10;
		String enc = "" + x2+x1+x4+x3;
		return  enc;
	}
	
	private static String decrypt(int x){
		int x3 = x%10;
		x /= 10;
		int x4 = x%10;
		x /= 10;
		int x1 = x%10;
		x/= 10;
		int x2 = x%10;
		
		if(x1 >= 0 && x1 <= 6)
			x1 = 10 + x1 - 7;
		else 
			x1 -= 7;
		
		if(x2 >= 0 && x2 <= 6)
			x2 = 10 + x2 - 7;
		else 
			x2 -= 7;
		
		if(x3 >= 0 && x3 <= 6)
			x3 = 10 + x3 - 7;
		else 
			x3 -= 7;
		
		if(x4 >= 0 && x4 <= 6)
			x4 = 10 + x4 - 7;
		else 
			x4 -= 7;
		
		String dec = "" + x4 + x3 + x2 + x1;
		return dec;
	}
}
