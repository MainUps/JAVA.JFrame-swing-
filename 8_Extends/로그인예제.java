package 8_Extends;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class �α��ο��� extends JFrame{
	
	private JButton btnLogin;
	private JButton btnCancel;
	private JTextField inputId;
	private JPasswordField inputPasswd;
	private JCheckBox storeId;
	
	public �α��ο���() {
		setTitle("����_�α��ο��� �ǽ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
	
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2, 10, 3));
		LoginListener listener = new LoginListener();
		
		JLabel labelId = new JLabel("���̵�", JLabel.RIGHT);
		JLabel labelPasswd = new JLabel("��й�ȣ", JLabel.RIGHT);
		inputId = new JTextField(8);
		inputPasswd = new JPasswordField(8);
		
		storeId = new JCheckBox("���̵� ����", true);
		btnLogin = new JButton("�α���");
		btnCancel = new JButton("���");
		btnLogin.addActionListener(listener);
		btnCancel.addActionListener(listener);
		
		panel.add(labelId);
		panel.add(inputId);
		panel.add(labelPasswd);
		panel.add(inputPasswd);
		panel.add(new JLabel());
		panel.add(storeId);
		panel.add(btnLogin);
		panel.add(btnCancel);
		add(panel);
		pack();
	}
	
	public class LoginListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnLogin) {
				String id = inputId.getText();
				String passwd = new String(inputPasswd.getPassword());
				if (id.equals("test") && passwd.equals("1234")) {
					String msg = "id=" + id + ", passwd=" + passwd + ", store ID=" + (storeId.isSelected() ? true : false);
					(new LoginResultFrame(msg)).setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ���ϼ���!");
					inputPasswd.setText("");
					inputId.selectAll();
					inputId.requestFocus(true);
				}
			}
			else if (e.getSource() == btnCancel) {
					inputId.setText("");
					inputPasswd.setText("");
					inputId.requestFocus(true);
				}
			}
		}
	
	
	public static void main(String[] args) {
		(new �α��ο���()).setVisible(true);
	}
}