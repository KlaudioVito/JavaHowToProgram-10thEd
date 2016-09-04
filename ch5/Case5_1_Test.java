package ch5;
import javax.swing.JFrame;

public class Case5_1_Test {
	public static void main(String[] args){
		
	      // create the panel with the user's input
	      Case5_1 panel = new Case5_1();
	      
	      JFrame application = new JFrame(); // creates a new JFrame

	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      application.add(panel); 
	      application.setSize(400, 400); 
	      application.setVisible(true); 
	   }

}
