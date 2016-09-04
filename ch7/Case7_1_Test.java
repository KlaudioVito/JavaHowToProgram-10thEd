package ch7;
import javax.swing.JFrame;
public class Case7_1_Test {
	public static void main(String[] args)
	   {
	      Case7_1 panel = new Case7_1();      
	      JFrame application = new JFrame();
	      
	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      application.add(panel);
	      application.setSize(500, 500);
	      application.setVisible(true);
	   } 
}
