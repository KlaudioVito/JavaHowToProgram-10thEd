package ch2;

import java.util.Scanner;

public class Ex2_24 {
	public static void main(String[] args){
		System.out.println("Enter five integers: ");
		Scanner scan = new Scanner(System.in);
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		int int3 = scan.nextInt();
		int int4 = scan.nextInt();
		int int5 = scan.nextInt();
		scan.close();
		if(int1 < int2 && int1 < int3 && int1 < int4 && int1 < int5){
			System.out.println(int1 + " is the smallest");
		}
		else if (int2 < int1 && int2 < int3 && int2 < int4 && int2 < int5){
			System.out.println(int2 + " is the smallest");
		}
		else if (int3 < int1 && int3 < int2 && int3 < int4 && int3 < int5){
			System.out.println(int3 + " is the smallest");
		}
		else if (int4 < int1 && int4 < int3 && int4 < int2 && int4 < int5){
			System.out.println(int4 + " is the smallest");
		}
		else if (int5 < int1 && int5 < int3 && int5 < int4 && int5 < int2){
			System.out.println(int5 + " is the smallest");
		}
		
		
		if(int1 > int2 && int1 > int3 && int1 > int4 && int1 > int5){
			System.out.println(int1 + " is the largest");
		}
		else if (int2 > int1 && int2 > int3 && int2 > int4 && int2 > int5){
			System.out.println(int2 + " is the largest");
		}
		else if (int3 > int1 && int3 > int2 && int3 > int4 && int3 > int5){
			System.out.println(int3 + " is the largest");
		}
		else if (int4 > int1 && int4 > int3 && int4 > int2 && int4 > int5){
			System.out.println(int4 + " is the largest");
		}
		else if (int5 > int1 && int5 > int3 && int5 > int4 && int5 > int2){
			System.out.println(int5 + " is the largest");
		}
		
	}
}
