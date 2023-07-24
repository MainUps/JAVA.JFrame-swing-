package 5_RandomGame;

import java.util.Scanner;

public class BunsuTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 분수이 분자와 분모는? : ");
		Bunsu b1 = new Bunsu(input.nextInt(), input.nextInt());
		System.out.print("두 번째 분수이 분자와 분모는? : ");
		Bunsu b2 = new Bunsu(input.nextInt(), input.nextInt());
		b1 = b1.plus(b2);
		b1 = b1.minus(b2);
		System.out.println("b1 = " + b1.toString());
	}
}
