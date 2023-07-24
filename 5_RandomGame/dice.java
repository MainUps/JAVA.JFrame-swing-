package 5_RandomGame;

import javax.swing.JOptionPane;

public class dice {
	private int tryCount = 0;
	private int number = (int) (Math.random() * 6);
	private int inputIntNumber = 0;
	
public void playGame() {
	String inputStrNumber = JOptionPane.showInputDialog("주사위의 값(1-6)을 입력하시오."); 
	inputIntNumber = Integer.parseInt(inputStrNumber);
	
	while(!check());
	
	}
private boolean check() {
	tryCount++;
	if(inputIntNumber == number) {
		JOptionPane.showMessageDialog(null, "축하합니다. " + tryCount + "번만에 맞추셨습니다!");
		return true;
	}
	else {
	String inputStrNumber = JOptionPane.showInputDialog("틀렸습니다. 다시 입력하시오."); 
	inputIntNumber = Integer.parseInt(inputStrNumber);
	return false;
	}
}

	public static void main(String[] args) {
		dice frame = new dice();
		frame.playGame();
	}
}
