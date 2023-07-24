package 3_difficult_Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class spiralCurve2 extends JFrame{
	private static final int XINIT = 250;
	private static final int YINIT = 250;
	private static final int K = 4;
	private static final int NUMOFPOINTS = 500;
	private static final double DELTA = 0.1;
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.setFont(new Font("Serif", Font.BOLD, 160));
		g2.drawString("Spiral", 40, 300);
		g2.setColor(new Color(255, 100, 100));
		g2.setStroke(new BasicStroke(5));
		
		int xOld = XINIT, yOld = YINIT, xNew, yNew;
		double t = 0.0;
		for(int i = 0; i < NUMOFPOINTS; i++) {
			xNew = (int) (XINIT + K + t * Math.cos(t));
			yNew = (int) (YINIT + K + t * Math.sin(t));
			
			g.drawLine(xOld, yOld, xNew, yNew);
			xOld = xNew;
			yOld = yNew;
			t += DELTA;
		}
	}

}