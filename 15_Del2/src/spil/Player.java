package spil;

public class Player {
	private String name;
	private Account balance;
	private int position;
	public Player (String name){
		this.name=name;
		this.balance.deposit(1000);
		this.position=0;
	}
	public String toString(){
		return name+" has "+getBalance()+" DKK.";
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
