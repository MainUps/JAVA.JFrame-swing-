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

public class 과제_로그인 extends JFrame{
	JLabel topLa = new JLabel("이름과 전공을 선택하시오");
	JLabel nameLa = new JLabel("이름");;
	JLabel majorLa = new JLabel("전공:");
	JTextField tf = new JTextField(17);
	JRadioButton swBtn = new JRadioButton("소프트웨어");
	JRadioButton virBtn = new JRadioButton("가상현실");
	JButton go = new JButton("Go");
	ButtonGroup group = new ButtonGroup();
	
	public 과제_로그인() {
		setTitle("전공 선택");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 180);
		setLayout(new FlowLayout());
		
		topLa.setFont(new Font("바탕", Font.BOLD, 20));
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
			String text = tf.getText() + "님은 ";
			boolean sw_vir = swBtn.isSelected();
			if(sw_vir) text += "소프트웨어 전공입니다.";
			else text += "가상현실 전공입니다.";
			(new 과제_result(text)).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		(new 과제_로그인()).setVisible(true);
	}
}