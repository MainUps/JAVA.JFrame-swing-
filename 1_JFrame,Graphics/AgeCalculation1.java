package 1_JFrame,Graphics;

import java.util.Scanner;

public class AgeCalculation1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ ������? : ");
		int thisYear = input.nextInt();
		
		System.out.print("�¾ ������? : ");
		int birthYear = input.nextInt();
		
		int age =  thisYear - birthYear;
		
		System.out.print("����� ");
		System.out.print(age);
		System.out.println("�� �Դϴ�.");
	}
}
