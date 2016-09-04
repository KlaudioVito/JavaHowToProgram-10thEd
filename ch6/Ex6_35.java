package ch6;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
public class Ex6_35 {
	public static int prod, input;
	public static void askQuestion(){
		SecureRandom randomNumbers = new SecureRandom();
		int num1, num2;
		num1 = 1 + randomNumbers.nextInt(10);
		num2 = 1 + randomNumbers.nextInt(10);
		prod = num1 * num2;
		input = Integer.parseInt(JOptionPane.showInputDialog(null, ("How much is " + num1 + " * " + num2)));
	}

	public static void main (String[] args){
		
		
		boolean correct = false;
		while (!correct){
			askQuestion();
			if(input == prod){
				JOptionPane.showMessageDialog(null, ("Very good!"));
				askQuestion();
				correct = true;
			}
			else{
				JOptionPane.showMessageDialog(null, "No. Try again!");
				correct = false;
			}
		}

	}

}
