package spil;

import java.awt.Color;
import java.util.Random;

public class randomColorClass {

	public static Color randomColor() { 

		Color theColor = null; // Initialize the Color variable

		
		Random dice = new Random(); // Starting the Random method
		int number = dice.nextInt(13) + 1; // Generating a number from 1 to 13.

		
		switch (number) {   // Choosing the color for the random number.
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

		return theColor; // Returns the random Color.
	}
}
