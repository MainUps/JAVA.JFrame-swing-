package 1_JFrame,Graphics;

import javax.swing.JFrame;

public class HappyFaceDemo {
	public static void main(String[] args) {
		HappyFace face = new HappyFace();
		face.setTitle("HappyFrame Example");
		face.setSize(500, 500);
		face.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		face.setVisible(true);
	}
}

