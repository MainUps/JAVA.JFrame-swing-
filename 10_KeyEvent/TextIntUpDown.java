package 10_KeyEvent;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextIntUpDown extends JFrame{
	private String message = "";
	
	public TextIntUpDown() {
		setSize(200, 150);
		setTitle("실습문제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextField field = new JTextField(16);
		field.setHorizontalAlignment(JTextField.CENTER);
		JLabel area = new JLabel("");
		area.setFont(new Font("plain", Font.BOLD, 25));
		
		field.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT : message = Integer.toString(Integer.parseInt(message) - 10);
				break;
				
				case KeyEvent.VK_UP : message = Integer.toString(Integer.parseInt(message) + 1);
				break;
				
				case KeyEvent.VK_RIGHT : message = Integer.toString(Integer.parseInt(message) + 10);
				break;
				
				case KeyEvent.VK_DOWN : message = Integer.toString(Integer.parseInt(message) - 1);
				break;
				}
				area.setText(message);
				field.setText(message);
			}
			
			@Override
			public void keyTyped(KeyEvent e) {
				message += e.getKeyChar();
				area.setText(message);
			}
			@Override
			public void keyReleased(KeyEvent e) {}
		});
		
		setLayout(new FlowLayout());
		add(field);
		add(area);
	}
	
	public static void main(String[] args) {
		(new TextIntUpDown()).setVisible(true);
	}

}

