package 5_RandomGame;

import javax.swing.JOptionPane;

public class dice {
	private int tryCount = 0;
	private int number = (int) (Math.random() * 6);
	private int inputIntNumber = 0;
	
public void playGame() {
	String inputStrNumber = JOptionPane.showInputDialog("�ֻ����� ��(1-6)�� �Է��Ͻÿ�."); 
	inputIntNumber = Integer.parseInt(inputStrNumber);
	
	while(!check());
	
	}
private boolean check() {
	tryCount++;
	if(inputIntNumber == number) {
		JOptionPane.showMessageDialog(null, "�����մϴ�. " + tryCount + "������ ���߼̽��ϴ�!");
		return true;
	}
	else {
	String inputStrNumber = JOptionPane.showInputDialog("Ʋ�Ƚ��ϴ�. �ٽ� �Է��Ͻÿ�."); 
	inputIntNumber = Integer.parseInt(inputStrNumber);
	return false;
	}
}

	public static void main(String[] args) {
		dice frame = new dice();
		frame.playGame();
	}
}
