package ch4;
import java.util.Scanner;

class encryption {
	
	private int x1;
	private int x2;
	private int x3;
	private int x4;
	private int y1;
	private int y2;
	private int y3;
	private int y4;
	
	public void enc(int input)
	{
		x1 = input%10;
		x2 = input % 100/10;
		x3 = input % 1000/100;
		x4 = input % 10000/1000;
		System.out.println("Input: "+ x4+x3+x2+x1);
		
		y1 = (x1+7)%10;
		y2 = (x2+7)%10;
		y3 = (x3+7)%10;
		y4 = (x4+7)%10;
		System.out.println("Encrypted output: " + y4+y3+y2+y1);
	}
	
	public void dec(int input)
	{
		y1 = input %10;
		y2 = input % 100/10;
		y3 = input % 1000/100;
		y4 = input % 10000/1000;
		System.out.println("Encrypted input: " + y4+y3+y2+y1);
		
		//switch1
		switch(y1)
		{
		case 0:
			x1 = 3;
			break;
		case 1:
			x1 = 4;
			break;
		case 2:
			x1 = 5;
			break;
		case 3:
			x1 = 6;
			break;
		case 4:
			x1 = 7;
			break;
		case 5:
			x1 = 8;
			break;
		case 6:
			x1 = 9;
			break;
		case 7:
			x1 = 0;
			break;
		case 8:
			x1 = 1;
			break;
		case 9:
			x1 = 2;
			break;
		default:
			break;
		}
		
		//switch2
		switch(y2)
		{
		case 0:
			x2 = 3;
			break;
		case 1:
			x2 = 4;
			break;
		case 2:
			x2 = 5;
			break;
		case 3:
			x2 = 6;
			break;
		case 4:
			x2 = 7;
			break;
		case 5:
			x2 = 8;
			break;
		case 6:
			x2 = 9;
			break;
		case 7:
			x2 = 0;
			break;
		case 8:
			x2 = 1;
			break;
		case 9:
			x2 = 2;
			break;
		default:
			break;
		}
		
		//switch3
		switch(y3)
		{
		case 0:
			x3 = 3;
			break;
		case 1:
			x3 = 4;
			break;
		case 2:
			x3 = 5;
			break;
		case 3:
			x3 = 6;
			break;
		case 4:
			x3 = 7;
			break;
		case 5:
			x3 = 8;
			break;
		case 6:
			x3 = 9;
			break;
		case 7:
			x3 = 0;
			break;
		case 8:
			x3 = 1;
			break;
		case 9:
			x3 = 2;
			break;
		default:
			break;
		}
		
		//switch4
		switch(y4)
		{
		case 0:
			x4 = 3;
			break;
		case 1:
			x4 = 4;
			break;
		case 2:
			x4 = 5;
			break;
		case 3:
			x4 = 6;
			break;
		case 4:
			x4 = 7;
			break;
		case 5:
			x4 = 8;
			break;
		case 6:
			x4 = 9;
			break;
		case 7:
			x4 = 0;
			break;
		case 8:
			x4 = 1;
			break;
		case 9:
			x4 = 2;
			break;
		default:
			break;
		}
		
		System.out.println("Dencrypted output: " + x4+x3+x2+x1);
	}
}



public class Encrypt {
	public static void main (String[] args){
		int input;
		String choice;
		encryption object = new encryption();
		Scanner scan = new Scanner (System.in);
		System.out.print("Encrypt or Decrypt? (E/D) ");
		choice = scan.nextLine();
		System.out.print("Enter 4-digit number: ");
		input = scan.nextInt();
		if (input > 9999 || input < 0 ){
			System.out.println("Wrong input dummy!!! BYE!!");
			System.exit(0);
		}
		choice = choice.toLowerCase();
		switch(choice) {
		case "e":
			object.enc(input);
			break;
		case "d":
			object.dec(input);
			break;
		default:
			System.out.println("Wrong input dummy!!! BYE!!");
			System.exit(0);
		}	
		scan.close();
	}

}
