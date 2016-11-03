package test;

import spil.Dice;

public class preSetDice extends Dice {

	public preSetDice(int eyes) {
		super(eyes);
		eyes = 6;
	}

	public int roll() {
		int res = 4;
		value = res;
		return res;
	}

	public int getValue() {
		return value;
	}

}
