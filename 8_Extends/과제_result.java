package 8_Extends;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ����_result extends JFrame{
	public ����_result(String text) {
		setSize(400,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setTitle("���� ���� ���");
		
		JLabel la = new JLabel(text);
		la.setFont(new Font("�ü�", Font.PLAIN, 20));
		la.setForeground(Color.BLUE);
		la.setHorizontalAlignment(JLabel.CENTER);
		
		add(la);
	
	}
}


