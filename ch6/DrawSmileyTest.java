// Fig. 6.12: DrawSmileyTest.java
// Test application that displays a smiley face.
package ch6;
import javax.swing.JFrame;

public class DrawSmileyTest
{
   public static void main(String[] args)
   {
      DrawSmiley panel = new DrawSmiley();      
      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(500, 500);      
      application.setVisible(true);
   }
} // end class DrawSmileyTest

