package 9_AnonymousClass;

import java.util.Arrays;

public class BookSort {

	public static void main(String[] args) {
		Book[] list = new Book[4];
		list[0] = new Book("자바 프로그래밍", 28000);
		list[1] = new Book("인류의 대항해", 21600);
		list[2] = new Book("장사란 무엇인가", 12000);
		list[3] = new Book("상처받지 않는 영혼", 24000);
		
		Arrays.sort(list);
		for (Book s :list)
			s.writeInfo();
	}

}
