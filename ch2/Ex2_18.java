package ch2;

public class Ex2_18 {
	public static void main(String[] args){
		for(int i = 0; i < 9; i++){
			System.out.print("*");
		}
		System.out.println();
		for(int i = 0; i < 7; i++){
			System.out.println("*\t*");
		}
		for(int i = 0; i < 9; i++){
			System.out.print("*");
		}
		
		System.out.println("\n\n");
		System.out.print("   ");
		for(int i = 0; i < 3; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println(" *\t*");
		for(int i = 0; i < 5; i++){
			System.out.println("*\t *");
		}
		System.out.println(" *\t*");
		System.out.print("   ");
		for(int i = 0; i < 3; i++){
			System.out.print("*");
		}
		System.out.println("\n\n");
		
		for(int i = 0; i < 5; i+=2){
			for(int j = 0; j < 3-i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(int l = 0; l < 6; l++){
			System.out.println("  *");
		}
		
		System.out.println("\n\n");
		for(int i = 0; i < 5; i++){
			
		}
	}
}
