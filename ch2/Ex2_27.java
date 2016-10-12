package ch02;

public class Ex2_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 8; i++){
			
			if(i%2!=0){
				System.out.print(" ");
				for(int j = 0; j < 8; j++){
					System.out.print("*");
				}
			}
			else{
				for(int j = 0; j < 8; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
