package 3_difficult_Graphics;

public class BankAccount {
	public String name; //������  (�ν��Ͻ� ����)
	public int balance = 0; // �ܾ�   (�ν��Ͻ� ����)
	
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
		System.out.print("������ : " + name);
		System.out.println(", �ܾ� : " + balance);  
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
	public String name; //������  (�ν��Ͻ� ����)
	public int balance = 0; // �ܾ�   (�ν��Ͻ� ����)
	
	public void writeInfo() {
		System.out.print("������ : " + name);
		System.out.println(", �ܾ� : " + balance);  
	}
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}

}
*/