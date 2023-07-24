package 9_AnonymousClass;

public class Book implements Comparable{
	private String name;
	private int price;
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void writeInfo() {
		System.out.println("����=" + name + ", ����=" + price + "��");
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
