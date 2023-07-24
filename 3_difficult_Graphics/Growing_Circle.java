package 3_difficult_Graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Growing_Circle extends JFrame{
	public void paint(Graphics g) {
		
		//String[] colorArr = {"RED", "GREEN", "BLUE"};
		//g.setColor(Color.colorArr[0]);
		for(int countOval=1, plusSize=0; countOval <= 20; countOval++, plusSize+=10) {
			if(countOval % 3 == 1) 	g.setColor(Color.RED);
			if(countOval % 3 == 2) 	g.setColor(Color.GREEN);
			if(countOval % 3 == 0) 	g.setColor(Color.BLUE);
			
			g.fillOval(30+plusSize,30+plusSize, 50+plusSize, 50+plusSize);
			
		}
		
	}

}
