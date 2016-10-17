package ch05;

public class Ex5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 4;
		int counter = 0, i = 3;
		while(counter < 150000){
			if(counter % 2== 0)
				pi -= 4.0/i;
			else
				pi += 4.0/i;
			i+=2;
			counter++;
		}
		System.out.println("PI after 200,000 iterations: " + pi);
		
		double part = pi*100000;
		pi = 4;
		i = 3;
		counter = 0;
		while((long)part != 314159){
			if(counter % 2== 0)
				pi -= 4.0/i;
			else
				pi += 4.0/i;
			i+=2;
			counter++;
			part = pi*100000;
		}
		System.out.println("PI starts with 3.14159 after " + counter + " iterations");
		
	}

}
