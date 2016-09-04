package ch2;

import java.util.Scanner;

public class Ex2_33 {
	public static void main(String[] args){
		System.out.println("--- Welcome to BMI calculator ---");
		System.out.print("Would you like to input in pounds or kilograms? (p/k) ");
		Scanner scan = new Scanner(System.in);
		String answer = scan.next(); 
		double BMI = 0;
		if(answer.equals("p")){
			System.out.print("Enter your weight: ");
			int weight = scan.nextInt();
			System.out.print("Enter your height: ");
			int height = scan.nextInt();
			BMI =(double) (weight*703)/(height*height);
		}
		else if (answer.equals("k")){
			System.out.print("Enter your weight: ");
			double weight = scan.nextDouble();
			System.out.print("Enter your height: ");
			double height = scan.nextDouble();
			BMI =(double) weight/(height*height);
			
		}
		
		if(BMI  < 18.5){
			System.out.printf("Your BMI is %.2f and you are underweight", BMI);
		}
		else if (BMI > 18.5 && BMI < 24.9){
			System.out.printf("Your BMI is %.2f and you are normal", BMI);
		}
		else if (BMI > 25 && BMI < 29.9){
			System.out.printf("Your BMI is %.2f and you are overweight", BMI);
		}
		else if (BMI > 30){
			System.out.printf("Your BMI is %.2f and you are obese", BMI);
		}
		scan.close();
	}
}
