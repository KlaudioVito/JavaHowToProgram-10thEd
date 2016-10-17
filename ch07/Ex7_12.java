package ch7;

import java.util.Scanner;

public class Ex7_12 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int[] inputs = new int[5];
		for(int i = 0; i < inputs.length; i++){
			int in = scan.nextInt();
			if(!checkDuplicate(in, inputs)){
				System.out.println(in);
				inputs[i] = in;
			}
		}
		scan.close();
	}
	private static boolean checkDuplicate(int n, int[] arr){
		for(int i = 0; i < arr.length; i++){
			if(n == arr[i])
				return true;
		}
		return false;
	}
}
