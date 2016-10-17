package ch6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;


public class Case6_1 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SecureRandom randomNumbers = new SecureRandom();
	private boolean colorChoice;
	private Color color1, color2;
	
	public void paintComponent(Graphics g) {
	   super.paintComponent(g);
	   color1 = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));
	   color2 = new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));
	   int width = getWidth();
	   int centerW = width/2;
	   int height = getHeight();
	   int centerH = height/2;
	   colorChoice = true;
	   
	   for (int i = 10; i > 0; i--){
		   
		   if(colorChoice)
			   g.setColor(color1);
		   else
			   g.setColor(color2);
		   
		   colorChoice = !colorChoice;
	       
		   g.fillOval(centerW-(i*20), centerH-(i*20), i*40,i*40);     
	   }
	   g.setColor(Color.BLACK);
	   g.drawLine(width/2, 0, width/2, height);
	   g.drawLine(0, height/2, width, height/2);
	   g.drawLine(0, 0, width,height);
	   g.drawLine(0, height,width ,0);
	  
	}
}
