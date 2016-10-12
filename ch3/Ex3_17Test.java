package ch03;

import javax.swing.JOptionPane;

public class Ex3_17Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = JOptionPane.showInputDialog("First name: ");
		String lastName = JOptionPane.showInputDialog("Last name: ");
		String gender = JOptionPane.showInputDialog("Gender: ");
		int month = Integer.parseInt(JOptionPane.showInputDialog("Month of birth: "));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Day of birth: "));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Year of birth: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Height (inches): "));
		int weight = Integer.parseInt(JOptionPane.showInputDialog("Weight (pounds): "));
		
		Ex3_17 user = new Ex3_17(firstName, lastName, gender, month, day, year, height, weight);
		int age = user.getAge();
		int maxRate = user.getMaxHeartRate();
		String targetRate = user.getTargetRate();
		double bmi = user.getBMI();
		String BMI = "";
		if(bmi  < 18.5)			           BMI = "Your BMI is " + bmi + " and you are underweight";
		else if (bmi > 18.5 && bmi < 24.9) BMI = "Your BMI is " + bmi + " and you are normal";
		else if (bmi > 25 && bmi < 29.9)   BMI = "Your BMI is " + bmi + " and you are overweight";
		else if (bmi > 30)				   BMI = "Your BMI is " + bmi + " and you are obese";
		
		String message = firstName + " " + lastName + " (" + gender + ") born " + month + "/" + day + "/" + year + "\n" 
				+ "Age " + age + " with maximum heart rate " + maxRate + "\nhas " + targetRate + "\n" + BMI;
		
		JOptionPane.showMessageDialog(null, message);
	}

}
