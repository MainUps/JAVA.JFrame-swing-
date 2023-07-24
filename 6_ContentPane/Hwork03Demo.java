package 6_ContentPane;

public class Hwork03Demo {

	public static void main(String[] args) {
		Book b1 = new Book("자바프로그래밍", "양재형", 35000);
		Book b2 = new Book();
		b2.setValue("왕이 된 남자", "김선덕", 25000);
		b1.disconutBy(15);
		System.out.println("책의 수=" + Book.getBookCount());
		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
	}
}
//202184052 정인철
