package 2_NestedFor;

import java.util.Scanner;

public class Fah_Cel {
	public static void main(String[] args) {
		System.out.print("��ȯ�� �µ��� �Է��Ͻÿ� (������ �µ� �ڿ� c��C��, ȭ���� f�� F�� ǥ��) : ");
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
			System.out.println("ȭ�� " + value + "���� ���� "+ fah_int + "�� �Դϴ�.");
			break;
			
		case 'F':
			double cel = (double) ((value - 32) / 1.8);
			int cel_int = (int)Math.round(cel);
			System.out.println("���� " + value + "���� ȭ�� "+ cel_int + "�� �Դϴ�.");
			break;
			
		}
		
		//int cel = (int) ((fah - 32) / 1.8);
		//int fah = (int) (cel + 1.8 + 32);
		
	}

}
