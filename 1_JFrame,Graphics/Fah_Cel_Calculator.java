package 1_JFrame,Graphics;

import java.util.Scanner;

public class Fah_Cel_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하시오 : ");
		int fah = input.nextInt();
		int cel = (int) ((fah - 32) / 1.8);
		System.out.println("화씨 온도 " + fah + "는 " + cel + "도 입니다.");
	}

}
