package 6_ContentPane;
public class Book {
	private String name;
	private String author;
	private int price;
	static int count = 0;
	public Book() {
		this.name = "";
		this.author = "";
		this.price = 0;
		count++;			}
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
		count++;}	
	
	public void setValue(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;}
	
	public void disconutBy(int discount) {
		this.price *= (100-discount)*0.01;	}	
	
	static public int getBookCount() {
		return count;	}
	
	public String toString() {
		return "제목="+this.name+", 저자="+this.author+", 가격="+this.price;
	}
}