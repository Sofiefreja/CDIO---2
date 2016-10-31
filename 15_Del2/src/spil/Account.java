package spil;

public class Account {

	private int balance; //initialize an amount "balance"

	public Account() {//constructor
		balance = 0;
	}
	
	
	/*
	 * Deposit an amount.
	 */
	public void deposit(int value) {
		balance += value;
	}

	/*
	 * Withdraw an amount.
	 * OBS. amount has to have a '-' in front of it.
	 */
	public void withdraw(int value) {
		balance += value;

	}
	
	/*
	 * Returns the balance of your account.
	 */
	public int getBalance() {

		return balance;
	}
}
