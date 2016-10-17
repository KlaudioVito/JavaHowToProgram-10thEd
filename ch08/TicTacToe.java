package ch8;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JLabel;
@SuppressWarnings("serial")
public class TicTacToe extends JComponent {
	private int A[] = new int [9];
	private final int EMPTY = -1;
	//private final int X = 1;
	//private final int O = 0;
	public int width, height;
	private Color color = new Color(250,200,156);
	MyOval Os;
	MyLine Line1, Line2;
	JLabel box1 = new JLabel ("1");
	JLabel box2 = new JLabel ("2");
	JLabel box3 = new JLabel ("3");
	JLabel box4 = new JLabel ("4");
	JLabel box5 = new JLabel ("5");
	JLabel box6 = new JLabel ("6");
	JLabel box7 = new JLabel ("7");
	JLabel box8 = new JLabel ("8");
	JLabel box9 = new JLabel ("9");
	
	public TicTacToe(int width, int height){
		this.width = width;
		this.height = height;
		for (int i = 0; i < A.length; i++){
			A[i] = EMPTY;
		}
		
		box1.setBounds(0,-100, 250, 250);
		box2.setBounds(width/3+10,-100, 250, 250);
		box3.setBounds(2*width/3+10,-100, 250, 250);
		box4.setBounds(0,70, 250, 250);
		box5.setBounds(width/3+10,70, 250, 250);
		box6.setBounds(2*width/3+10,70, 250, 250);
		
		box7.setBounds(0,220, 250, 250);
		box8.setBounds(width/3+10,220, 250, 250);
		box9.setBounds(2*width/3+10,220, 250, 250);
		add(box1);
		add(box2);
		add(box3);
		add(box4);
		add(box5);
		add(box6);
		add(box7);
		add(box8);
		add(box9);
		
		Os = new MyOval(0,0,width/3, height/3,color);
		Line1 = new MyLine (width/3,0,2*width/3, height/3);
		Line2 = new MyLine (width/3,height/3,2*width/3, 0);
	}
	 	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.BLACK);
		Os.draw(g);
		Line1.draw(g);
		Line2.draw(g);
		g.drawRect(0, 0, width, height);
		g.drawLine(width/3,0 ,width/3 , height);
		g.drawLine(2*width/3,0 ,2*width/3 , height);
		g.drawLine(0,height/3 ,width, height/3);
		g.drawLine(0,2*height/3 ,width, 2*height/3);
	}

}
