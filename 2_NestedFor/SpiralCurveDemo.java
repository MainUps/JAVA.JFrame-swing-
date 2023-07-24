package 2_NestedFor;

import javax.swing.JFrame;

public class SpiralCurveDemo {

	public static void main(String[] args) {
		SpiralCurve spiral = new SpiralCurve();
		spiral.setSize(500, 500);
		spiral.setTitle("Spiral Demo");
		spiral.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		spiral.setVisible(true);
	}
}
