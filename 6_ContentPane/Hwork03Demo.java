package 6_ContentPane;

public class Hwork03Demo {

	public static void main(String[] args) {
		Book b1 = new Book("�ڹ����α׷���", "������", 35000);
		Book b2 = new Book();
		b2.setValue("���� �� ����", "�輱��", 25000);
		b1.disconutBy(15);
		System.out.println("å�� ��=" + Book.getBookCount());
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
	}
}
//202184052 ����ö
