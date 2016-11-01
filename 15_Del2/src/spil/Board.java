package spil;
import java.awt.Color;

import desktop_fields.*;
import desktop_codebehind.*;
import desktop_resources.GUI;
import java.util.*;

public class Board {

	public static String extra; // String to determine when a user gets an extra turn
	public static int pos;

	public Board() {

		makeBoard(); // Initiates the makeBoard method, which initializes the GUI for the board, with squares
		GUI.showMessage("Welcome to the MoneyRace!!!");
		Player p1 = new Player(GUI.getUserString("Player One, please enter your name:")); // Asks the user for a input and then initiates the player class, taking a string (name) as the input, which will be called several times during the code
		Player p2 = new Player(GUI.getUserString("Player Two, please enter your name:")); // Another initiation of the player class, this time for player two
		Dice d1 = new Dice(6); Dice d2 = new Dice(6); // Initiates two die with six eyes.

		String cp = "p1";
		extra = "No";
		p1.setPosition(1); p2.setPosition(1); // Sets the starting position for both players

			do { // Initiates a do-while loop, that runs the game until the win conditions are met
				if (cp.equals("p1")) { // If-else statement that check for which player has a turn
					boolean res = getUserInput(p1); // Calls the getUserInput method, which requires the user to press one of three buttons to proceed

					if (res == true) { // If the player chose to roll, the turn proceeds
						GUI.setDice(d1.roll(), d2.roll()); // Both die classes are called to roll, which returns the result of the roll to the GUI
						GUI.removeCar(p1.getPosition(), p1.toString()); // Removes the player piece from the current position on the board
						p1.setPosition(d1.getValue() + d2.getValue()); // Saves the result of both rolls within the player class
						GUI.setCar(p1.getPosition(), p1.toString()); // Replaces the player piece on the new position on the board
						int gold = getFieldInfo(p1.getPosition()); // Calls the getFieldInfo method, which returns a value and displays a message to the GUI about which square the player landed on
						if (gold > 0) { // If-else statement that calls a method from the player class, to either add or subtract points to the player account, depending on the value on the square
							p1.addBalance(gold);
						} else {
							p1.subBalance(gold);
						}
						GUI.setBalance(p1.toString(), p1.getBalance()); // Sets the new balance to the player car on the GUI
						if (extra.equals("Yes")) { // If-else statement that checks whether or not the player landed on the extra turn square
							cp = "p1";
							extra = "No"; // If the player recieved an extra turn, resets the string to remove the extra turn label, so that only one extra turn is granted
						} else {
							cp = "p2"; // Sets the current player to the next player if no extra turn was recieved
						}
						GUI.removeCar(p1.getPosition(), p1.toString()); // Removes the player piece from the new square
						p1.setPosition(1);
						GUI.setCar(p1.getPosition(), p1.toString()); // Sets the player piece to the starting square
					} else {
						GUI.showMessage("You have surrendered! " + p2 + " is the winner!"); // If the player chose not to roll, ends the game and pushes a message to the GUI announcing the winner
						getEndGameInput(p1);
						break;
					}
				} else { // The following code does the same as for player one
					boolean res = getUserInput(p2);
					if (res == true) {
						GUI.setDice(d1.roll(), d2.roll());
						GUI.removeCar(p2.getPosition(), p2.toString());
						p2.setPosition(d1.getValue() + d2.getValue());
						GUI.setCar(p2.getPosition(), p2.toString());
						int gold = getFieldInfo(p2.getPosition());
						if (gold > 0) {
							p2.addBalance(gold);
						} else {
							p2.subBalance(gold);
						}
						GUI.setBalance(p2.toString(), p2.getBalance());
						if (extra.equals("Yes")) {
							cp = "p2";
							extra = "No";
						} else {
							cp = "p1";
						}
						GUI.removeCar(p2.getPosition(), p2.toString());
						p2.setPosition(1);
						GUI.setCar(p2.getPosition(), p2.toString());
					} else {
						GUI.showMessage("You have surrendered! " + p1 + " is the winner!");
						getEndGameInput(p1);
						break;

					}
				}
			}

			while (p1.getBalance() < 3000 && p2.getBalance() < 3000 && p1.getBalance() > 0 && p2.getBalance() > 0); { // Win condition that breaks the loop and ends the game if either player gets below 0 or above 3000 points
				if (cp.equals("p1") && p2.getBalance() > 2999 || cp.equals("p2") && p1.getBalance() <= 0) { // If-else statement checking for which player achieved the win condition
					GUI.showMessage("Congratulations " + p2 + "!" + " You are the winner!"); // Announces the winner to the GUI
					getEndGameInput(p1);
				} else {
					GUI.showMessage("Congratulations " + p1 + "!" + " You are the winner!");
					getEndGameInput(p1);
	
				}
			}
			
		}
		
	
	

