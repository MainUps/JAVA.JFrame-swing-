package 1_JFrame,Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;

public class HappyFace extends JFrame {
	public void paint(Graphics g) {
		g.drawOval(100, 100, 300, 300); 			// 
		g.fillOval(180, 150, 20, 50);				//
		g.fillOval(300, 150, 20, 50);				// 
		g.drawArc(180, 250, 150, 100, 180, 180);	//
	}
}

