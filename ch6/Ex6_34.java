package ch06;

public class Ex6_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 256; i++){
			System.out.print("Decimal = " + i + "\t");
			toBinary(i);
			System.out.print("\t");
			toHex(i);
			System.out.print("\t");
			toOctal(i);
			System.out.println();
		}
	}
	
	private static void toBinary(int number){
		System.out.print("Binary = ");
		if(number == 0)
			System.out.print(0);
		while(number > 0){
			System.out.print(number%2);
			number /= 2;
		}
	}
	
	private static void toHex(int number){
		System.out.print("Hexadecimal = ");
		if(number == 0)
			System.out.print(0);
		while(number > 0){
			int hex = number%16;
			if(hex < 10)
				System.out.print(hex);
			else if(hex == 10)
				System.out.print("A");
			else if(hex == 11)
				System.out.print("B");
			else if(hex == 12)
				System.out.print("C");
			else if(hex == 13)
				System.out.print("D");
			else if(hex == 14)
				System.out.print("E");
			else if(hex == 15)
				System.out.print("F");
			number /= 16;
		}
	}
	
	private static void toOctal(int number){
		System.out.print("Octal = ");
		if(number == 0)
			System.out.print(0);
		while(number > 0){
			System.out.print(number%8);
			number /= 8;
		}
	}

}
