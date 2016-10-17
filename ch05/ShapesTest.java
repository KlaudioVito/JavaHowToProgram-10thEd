// Fig. 5.27: ShapesTest.java
// Test application that displays class Shapes.
package ch5;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main(String[] args)
   {
      // obtain user's choice
      String input = JOptionPane.showInputDialog(
         "Enter 1 to draw rectangle\n" +
         "Enter 2 to draw ovals\n" + 
         "Enter 3 to draw both ");
      
      
      int choice = Integer.parseInt(input); // convert input to int
      
      // create the panel with the user's input
      Shapes panel = new Shapes(choice);
      
      JFrame application = new JFrame(); // creates a new JFrame

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel); 
      application.setSize(300, 300); 
      application.setVisible(true); 
   }
} // end class ShapesTest