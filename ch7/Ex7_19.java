package ch7;

import java.util.Random;
import java.util.Scanner;

public class Ex7_19 {
	public static void main(String[] args){
		boolean[] seats = new boolean[10];
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please type 1 for First Class or 2 for Economy: ");
		int in = scan.nextInt();
		while(in == 0 || in == 1){
			if(in == 1){
				int seat = rnd.nextInt(5);
				if(seats[seat] == false){
					seats[seat] = true;
					System.out.println("Your seat is number " + seat + " in First Class");
				}else{
					System.out.print("Would it be acceptable to seat in Economy Class?(Y/N) ");
					String answer = scan.next();
					if(answer == "Y"){
						for(int i = 5; i < seats.length; i++){
							if (seats[i] == false){
								seats[i] = true;
								System.out.println("Your seat is number " + seat + " in Economy Class");
								break;
							}else{
								System.out.println("No seats available. Next flight leaves in 3 hours");
							}
								
						}
					}else if (answer == "N"){
						System.out.println("Next flight leaves in 3 hours");
					}
				}
			}else if(in == 0){
				int seat = 5 + rnd.nextInt(5);
				if(seats[seat] == false){
					seats[seat] = true;
					System.out.println("Your seat is number " + seat + " in Economy Class");
				}else{
					System.out.print("Would it be acceptable to seat in First Class?(Y/N) ");
					String answer = scan.next();
					if(answer == "Y"){
						for(int i = 5; i < seats.length; i++){
							if (seats[i] == false){
								seats[i] = true;
								System.out.println("Your seat is number " + seat + " in First Class");
								break;
							}else{
								System.out.println("No seats available. Next flight leaves in 3 hours");
							}
								
						}
					}else if (answer == "N"){
						System.out.println("Next flight leaves in 3 hours");
					}
				}
				
			}
			System.out.print("Please type 1 for First Class or 2 for Economy: ");
			in = scan.nextInt();
		}
		
		
		scan.close();
	}
}
