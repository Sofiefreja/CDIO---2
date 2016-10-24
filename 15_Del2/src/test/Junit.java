package test;
import spil.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Junit {

	@Test
	public void test() {
		//Test name function
		Player p = new Player("Børge");
		assertEquals("Børge",p.toString());
		//Test position function & setPosition
		assertEquals(0, p.getPosition());
		p.setPosition(5);
		assertEquals(5,p.getPosition());
		//Test getBalance function
		assertEquals(1000, p.getBalance());
		//Test withdraw and deposit function
		p.subBalance(200);
		assertEquals(800,p.getBalance());
		p.addBalance(650);
		assertEquals(1450,p.getBalance());
	}

}
