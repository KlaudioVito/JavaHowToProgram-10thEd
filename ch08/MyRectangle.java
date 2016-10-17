package ch8;
import java.awt.Color;
import java.awt.Graphics;
public class MyRectangle {
	
	private int x,y,width,height;
	private Color color;
	public MyRectangle(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.drawRect(x, y, width, height);
	}
	public void fill(Graphics g){
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

}
