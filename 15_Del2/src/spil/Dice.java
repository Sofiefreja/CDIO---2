package spil;

import java.util.Random;

public class Dice {
	private int value;
	private int eyes;

	public Dice(int eyes) {
		if (eyes > 0) {
			this.eyes = eyes;
		}
		else{
			this.eyes=6;
		}
	}

	public int roll() {// roll the die and return the value (1-6)
		Random dice = new Random();
		int res = dice.nextInt(eyes) + 1;
		value = res;
		return res;
	}

	public int getValue() {
		return value;
	}
}
