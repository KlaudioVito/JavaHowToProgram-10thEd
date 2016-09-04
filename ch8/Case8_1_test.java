package ch8;
import javax.swing.JFrame;

public class Case8_1_test {
	public static void main (String[] args){
		Case8_1 panel = new Case8_1();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(500, 500);
		app.setVisible(true);	
	}
}
