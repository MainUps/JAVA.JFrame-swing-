package 2_NestedFor;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("10 미만의 정수를 입력하세요 : ");
		int num = in.nextInt();
		
		for(int i=1, blank=num-1; i<=num; i++, blank--) {
			for(int j=1; j<=blank; j++) {System.out.print(" ");}
			for(int k=1; k<=i; k++) {System.out.print(k);}
			
			System.out.println("");
		}
	}
}
