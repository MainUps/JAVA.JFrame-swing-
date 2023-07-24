package 6_ContentPane;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame{
	public RadioButtonDemo() {
		setSize(300, 100);
		setTitle("Radio Button Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());
		JRadioButton button1 = new JRadioButton("라디오버튼 1", true); //true는 초기값
		JRadioButton button2 = new JRadioButton("라디오버튼 2");
		
		ButtonGroup group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		
		contentpane.add(button1);
		contentpane.add(button2);
	}

	public static void main(String[] args) {
		(new RadioButtonDemo()).setVisible(true);
	}

}
