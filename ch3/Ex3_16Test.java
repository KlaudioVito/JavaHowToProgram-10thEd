package ch03;

import javax.swing.JOptionPane;

public class Ex3_16Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = JOptionPane.showInputDialog("First name: ");
		String lastName = JOptionPane.showInputDialog("Last name: ");
		int month = Integer.parseInt(JOptionPane.showInputDialog("Month of birth: "));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Day of birth: "));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Year of birth: "));
		
		Ex3_16 user = new Ex3_16(firstName, lastName, month, day, year);
		String message = firstName + " " + lastName + " born " + month + "/" + day + "/" + year + "\n" 
				+ "Age " + user.getAge() + " with maximum heart rate " + user.getMaxHeartRate() + "\nhas " + user.getTargetRate();
		
		JOptionPane.showMessageDialog(null, message);
	
	}

}
