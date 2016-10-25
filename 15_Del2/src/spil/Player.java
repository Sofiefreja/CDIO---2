package spil;

import java.awt.Color;

import desktop_codebehind.*;
import desktop_resources.GUI;


public class Player {
	private String name;
	private Account balance = new Account();
	private int position; // This line is useful for further development.
	private Color theColor = randomColorClass.randomColor();
	
	public Player (String name){
		this.name=name;
		Car car = new Car.Builder().typeTractor().secondaryColor(theColor).build();
		GUI.addPlayer(this.name, 1000, car);
		GUI.setCar(1, this.name);
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
	public Color getColor(){
		return theColor;
	}
}
