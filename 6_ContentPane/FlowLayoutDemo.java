package 6_ContentPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame{
	public FlowLayoutDemo() {
	setTitle("FlowLayoutDemo");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	Container cPane = getContentPane();
	cPane.setLayout(new FlowLayout());
	cPane.add(makePanel(Color.RED));
	cPane.add(makePanel(Color.ORANGE));
	cPane.add(makePanel(Color.YELLOW));
	cPane.add(makePanel(Color.GREEN));
	cPane.add(makePanel(Color.CYAN));
	cPane.add(makePanel(Color.BLUE));
	cPane.add(makePanel(Color.MAGENTA));
	pack(); // �� ǥ���ϱ� ���� setSize���ִ� �Լ�
	}
	private static JPanel makePanel(Color color) {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(color);
		return panel;
	}
	
	public static void main(String[] args) {
		(new FlowLayoutDemo()).setVisible(true);
	}
}
