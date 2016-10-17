package ch7;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Case7_1 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Case7_1(){
		setBackground(Color.YELLOW);
	}

	public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      
	      int centerX = getWidth() / 2;
	      int centerY = getHeight() /2 ;
	      g.drawString("Rectangular       Spiral", centerX-75, centerY-210);
	      g.drawLine(0, centerY, getWidth(), centerY);
	      g.drawLine(centerX, 0, centerX, getHeight() );
	      for(int i = 0; i < 20; i++)
	      {
	    	  g.drawLine(
	    			  centerX + (10 * i), 
	    			  centerY - (10 * i), 
	    			  centerX + (10 * i), 
	    			  centerY + 10 + (10 * i)
	    			  );
	    	  
	    	  g.drawLine(
	    			  centerX + (10 * i), 
	    			  centerY + 10 + (10 * i), 
	    			  centerX - 10 - (10 * i), 
	    			  centerY + 10 + (10 * i)
	    			  );
	            
	    	  g.drawLine(
	    			  centerX - 10 - (10 * i),
	    			  centerY + 10 + (10 * i),
	    			  centerX - 10 - (10 * i),
	    			  centerY - 10 - (10 * i)
	    			  );
	           
	    	  g.drawLine(
	    			  centerX - 10 - (10 * i),
	    			  centerY - 10 - (10 * i),
	    			  centerX + 10 + (10 * i),
	    			  centerY - 10 - (10 * i)
	    			  );
	      }
	      
	}
}
