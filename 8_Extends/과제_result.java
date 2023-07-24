package 8_Extends;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 과제_result extends JFrame{
	public 과제_result(String text) {
		setSize(400,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setTitle("전공 선택 결과");
		
		JLabel la = new JLabel(text);
		la.setFont(new Font("궁서", Font.PLAIN, 20));
		la.setForeground(Color.BLUE);
		la.setHorizontalAlignment(JLabel.CENTER);
		
		add(la);
	
	}
}


