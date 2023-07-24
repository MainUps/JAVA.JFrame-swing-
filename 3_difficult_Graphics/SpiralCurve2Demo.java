package 3_difficult_Graphics;

import javax.swing.JFrame;

public class SpiralCurve2Demo {

	public static void main(String[] args) {
		spiralCurve2 spiral = new spiralCurve2();
		spiral.setSize(500, 500);
		spiral.setTitle("Spiral Demo");
		spiral.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spiral.setVisible(true);
	}
}