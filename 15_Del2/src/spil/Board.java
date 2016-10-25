package spil;

import java.awt.Color;

import desktop_fields.*;
import desktop_codebehind.*;
import desktop_resources.GUI;
import java.util.*;

public class Board {

	public Board() {

		makeBoard();
		Player p1 = new Player(GUI.getUserString("Player One, please enter your name:"));
		Player p2 = new Player(GUI.getUserString("Player Two, please enter your name:"));
		Dice d1 = new Dice(6);
		Dice d2 = new Dice(6);

		String cp = "p1";

		System.out.println(p1.toString());

		if (cp.equals("p1")) {
			boolean res = getUserInput(p1);

			if (res == true) {
				GUI.setDice(d1.roll(), d2.roll());
				int resroll = d1.getValue()+d2.getValue();
				GUI.removeCar(resroll, p1.toString());
				GUI.setCar(resroll, p1.toString());
				int gold = getFieldInfo(resroll);
				if (gold > 0) {
					p1.addBalance(gold);
				} else {
					p1.subBalance(gold);
				}
			} else {
				System.out.println("It doesn't work :(");
			}

		} else {
			boolean res = getUserInput(p2);

		}
	}

	public void makeBoard() {
		Field[] fields = new Field[12];
<<<<<<< HEAD
		fields[0] = new Street.Builder().setTitle("Begin").setBgColor(Color.yellow).setFgColor(Color.green).build();
		fields[1] = new Street.Builder().setTitle("Tower").setSubText("+250").setBgColor(Color.blue)
				.setFgColor(Color.red).build();
		fields[2] = new Street.Builder().setTitle("Crater").setSubText("-100").setBgColor(Color.red)
				.setFgColor(Color.blue).build();
		fields[3] = new Street.Builder().setTitle("Palace Gates").setSubText("+100").setBgColor(Color.blue)
				.setFgColor(Color.red).build();
		fields[4] = new Street.Builder().setTitle("Cold Desert").setSubText("-20").setBgColor(Color.red)
				.setFgColor(Color.blue).build();
		fields[5] = new Street.Builder().setTitle("Walled City").setSubText("+180").setBgColor(Color.blue)
				.setFgColor(Color.red).build();
		fields[6] = new Street.Builder().setTitle("Monastery").setSubText("0").setBgColor(Color.red)
				.setFgColor(Color.blue).build();
		fields[7] = new Street.Builder().setTitle("Black Cave").setSubText("-70").setBgColor(Color.blue)
				.setFgColor(Color.red).build();
		fields[8] = new Street.Builder().setTitle("Huts in the mountain").setSubText("+60").setBgColor(Color.red)
				.setFgColor(Color.blue).build();
		fields[9] = new Street.Builder().setTitle("The Werewall").setSubText("-80").setBgColor(Color.blue)
				.setFgColor(Color.red).build();
		fields[10] = new Street.Builder().setTitle("The pit").setSubText("-50").setBgColor(Color.red)
				.setFgColor(Color.blue).build();
		fields[11] = new Street.Builder().setTitle("Goldmine")
				.setDescription("You found the goldmine! You are rich!!! You gain:").setSubText("+650")
				.setBgColor(Color.blue).setFgColor(Color.red).build();
=======
		fields[0] = new Street.Builder().setTitle("Begin").setDescription("This is where the game begins.").setSubText(" ").setBgColor(Color.yellow).setFgColor(Color.green).build();
		fields[1] = new Street.Builder().setTitle("Tower").setDescription("You entered the tower. You are awarded:").setSubText("+250").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[2] = new Street.Builder().setTitle("Crater").setDescription("You fell into the crater. You lose:").setSubText("-100").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[3] = new Street.Builder().setTitle("Palace Gates").setDescription("You are standing at the palace gates. You are awarded:").setSubText("+100").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[4] = new Street.Builder().setTitle("Cold Desert").setDescription("You entered the cold desert. You lose:").setSubText("-20").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[5] = new Street.Builder().setTitle("Walled City").setDescription("You have reached Walled city! You are awarded:").setSubText("+180").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[6] = new Street.Builder().setTitle("Monastery").setDescription("You entered the Monastery. Nothing happens..").setSubText("0").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[7] = new Street.Builder().setTitle("Black Cave").setDescription("You were pushed into a black cave. You lose:").setSubText("-70").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[8] = new Street.Builder().setTitle("Huts in the mountain").setDescription("You got to the wonderful huts in the mountain. You are awarded:").setSubText("+60").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[9] = new Street.Builder().setTitle("The Werewall").setDescription("You have reached the feared Werewall. You gain another turn, however you lose:").setSubText("-80").setBgColor(Color.blue).setFgColor(Color.red).build();
		fields[10] = new Street.Builder().setTitle("The pit").setDescription("You stumbled into the pit. You lose:").setSubText("-50").setBgColor(Color.red).setFgColor(Color.blue).build();
		fields[11] = new Street.Builder().setTitle("Goldmine").setDescription("You found the goldmine! You are rich!!! You gain:").setSubText("+650").setBgColor(Color.blue).setFgColor(Color.red).build();
>>>>>>> refs/remotes/origin/master
		GUI.create(fields);
		
		GUI.showMessage("Welcome to the MoneyRace!!!");
		
	}

	public int getFieldInfo(int t) {
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

	public boolean getUserInput(Player p) {
		boolean roll = false;
		boolean proceed = false;
		String input;
		do {
			input = GUI.getUserButtonPressed(p.toString() + ", it is your turn. Take an action:", "Roll",
					"Display balance", "Display rules", "Surrender");
			if (input.equals("Roll")) {
				proceed = true;
				roll = true;
			} else if (input.equals("Display balance")) {
				GUI.showMessage("*Moneys*");
			} else if (input.equals("Display rules")) {
				GUI.showMessage("Rules n' shit");
			} else if (input.equals("Surrender")) {
				proceed = true;
			}
		} while (proceed == false);
		return roll;
	}
}
