package 5_RandomGame;

import java.util.Scanner;

public class BunsuTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° �м��� ���ڿ� �и��? : ");
		Bunsu b1 = new Bunsu(input.nextInt(), input.nextInt());
		System.out.print("�� ��° �м��� ���ڿ� �и��? : ");
		Bunsu b2 = new Bunsu(input.nextInt(), input.nextInt());
		b1 = b1.plus(b2);
		b1 = b1.minus(b2);
		System.out.println("b1 = " + b1.toString());
	}
}
