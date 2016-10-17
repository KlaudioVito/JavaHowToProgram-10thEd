package ch4;
import java.awt.Graphics; 
import javax.swing.JPanel;
public class Case4_2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// draws an X from the corners of the panel
	   public void paintComponent(Graphics g) {
	      // call paintComponent to ensure the panel displays correctly
	      super.paintComponent(g);
	      
	      int width = getWidth(); // total width   
	      int height = getHeight(); // total height
	      int wUnit = width/15;
	      int hUnit = height/15;
	      //bottom-left corner
	      for (int i = 0; i <= 15; i++){
	    	  g.drawLine(0, i*hUnit,(i+1)*wUnit, height-1);
	      }
	    //top-right corner
	      for (int i = 0; i <= 15; i++){
	    	  g.drawLine(width-1, i*hUnit,(i+1)*wUnit, 0);
	      }	
	     
	    //corner
	   
	  }
}
