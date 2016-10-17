package ch04;

public class Ex4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		System.out.println("N\t10*N\t100*N\t1000*N\n");
		while(counter < 6){
			System.out.println(counter + "\t" + counter*10 + "\t" + counter*100 + "\t" + counter*1000);
			counter++;
		}
	}
}
