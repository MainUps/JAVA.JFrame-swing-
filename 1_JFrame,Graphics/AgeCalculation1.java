package 1_JFrame,Graphics;

import java.util.Scanner;

public class AgeCalculation1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("올해의 연도는? : ");
		int thisYear = input.nextInt();
		
		System.out.print("태어난 연도는? : ");
		int birthYear = input.nextInt();
		
		int age =  thisYear - birthYear;
		
		System.out.print("당신은 ");
		System.out.print(age);
		System.out.println("살 입니다.");
	}
}
