package ch05;

public class Ex5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("PART A\n");
		for(int x = 0; x < 10; x++){
			for(int y = 0; y <= x; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPART B");
		for(int x = 10; x > 0; x--){
			for(int y = 0; y < x; y++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nPART C");
		for(int x = 10; x > 0; x--){
			for(int y = 10; y >= 0; y--){
				if(y < x)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("PART D");
		for(int x = 0; x < 10; x++)
		{
		    for(int y = 10; y >= 0; y--)
		    {
		        if(x < y)
		            System.out.print(" ");
		        else
		            System.out.print("*");
		    }
		    System.out.println();
		}
	}

}
