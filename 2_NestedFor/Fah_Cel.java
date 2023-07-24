package 2_NestedFor;

import java.util.Scanner;

public class Fah_Cel {
	public static void main(String[] args) {
		System.out.print("변환할 온도를 입력하시오 (섭씨는 온도 뒤에 c나C로, 화씨는 f나 F로 표시) : ");
		Scanner input = new Scanner(System.in);
		String text = input.next();
		int index = text.length();
		
		char type = text.charAt(index-1);
		
		
		int value = Integer.parseInt(text.substring(0, index-1));
		
		if(type == 'c') type = 'C';
		if(type == 'f') type = 'F';
		
		switch(type) {
		case 'C':
			double fah = (double) ((value * 1.8) + 32);
			int fah_int = (int)Math.round(fah);
			System.out.println("화씨 " + value + "도는 섭씨 "+ fah_int + "도 입니다.");
			break;
			
		case 'F':
			double cel = (double) ((value - 32) / 1.8);
			int cel_int = (int)Math.round(cel);
			System.out.println("섭씨 " + value + "도는 화씨 "+ cel_int + "도 입니다.");
			break;
			
		}
		
		//int cel = (int) ((fah - 32) / 1.8);
		//int fah = (int) (cel + 1.8 + 32);
		
	}

}
