package 3_difficult_Graphics;

import java.util.Scanner;

public class PatientDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = input.nextLine().trim();

		System.out.print("Ű�� �Է��Ͻÿ�(cm) : ");
		int height = input.nextInt();
		
		System.out.print("ü���� �Է��Ͻÿ�(kg) : ");
		int weight = input.nextInt();
		
		Patient p = new Patient(name, height, weight);
		
		System.out.println(p.getName() + "�� BMI = " + p.getBMI());
		
	}
}
