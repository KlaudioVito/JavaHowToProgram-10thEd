package ch9;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Ex9_1 extends JPanel {
	private SecureRandom randomNumbers = new SecureRandom();
	private MyRectangle[] rectangles;
	private MyOval [] ovals;
	private MyLine[] lines;
	private int fill;
	protected int lns = 0;
	protected int ovs = 0;
	protected int rects = 0;
	public Ex9_1(){
		setBackground(Color.WHITE);
		lines = new MyLine[5 + randomNumbers.nextInt(5)];
		for(int i = 0; i < lines.length; i++){
			int x1 = 10 + randomNumbers.nextInt(200);
			int x2 = 10 + randomNumbers.nextInt(250);
			int y1 = 10 + randomNumbers.nextInt(200);
			int y2 = 10 + randomNumbers.nextInt(300);
			lns++;
			lines[i] = new MyLine(x1,y1,x2,y2);
		}
		rectangles = new MyRectangle[5 + randomNumbers.nextInt(5)];	
		for(int i = 0; i < rectangles.length; i++){
			int x = randomNumbers.nextInt(200);
			int y = randomNumbers.nextInt(400);
			int width = randomNumbers.nextInt(150);
			int height = randomNumbers.nextInt(150);
			Color color = new Color(randomNumbers.nextInt(200),randomNumbers.nextInt(200),randomNumbers.nextInt(200));
			rects++;
			rectangles[i] = new MyRectangle(x,y,width,height,color);	
		}
		ovals = new MyOval[5 + randomNumbers.nextInt(5)];
		for(int i = 0; i < ovals.length; i++){
			int x = randomNumbers.nextInt(500);
			int y = randomNumbers.nextInt(500);
			int width = randomNumbers.nextInt(150);
			int height = randomNumbers.nextInt(150);
			ovs++;
			Color color = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));
			ovals[i] = new MyOval(x,y,width,height,color);	
		}
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < rectangles.length; i++){
			fill = randomNumbers.nextInt(2);
			if(fill == 1)
				rectangles[i].draw(g);
			else
				rectangles[i].fill(g);
		}

		for(int i = 0; i < ovals.length; i++){
			fill = randomNumbers.nextInt(2);
			if(fill == 1)
				ovals[i].draw(g);
			else
				ovals[i].fill(g);
		}
		
		for(int i = 0; i < lines.length; i++){
			lines[i].draw(g);
		}
	}
}
