package ch8;
/**
 * 
 * @author Klaudio
 * Exercise 8.4
 */
public class Rectangle {
	private double width;
	private double height;
	private double area;
	private double perimeter;
	
	Rectangle(double width, double height){
		if(width < 0.0 || width > 20.0 || height < 0.0 || height > 20.0){
			throw new IllegalArgumentException("Width and Length must be between 0 and 20!");
		}
		this.width = width;
		this.height = height;
		this.area = width*height;
		this.perimeter = 2*(width+height);
	}
	
	public double getArea(){
		return this.area;
	}
	public double getPerimeter(){
		return this.perimeter;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
}
