package 6_ContentPane;
import java.util.Scanner;
public class IntArrAvg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int count = in.nextInt();
		int[] score = new int[count];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println(count + "���� ���� ������ �Է��Ͻÿ�: ");
		for(int i : score) {
			score[i] = in.nextInt();
			sum += score[i];
			if(max < score[i])	max = score[i];
			if(min > score[i])	min = score[i];
		}
		double avg = (double)sum / count;
		System.out.printf("��հ�=%.2f\n", avg);
		System.out.println("�ִ밪=" + max);
		System.out.println("�ּҰ�=" + min);
	}
}




