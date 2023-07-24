package 3_difficult_Graphics;

public class BankAccount {
	public String name; //예금주  (인스턴스 변수)
	public int balance = 0; // 잔액   (인스턴스 변수)
	
	public BankAccount() {
		this.name = "";
		this.balance = 0;
	}
	
	public BankAccount(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	public BankAccount(int balance) {
		this.name = "";
		this.balance = balance;
	}
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void writeInfo() {
		System.out.print("예금주 : " + name);
		System.out.println(", 잔액 : " + balance);  
	}
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}

}

/*
public class BankAccount {
	public String name; //예금주  (인스턴스 변수)
	public int balance = 0; // 잔액   (인스턴스 변수)
	
	public void writeInfo() {
		System.out.print("예금주 : " + name);
		System.out.println(", 잔액 : " + balance);  
	}
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}

}
*/