package spil;

import java.awt.Color; // For the Class "Color".

import desktop_codebehind.*; // For the Class "Car"

import desktop_resources.GUI; // For the GUI


public class Player {
	private String name;
	private Account balance = new Account();
	private int position; // This line is useful for further development.
	
	
	private Color theColor = randomColorClass.randomColor(); // Creating a random color.
	
	public Player (String name){ // constructor
		this.name=name;
		balance.deposit(1000);
		Car car = new Car.Builder().typeTractor().secondaryColor(theColor).build();
		GUI.addPlayer(this.name, getBalance(), car);
		GUI.setCar(1, this.name);
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
	public Color getColor(){ // Showing the color of the player.
		return theColor;
	}
}
