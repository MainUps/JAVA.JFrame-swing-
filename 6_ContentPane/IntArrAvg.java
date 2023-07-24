package 6_ContentPane;
import java.util.Scanner;
public class IntArrAvg {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		int count = in.nextInt();
		int[] score = new int[count];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.println(count + "개의 양의 정수를 입력하시오: ");
		for(int i : score) {
			score[i] = in.nextInt();
			sum += score[i];
			if(max < score[i])	max = score[i];
			if(min > score[i])	min = score[i];
		}
		double avg = (double)sum / count;
		System.out.printf("평균값=%.2f\n", avg);
		System.out.println("최대값=" + max);
		System.out.println("최소값=" + min);
	}
}




