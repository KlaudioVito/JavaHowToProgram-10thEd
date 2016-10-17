package ch8;

import javax.swing.JFrame;

public class TicTacToeTest {
	public static void main (String[] args){
		TicTacToe panel = new TicTacToe(500,500);
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(panel.width, panel.height);
		app.setVisible(true);	
	}
}