	public void makeBoard() { // Method that creates the board for the GUI and sets the squares with their descriptions, colouring and number
		Field[] fields = new Field[12];
		fields[0] = new Street.Builder().setTitle("Begin").setDescription("This is where the game begins.")
				.setSubText(" ").setBgColor(Color.yellow).setFgColor(Color.green).build();
		fields[1] = new Street.Builder().setTitle("Tower").setDescription("You entered the tower. You are awarded:")
				.setSubText("+250").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[2] = new Street.Builder().setTitle("Crater").setDescription("You fell into the crater. You lose:")
				.setSubText("-100").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[3] = new Street.Builder().setTitle("Palace Gates").setDescription("You are standing at the palace gates. You are awarded:")
				.setSubText("+100").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[4] = new Street.Builder().setTitle("Cold Desert").setDescription("You entered the cold desert. You lose:")
				.setSubText("-20").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[5] = new Street.Builder().setTitle("Walled City").setDescription("You have reached Walled city! You are awarded:")
				.setSubText("+180").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[6] = new Street.Builder().setTitle("Monastery").setDescription("You entered the Monastery. Nothing happens..")
				.setSubText("0").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[7] = new Street.Builder().setTitle("Black Cave").setDescription("You were pushed into a black cave. You lose:")
				.setSubText("-70").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[8] = new Street.Builder().setTitle("Huts in the mountain").setDescription("You got to the wonderful huts in the mountain. You are awarded:")
				.setSubText("+60").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[9] = new Street.Builder().setTitle("The Werewall").setDescription("You have reached the feared Werewall. You gain another turn, however you lose:")
				.setSubText("-80").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[10] = new Street.Builder().setTitle("The pit").setDescription("You stumbled into the pit. You lose:")
				.setSubText("-50").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[11] = new Street.Builder().setTitle("Goldmine").setDescription("You found the goldmine! You are rich!!! You gain:")
				.setSubText("+650").setBgColor(Color.blue).setFgColor(Color.red).build();
		GUI.create(fields);

		

	}

	public int getFieldInfo(int t) { // Method that pushes a message to the GUI telling the player what happens on the square they landed on, while returning the square's value
		int res = 0;
		switch (t) {
		case 2:
			GUI.showMessage("You entered the tower. You are awarded 250 points!");
			res = 250;
			break;
		case 3:
			GUI.showMessage("You fell into the crater. You lose 100 points..");
			res = -100;
			break;
		case 4:
			GUI.showMessage("You are standing at the palace gates. You are awarded 100 points!");
			res = 100;
			break;
		case 5:
			GUI.showMessage("You entered the cold desert. You lose 20 points.");
			res = -20;
			break;
		case 6:
			GUI.showMessage("You have reached Walled city! You are awarded 180 points!");
			res = 180;
			break;
		case 7:
			GUI.showMessage("You entered the Monastery. Nothing happens..");
			res = 0;
			break;
		case 8:
			GUI.showMessage("You were pushed into a black cave. You lose 70 points.");
			res = -70;
			break;
		case 9:
			GUI.showMessage("You got to the wonderful huts in the mountain. You are awarded 60 points.");
			res = 60;
			break;
		case 10:
			GUI.showMessage("You have reached the feared Werewall. You lose 80 points, but you get another turn.");
			res = -80;
			extra = "Yes";
			break;
		case 11:
			GUI.showMessage("You stumbled into the pit. You lose 50 points.");
			res = -50;
			break;
		case 12:
			GUI.showMessage("You found the goldmine! You are rich!!! You gain 650 points.");
			res = 650;
			break;
		}
		return res;
	}

	public boolean getUserInput(Player p) { // Method that pushes a menu to the GUI, expecting an input from the player to either roll the die, read the rules or surrender the game
		boolean roll = false;
		boolean proceed = false;
		String input;
		do {
			input = GUI.getUserButtonPressed(p.toString() + ", it is your turn. Take an action:", "Roll", "Display rules", "Surrender");
			if (input.equals("Roll")) {
				proceed = true;
				roll = true;
			} else if (input.equals("Display rules")) {
				GUI.showMessage("The game is turnbased. Each turn a player rolls the die and lands on a square. \n"
						+ "There are 11 squares, each with a different effect on your score.\n"
						+ "Each player starts with 1000 points. The game is won when a player reaches 3000 points.\n"
						+ "If a players score gets under 0, that player loses.\n"
						+ "Have fun!");
			} else if (input.equals("Surrender")) {
				proceed = true;
			}
		} while (proceed == false);
		return roll; // Returns roll = true if the player rolled the die, false if the player surrenders
	}

	public boolean getEndGameInput(Player p) { // Method that ends the game, telling the player to relaunch if they wish to play again
		String input;

			GUI.showMessage("The game has ended. To play again, relaunch the game.");
			GUI.close();
			
			return true;

	}
}