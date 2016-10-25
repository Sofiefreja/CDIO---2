package spil;

public class Player {
	private String name;
	private Account balance = new Account();
	private int position; // This line is useful for further development.
	public Player (String name){
		this.name=name;
		balance.deposit(1000);
		position=0;
	}
	public String toString(){
		return name;
	}
	public void addBalance(int amount){
		balance.deposit(amount);
	}
	public void subBalance(int amount){
		balance.withdraw(amount);
	}
	public int getBalance(){
		return balance.getBalance();
	}
	public void setPosition(int position){
		this.position=position;
	}
	public int getPosition(){
		return position;
	}
}
