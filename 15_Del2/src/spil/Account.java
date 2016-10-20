package spil;

public class Account {

	private int balance;

	public Account() {
		this.balance = 0;
	}

	public void deposit(int value) {
		this.balance = value;
	}

	public void withdraw(int value) {
		this.balance -= value;

	}
	public int getBalance() {

		return balance;
	}
}
