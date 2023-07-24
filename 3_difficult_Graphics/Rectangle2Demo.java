package 3_difficult_Graphics;

public class Rectangle2Demo {

	public static void main(String[] args) {
		Rectangle2 rec1 = new Rectangle2();
		rec1.setWidth(25);
		rec1.setHeight(20);
		System.out.println("rec1의 면적=" + rec1.getArea());
		
		Rectangle2 rec2 = new Rectangle2(12, 15);
		rec2.setHeight(18);
		System.out.println("rec2의 면적=" + rec2.getArea());
	}
}
