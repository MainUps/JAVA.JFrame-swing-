package 1_JFrame,Graphics;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculation2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����� �¾ ������? : ");
		int birthYear = input.nextInt();
		
		LocalDate date = LocalDate.now();
		int thisYear = date.getYear();
		
		int age = thisYear - birthYear;
		
		System.out.println("����� " + age + "�� �Դϴ�.");
	}

}
