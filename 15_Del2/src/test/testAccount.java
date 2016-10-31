package test;
import spil.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAccount {
	
	@Test
	/*
	 * testing the method getBalance
	 */
	public void testGetBalance() {
		
		Account balance = new Account();
		
		int a = balance.getBalance();
		assertEquals(0, a);
	}
	
	@Test
	/*
	 * Testing the method deposit.
	 */
	public void testDeposit() {
		
		Account balance = new Account();
		
		balance.deposit(200);
		
		int a = balance.getBalance();
		assertEquals(200, a);
	}
	
	@Test
	/*
	 * tests the withdraw method
	 */
	public void testWithdraw() {
		
		Account balance = new Account();
		
		balance.deposit(200);
		balance.withdraw(-100);
		
		int a = balance.getBalance();
		assertEquals(100, a);
	}
}
