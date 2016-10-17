package ch9;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex9_1_Test {
	public static void main (String[] args){
		Ex9_1 panel = new Ex9_1();
		JFrame app = new JFrame();
		JLabel southLabel = new JLabel();
		southLabel.setText("Lines: " + panel.lns + " Ovals: " + panel.ovs + " Rectangles: " + panel.rects);
		panel.add(southLabel, BorderLayout.SOUTH);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(500, 500);
		app.setVisible(true);	
	}
}
