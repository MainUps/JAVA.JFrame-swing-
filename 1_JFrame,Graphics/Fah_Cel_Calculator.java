package 1_JFrame,Graphics;

import java.util.Scanner;

public class Fah_Cel_Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ȭ�� �µ��� �Է��Ͻÿ� : ");
		int fah = input.nextInt();
		int cel = (int) ((fah - 32) / 1.8);
		System.out.println("ȭ�� �µ� " + fah + "�� " + cel + "�� �Դϴ�.");
	}

}
