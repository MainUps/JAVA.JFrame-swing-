package 1_JFrame,Graphics;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		String line = input.nextLine();
		String lowerLine = line.toLowerCase();
		System.out.print("������ �ܾ �Է��Ͻÿ� : ");
		String word = input.next().toLowerCase();
		
		int beginIndex = lowerLine.indexOf(word);
		String result = line.substring(0, beginIndex) + line.substring(beginIndex+word.length());
		System.out.println("�Է� �ܾ ������ ���� : \n" + result);

	}

}
