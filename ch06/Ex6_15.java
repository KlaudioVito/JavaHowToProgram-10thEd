package ch06;

public class Ex6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Triangle\tSide1\tSide2\tHypotenuse");
		System.out.println( "1\t\t3.0\t4.0\t" + hypotenuse(3.0,  4.0));
		System.out.println("2\t\t5.0\t12.0\t" + hypotenuse(5.0, 12.0));
		System.out.println("3\t\t8.0\t15.0\t" + hypotenuse(8.0, 15.0));
	}
	
	private static double hypotenuse(double side1, double side2){
		double h = Math.pow(side1, 2) + Math.pow(side2, 2);
		return Math.sqrt(h);
	}
}
