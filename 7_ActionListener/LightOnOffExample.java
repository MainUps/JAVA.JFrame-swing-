package 7_ActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LightOnOffExample extends JFrame{
	private boolean isOn = false;
	
	public LightOnOffExample() {
		setSize(380, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Light on/iff Example");
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JButton button = new JButton("ÄÑ±â");
		
		
		//button.addActionListener(new BtnListener());
		//cPane.add(button);
		
		//BtnListener listener = new BtnListener();
		//button.addActionListener(listener);
		//cPane.add(button);
		
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isOn = !isOn;
				JButton btn = (JButton) e.getSource();
				btn.setText(isOn ? "²ô±â" : "ÄÑ±â");
				repaint();
			}
		});
		cPane.add(button);
	}
	
	/*
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			isOn = !isOn;
			JButton btn = (JButton) e.getSource();
			btn.setText(isOn ? "²ô±â" : "ÄÑ±â");
			repaint();
		}
	}
	*/
	
	public void paint(Graphics g) {
		if(isOn)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.darkGray);
		g.fillRect(50, 100, 80, 100);
		g.fillRect(150, 100, 80, 100);
		g.fillRect(250, 100, 80, 100);
	}
	
	
	
	public static void main(String[] args) {
		(new LightOnOffExample()).setVisible(true);
	}

}



