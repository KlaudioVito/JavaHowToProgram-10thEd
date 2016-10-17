package ch8;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
@SuppressWarnings("serial")
public class Case8_1 extends JPanel {
	private SecureRandom randomNumbers = new SecureRandom();
	private MyRectangle[] rectangles;
	private MyOval [] ovals;
	private int fill;
	public Case8_1(){
		setBackground(Color.WHITE);
		rectangles = new MyRectangle[5 + randomNumbers.nextInt(5)];	
		for(int i = 0; i < rectangles.length; i++){
			int x = randomNumbers.nextInt(200);
			int y = randomNumbers.nextInt(400);
			int width = randomNumbers.nextInt(150);
			int height = randomNumbers.nextInt(150);
			Color color = new Color(randomNumbers.nextInt(200),randomNumbers.nextInt(200),randomNumbers.nextInt(200));
			
			rectangles[i] = new MyRectangle(x,y,width,height,color);	
		}
		ovals = new MyOval[5 + randomNumbers.nextInt(5)];
		for(int i = 0; i < ovals.length; i++){
			int x = randomNumbers.nextInt(500);
			int y = randomNumbers.nextInt(500);
			int width = randomNumbers.nextInt(150);
			int height = randomNumbers.nextInt(150);
			
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
	}
}
