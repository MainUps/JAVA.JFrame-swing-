package 9_AnonymousClass;

import java.util.Arrays;

public class BookSort {

	public static void main(String[] args) {
		Book[] list = new Book[4];
		list[0] = new Book("�ڹ� ���α׷���", 28000);
		list[1] = new Book("�η��� ������", 21600);
		list[2] = new Book("���� �����ΰ�", 12000);
		list[3] = new Book("��ó���� �ʴ� ��ȥ", 24000);
		
		Arrays.sort(list);
		for (Book s :list)
			s.writeInfo();
	}

}
