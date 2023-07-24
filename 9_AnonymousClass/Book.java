package 9_AnonymousClass;

public class Book implements Comparable{
	private String name;
	private int price;
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void writeInfo() {
		System.out.println("제목=" + name + ", 가격=" + price + "원");
	}
	
	@Override
	public int compareTo(Object o) {
		if (o != null && o instanceof Book) {
			Book s = (Book)o;
			if (price > s.price)
				return 1;
			else if (price < s.price)
				return -1;
			else
				return 0;
		}
		else
			return -1;
	}
}
