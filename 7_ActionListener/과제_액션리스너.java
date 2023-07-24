package 7_ActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 과제_액션리스너 extends JFrame{
	public 과제_액션리스너() {
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("버튼 색상 예제");
		
		Container cPane = getContentPane();
		cPane.setLayout(new GridLayout(4,4,1,1));
		
		
		for(int i=0; i<=15; i++) {
			JButton bu = new JButton(i+"");
			bu.setBackground(Color.WHITE);
			cPane.add(bu);
			bu.addActionListener(new BListener());
		}
	}

	private class BListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			Color a = btn.getBackground();
			if(a == Color.WHITE) {
				btn.setBackground(Color.YELLOW);
			}
			else {
				btn.setBackground(Color.WHITE);
			}
		}
	}
	
	public static void main(String[] args) {
		(new 과제_액션리스너()).setVisible(true);
	}
}
