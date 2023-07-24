package 1_JFrame,Graphics;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class AgeCalculation3 {

	public static void main(String[] args) {
		String birthString = JOptionPane.showInputDialog("당신이 태어난 연도는? ");
		int birthYear = Integer.parseInt(birthString);				
		LocalDate date = LocalDate.now();
		int thisYear = date.getYear();
		
		int age = thisYear - birthYear;
		JOptionPane.showMessageDialog(null, "당신의 나이는 " + age + "살 입니다.");
		
		System.exit(0);
	}

}
 