package spil;

import java.awt.Color;
import java.util.Random;

public class randomColorClass {

	public static Color randomColor() {

		Color theColor = null; // Initialize the Color variable

		Random dice = new Random(); // Starting a random generator to get a
									// random int between 1-13
		int number = dice.nextInt(13) + 1;

		switch (number) {   // Getting the random color.
		case 1:
			theColor = Color.black;
			break;
		case 2:
			theColor = Color.blue;
			break;
		case 3:
			theColor = Color.darkGray;
			break;
		case 4:
			theColor = Color.cyan;
			break;
		case 5:
			theColor = Color.gray;
			break;
		case 6:
			theColor = Color.green;
			break;
		case 7:
			theColor = Color.lightGray;
			break;
		case 8:
			theColor = Color.magenta;
			break;
		case 9:
			theColor = Color.orange;
			break;
		case 10:
			theColor = Color.pink;
			break;
		case 11:
			theColor = Color.red;
			break;
		case 12:
			theColor = Color.white;
			break;
		case 13:
			theColor = Color.yellow;
			break;
		}

		return theColor; // The output.
	}
}
