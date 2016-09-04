package ch6;
import javax.swing.JFrame;
public class Case6_1_Test {
	public static void main(String[] args)
	   {
	      Case6_1 panel = new Case6_1();      
	      JFrame application = new JFrame();
	      
	      
	      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      application.add(panel);
	      application.setSize(500, 500);      
	      application.setVisible(true);
	   }

}
