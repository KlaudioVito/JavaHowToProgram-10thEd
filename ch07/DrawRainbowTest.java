// Fig. 7.26: DrawRainbowTest.java
// Test application to display a rainbow.
package ch7;
import javax.swing.JFrame;
public class DrawRainbowTest
{
   public static void main(String[] args)
   {
      DrawRainbow panel = new DrawRainbow();      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(400, 200);
      application.setVisible(true);
   } 
} // end class DrawRainbowTest
