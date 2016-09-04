package ch2;

import java.util.Scanner;

public class Ex2_32 {
	public static void main(String[] args){
		System.out.println("Enter five integers: ");
		Scanner scan = new Scanner(System.in);
		int[] inputs = new int[5];
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for(int i = 0; i < inputs.length; i++){
			inputs[i] = scan.nextInt();
			if(inputs[i] == 0){
				zero++;
			}
			else if(inputs[i] < 0){
				neg++;
			}
			else if(inputs[i] > 0){
				pos++;
			}
		}
		System.out.print("Positives: " + pos +"\nNegatives: " + neg + "\nZeroes: " + zero);
		scan.close();
		
	}
}
