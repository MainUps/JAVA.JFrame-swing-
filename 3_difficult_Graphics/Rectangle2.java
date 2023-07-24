package 3_difficult_Graphics;

public class Rectangle2 {
	public int Width = 0;
	public int Height = 0; 
	
	public Rectangle2() {
		this.Width = 0;
		this.Height = 0;
	}
	public Rectangle2(int Width, int Height) {
		this.Width = Width;
		this.Height = Height;
	}
	
	public void setWidth(int width) {
		this.Width = width;
	}
	
	public void setHeight(int height) {
		this.Height = height;
	}
	public int getWidth() {
		return Width;
	}
	public int getHeight() {
		return Height;
	}
	public int getArea() {
		 return Width*Height;
	}
	
	
	
}
