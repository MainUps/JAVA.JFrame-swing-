package 1_JFrame,Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;

public class IncheolFrame extends JFrame {
	public void paint(Graphics g) {
		
		g.drawOval(220, 100, 100, 100); 	//し
		
		g.drawLine(380, 80, 380, 220);		//び
		
		g.drawLine(260, 260, 260, 300);		//い
		g.drawLine(260, 300, 380, 300);		
		
		g.drawLine(550, 70, 640, 70);		//ず
		g.drawLine(520, 90, 670, 90);
		g.drawLine(670, 90, 520, 180);  
		g.drawLine(595, 135, 670, 180);		
		
		g.drawLine(670, 130, 720, 130);		// っ
		g.drawLine(720, 80, 720, 220);
		
		g.drawLine(560, 250, 700, 250);		// ぉ
		g.drawLine(700, 250, 700, 275);
		g.drawLine(560, 275, 700, 275);
		g.drawLine(560, 275, 560, 300);
		g.drawLine(560, 300, 700, 300);
	}
}
