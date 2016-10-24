package test;
import spil.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Junit {

	@Test
	public void test() {
		//Test name function
		Player p = new Player("Børge");
		System.out.println(p.getBalance());
		assertEquals("Børge",p.toString());
		//Test getBalance function
		
		//Test position function
		//Test withdraw function
		//Test Deposit funciton
	}

}
