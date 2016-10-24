package test;
import spil.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Junit {

	@Test
	public void test() {
		Player p = new Player("Børge");
		System.out.println(p.getBalance());
		
	}

}
