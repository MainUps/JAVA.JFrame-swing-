package 7_ActionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleBtnExample extends JFrame{
	private JButton btnRed;	
	private JButton btnYellow;	
	
	public class ButtonListener implements ActionListener {
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnRed)
				(getContentPane()).setBackground(Color.red);
			else if (e.getSource() == btnYellow)
				(getContentPane()).setBackground(Color.yellow);
		}
	}
	public SimpleBtnExample() {
		setSize(300, 150);
		setTitle("Simple Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cPane = getContentPane();
		cPane.setBackground(Color.GREEN);
		cPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("��ư�� ��������");
		btnRed = new JButton("����");
		btnYellow = new JButton("���");
		
		
		ButtonListener listener = new ButtonListener();
		btnRed.addActionListener(listener);
		btnYellow.addActionListener(listener);
		cPane.add(label);
		cPane.add(btnRed);
		cPane.add(btnYellow);
	}
	public static void main(String[] args) {
		(new SimpleBtnExample()).setVisible(true);
	}
}
