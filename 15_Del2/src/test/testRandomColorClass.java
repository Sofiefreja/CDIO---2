package test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.util.Random;

import org.junit.Test;

public class testRandomColorClass {

	@Test
	public void testRandomGenerator() {
		/*
		 * Testing if it has a uniform distribution.
		 */
		int black=0,blue=0,darkGrey=0,cyan=0,gray=0,green=0,lightGray=0,magenta=0,orange=0,pink=0,red=0,white=0,yellow=0;
		
		int number;
		for(int i=1; i<=100000;i++){
		Random unicorn = new Random();
		number = unicorn.nextInt(13)+1;
		switch (number) {   // Choosing the color for the random number.
		case 1:
			black+=1;
			break;
		case 2:
			blue+=1;
			break;
		case 3:
			darkGrey+=1;
			break;
		case 4:
			
			cyan+=1;
			break;
		case 5:
	
			gray+=1;
			break;
		case 6:
	
			green+=1;
			break;
		case 7:
		
			lightGray+=1;
			break;
		case 8:

			magenta+=1;
			break;
		case 9:
	
			orange+=1;
			break;
		case 10:
		
			pink+=1;
			break;
		case 11:
		
			red+=1;
			break;
		case 12:
	
			white+=1;
			break;
		case 13:
		
			yellow+=1;
			break;
		}
		}
		System.out.println(black+"\n"+blue+"\n"+darkGrey+"\n"+cyan+"\n"+gray+"\n"+green+"\n"+lightGray+"\n"+magenta+"\n"+orange+"\n"+pink+"\n"+red+"\n"+white+"\n"+yellow);
	}

}
