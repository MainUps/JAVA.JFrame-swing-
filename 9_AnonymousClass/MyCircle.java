package 9_AnonymousClass;

public class MyCircle implements Measurable{
	public static final double PI = 3.14159;
	private int radius;
	
	public MyCircle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return PI * radius * 2;
	}
	public int getDiameter() {
		return 2 * radius;
	}
}
