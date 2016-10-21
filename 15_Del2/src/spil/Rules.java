package spil;
import desktop_resources.GUI;
public class Rules {
	
	public int getFieldInfo(int t){
	int res = 0;
	switch(t){
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
}
