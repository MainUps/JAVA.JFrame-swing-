package 10_KeyEvent;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		int[] arr = {11, 12, 13};
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int count = input.nextInt();
		
		try {
			int result = arr[count] / count;
			System.out.println("result = " + result);
		}
		catch (ArithmeticException e) {
			System.out.println("catching ArithmeticException");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catching ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("catching Exception");
			e.printStackTrace();
		}
		System.out.print("종료되었습니다.");
	}
}
