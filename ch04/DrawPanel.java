// Fig. 4.18: DrawPanel.java
//  Using drawLine to connect the corners of a panel.
package ch4;
import java.awt.Graphics; 
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

// draws an X from the corners of the panel
   public void paintComponent(Graphics g)
   {
      // call paintComponent to ensure the panel displays correctly
      super.paintComponent(g);
      
      int width = getWidth(); // total width   
      int height = getHeight(); // total height
      int wUnit = width/15;
      int hUnit = height/15;
      int x,y;
      // draw a line from the upper-left to the lower-right
      
      //top-left corner
      x = width;
      y = 0;
      for (int i = 0; i <= 15; i++){
    	  g.drawLine(0, 0,x,y);
    	  x = width-i*wUnit;
    	  y = i*hUnit;
      }
      
      //bottom-right corner
      x = width ;
      y = height ;
      for (int i = 0; i <= 15; i++){
    	  g.drawLine(width,height,x,y);
    	  x = width-i*wUnit;
    	  y = i*hUnit;
      }
      
      //bottom-left corner
      x = 0 ;
      y = height ;
      for (int i = 0; i <= 15; i++){
    	  g.drawLine(0,height,x,y);
    	  x = width-i*wUnit;
    	  y = height-i*hUnit;
      }
      //top-right corner
      x = width ;
      y = 0 ;
      for (int i = 0; i <= 15; i++){
    	  g.drawLine(width,0,x,y);
    	  x = width-i*wUnit;
    	  y = height-i*hUnit;
      }
      // draw a line from the lower-left to the upper-right
      //g.drawLine(0, height, width, 0);
   } 
} // end class DrawPanel

