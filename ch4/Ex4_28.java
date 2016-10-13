package ch04;

public class Ex4_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		System.out.println("PART A");
		x = 5;
		y = 8;
		if(y == 8){
			if(x == 5)
				System.out.println("@@@@@");
			else
				System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
		
		System.out.println("\nPART B");
		if(y == 8){
			if(x == 5)
				System.out.println("@@@@@");
			else{
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}
		}
		
		System.out.println("\nPART C");
		if(y == 8){
			if(x == 5)
				System.out.println("@@@@@");	
		}
		else{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
		
		System.out.println("\nPART D");
		y = 7;
		if(y == 8){
			if(x == 5){
				System.out.println("@@@@@");
			}
		}
		else{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
	}

}
