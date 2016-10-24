package spil;

import desktop_resources.GUI;

public class Board {
	
	
	
	
	public boolean getUserInput(Player p){
		boolean roll=false;
		boolean proceed = false;
		String input;
		do {
			input = GUI.getUserButtonPressed(p.toString()+", it is your turn. Take an action:","Roll","Display balance","Display rules", "Surrender");
			if(input.equals("Roll")){
				proceed=true;
				roll=true;
			}else if(input.equals("Display balance")){
				GUI.showMessage("*Moneys*");
			}else if(input.equals("Display rules")){
				GUI.showMessage("Rules n' shit");
			}else if(input.equals("Surrender")){
				proceed=true;
			}
		}while(proceed==false);
		return roll;
	}
}

