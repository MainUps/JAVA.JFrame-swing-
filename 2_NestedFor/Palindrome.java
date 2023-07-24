package 2_NestedFor;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("단어를 입력하세요. ");
		String word = input.next();
		
		int length = word.length();
		boolean isPalin = true;
		for (int i = 0, j = length-1; i<j; i++, j--) {
			if(word.charAt(i) != word.charAt(j)) {
				isPalin = false;
				break;
			}
		}
		System.out.print("\"" + word + "\" : ");
		if (isPalin) 
			System.out.println("회문입니다.");
		else
			System.out.println("회문이 아닙니다.");
	}
}
