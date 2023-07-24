package 8_Extends;

import java.awt.Graphics;

class MyShape {
	protected int x, y;
	public MyShape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void draw(Graphics g) { }
}

class MyRect extends MyShape {
	
	private int width, height;
	
	public MyRect(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
	}
}
class MyCircle extends MyShape {
	private int radius;
	
	public MyCircle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void draw(Graphics g) {
		g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
	}
}
	