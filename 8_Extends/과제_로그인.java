package 8_Extends;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ����_�α��� extends JFrame{
	JLabel topLa = new JLabel("�̸��� ������ �����Ͻÿ�");
	JLabel nameLa = new JLabel("�̸�");;
	JLabel majorLa = new JLabel("����:");
	JTextField tf = new JTextField(17);
	JRadioButton swBtn = new JRadioButton("����Ʈ����");
	JRadioButton virBtn = new JRadioButton("��������");
	JButton go = new JButton("Go");
	ButtonGroup group = new ButtonGroup();
	
	public ����_�α���() {
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 180);
		setLayout(new FlowLayout());
		
		topLa.setFont(new Font("����", Font.BOLD, 20));
		topLa.setForeground(Color.MAGENTA);
		topLa.setHorizontalAlignment(JLabel.CENTER);
		
		swBtn.setSelected(true);
		group.add(swBtn);
		group.add(virBtn);
		
		goListener listener = new goListener();
		go.addActionListener(listener);
		
		add(topLa);
		add(nameLa);
		add(tf);
		add(majorLa);
		add(swBtn);
		add(virBtn);
		add(go);
	}
	
	public class goListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			String text = tf.getText() + "���� ";
			boolean sw_vir = swBtn.isSelected();
			if(sw_vir) text += "����Ʈ���� �����Դϴ�.";
			else text += "�������� �����Դϴ�.";
			(new ����_result(text)).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		(new ����_�α���()).setVisible(true);
	}
}