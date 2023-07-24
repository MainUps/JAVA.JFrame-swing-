package 7_ActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BG_OnOff extends JFrame{
private boolean isOn = false;
	
	public BG_OnOff() {
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("BackGround on/off Example");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("버튼을 누르시오");
		button.addActionListener(new BtnListener());
		cPane.add(button);
	}
	
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			isOn = !isOn;
			JButton btn = (JButton) e.getSource();
			btn.setText(isOn ? "버튼을 누르시오" : "버튼이 눌렸습니다");
			if(isOn)
				(getContentPane()).setBackground(Color.white);
			else
				(getContentPane()).setBackground(Color.black);
		}
	}
	
	public static void main(String[] args) {
		(new BG_OnOff()).setVisible(true);
	}
}
