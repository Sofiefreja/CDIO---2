package test;
import spil.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAccount {
	
	@Test
	public void testgetBalance() {
		
		Account balance = new Account();
		
		int a = balance.getBalance();
		assertEquals(0, a);
	}
	
	@Test
	public void testDeposit() {
		
		Account balance = new Account();
		
		balance.deposit(200);
		
		int a = balance.getBalance();
		assertEquals(200, a);
	}
	
	@Test
	public void testWithdraw() {
		
		Account balance = new Account();
		
		balance.deposit(200);
		balance.withdraw(-100);
		
		int a = balance.getBalance();
		assertEquals(100, a);
	}
}
