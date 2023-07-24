package 4_JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rectangle extends JFrame{
	private int width, height;
	public Rectangle() {
		String line = JOptionPane.showInputDialog("직사각형의 크기를 입력하세요(가로x세로)").trim().toLowerCase(); // 입력받은 값을 trim으로 공백을 없애고 toLowerCase로 소문자로 변경
		int index = line.indexOf("x");
		width = Integer.parseInt(line.substring(0, index));
		height = Integer.parseInt(line.substring(index+1));
		setTitle("직사각형 그리기");
		setSize(width+100, height+100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, width, height);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Serif", Font.BOLD, 50));
		g.drawString(width + "x" + height, 50, 100);
	}
	
	}




/*
  public Rectangle() {
		
		setTitle("한글테스트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container aPane = getContentPane();
		aPane.setBackground(Color.blue);
		aPane.setLayout(new FlowLayout());
		String text = JOptionPane.showInputDialog(null,"직사각형의 크기를 입력하세요(가로x세로)",null);
		int x = text.indexOf("x");
		int width = Integer.parseInt(text.substring(0, x));
		int length = Integer.parseInt(text.substring(x+1, text.length()));
		setSize(width+100, length+100);
		Font afont = new Font("諛���", Font.PLAIN, 30);
		JLabel label = new JLabel(text);
		label.setFont(afont);
		aPane.add(label);


 */

