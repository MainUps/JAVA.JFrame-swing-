package 9_AnonymousClass;

public class MyRect implements Measurable{
	private int width, height;
	
	public MyRect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width+height) * 2;
	}

}
