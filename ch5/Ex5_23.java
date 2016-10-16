package ch05;

public class Ex5_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 9, a = 2, b = 1, g = 5, i = 11, j = 99;
		System.out.println("PART A");
		System.out.println("Original output: " + (!(x < 5) && !(y >= 7)));
		System.out.println("Modified output: " + !((x < 5) || (y >= 7)));
		
		System.out.println("\nPART B");
		System.out.println("Original output: " + (!(a == b) || !(g != 5)));
		System.out.println("Modified output: " + !((a == b) && (g != 5)));
		
		System.out.println("\nPART C");
		System.out.println("Original output: " + !((x <= 8) && (y > 4)));
		System.out.println("Modified output: " + (!(x <= 8) || !(y > 4)));
		
		System.out.println("\nPART D");
		System.out.println("Original output: " + !((i > 4) || (j <= 6)));
		System.out.println("Modified output: " + (!(i > 4) && !(j <= 6)));
	}

}
