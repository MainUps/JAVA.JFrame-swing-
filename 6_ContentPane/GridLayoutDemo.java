package 6_ContentPane;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame{
	public GridLayoutDemo() {
		setTitle("GridLayoutDemo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		
		cp.setLayout(new GridLayout(4, 2, 5, 0));
		JLabel la_id = new JLabel("���̵�");
		la_id.setHorizontalAlignment(JLabel.RIGHT);
		JLabel la_pw = new JLabel("��й�ȣ");
		la_pw.setHorizontalAlignment(JLabel.RIGHT);
		
		cp.add(la_id);
		cp.add(new JTextField());
		cp.add(la_pw);
		cp.add(new JTextField());
		cp.add(new JLabel());
		cp.add(new JCheckBox("���̵� ����",true));
		cp.add(new JButton("�α���"));
		cp.add(new JButton("���"));
		pack();
	}
	
	public static void main(String[] args) {
		//new GridLayoutDemo().setVisible(true);
		(new GridLayoutDemo()).setVisible(true);
	}
}
