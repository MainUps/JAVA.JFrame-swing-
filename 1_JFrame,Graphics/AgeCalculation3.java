package 1_JFrame,Graphics;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AgeCalculation3 {

	public static void main(String[] args) {
		String birthString = JOptionPane.showInputDialog("����� �¾ ������? ");
		int birthYear = Integer.parseInt(birthString);				
		LocalDate date = LocalDate.now();
		int thisYear = date.getYear();
		
		int age = thisYear - birthYear;
		JOptionPane.showMessageDialog(null, "����� ���̴� " + age + "�� �Դϴ�.");
		
		System.exit(0);
	}

}
 