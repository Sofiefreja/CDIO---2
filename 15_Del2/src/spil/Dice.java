package spil;

import java.util.Random;

public class Dice {
	private int value;
	public int roll() {// roll the die and return the value (1-6)
		Random dice = new Random();
		int res = dice.nextInt(6)+1;
		value=res;
		return res;
	}
	public int getValue(){
		return value;
	}
}
