package 3_difficult_Graphics;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.name = "ȫ�浿";
		account1.deposit(200000);
		account1.writeInfo();
		
		account2.name = "Ȳ����";
		account2.deposit(1000000);
		account2.withdraw(400000);
		account2.writeInfo();
	}

}
