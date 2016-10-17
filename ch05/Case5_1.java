package ch5;
import java.awt.Graphics; //handle the display
import javax.swing.JPanel;

public class Case5_1 extends JPanel {
	   
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// draws a cascade of shapes starting from the top-left corner
	   public void paintComponent(Graphics g)
	   {
	      super.paintComponent(g);
	      int width = getWidth();
	      int centerW = width/2;
	      
	      int height = getHeight();
	      int centerH = height/2;
	      g.drawLine(width/2, 0, width/2, height);
	      g.drawLine(0, height/2, width, height/2);
	      
	      for (int i = 0; i < 10; i++)
	      {
	          g.drawOval(centerW-(i*20), centerH-(i*20), 
	                   i*40,i*40);
	          
	      } 
	   } 

}
