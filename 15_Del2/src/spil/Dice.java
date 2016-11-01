package spil;

import java.util.Random;

public class Dice {
	private int value;
	private int eyes;
	
	/*
	 * Constructor with a defualt of 6 sides.
	 */
	public Dice(){
		this.eyes=6;
	}
	
	/*
	 * A constructor which makes a dice with n sides.
	 */
	public Dice(int eyes) {
		if (eyes > 0) {
			this.eyes = eyes;
		}
		else{
			this.eyes=6;
		}
	}

	public int roll() {// roll the die and return the value (From 1 to eyes.)
		Random dice = new Random();
		int res = dice.nextInt(eyes) + 1;
		value = res;
		return res;
	}

	public int getValue() {//return the current value of the dice.
		return value;
	}
}
