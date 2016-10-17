package ch8;
/**
 * 
 * @author Klaudio
 * Exercise 8.4
 */
public class RectangleTest {
	public static void main(String[] args){
		Rectangle rect = new Rectangle(3,5);
		double area = rect.getArea();
		double perimeter = rect.getPerimeter();
		double width = rect.getWidth();
		double height = rect.getHeight();
		
		System.out.printf("Rectangele of: \nHeight: %.1f%nWidth: %.1f%nArea: %.1f%nPerimeter: %.1f%n", height, width, area, perimeter);
	}
}
