package bank_test;

// Import libraries for the J-Unit Testing
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bank.CheckingAccount;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: CheckingAccountTest
 * Language: Java
 * Date: 11/1/17
 * Description: This class contains J-Unit Testing for the BankAccount and CheckingAccount classes.
 */

// This a J-Unit Testing class designed to test the BankAccount and CheckingAccount classes
public class CheckingAccountTest 
{
	// Instance variables
	private CheckingAccount cAccount;															// Test object - Checking account object 
// ------------------- Set Up Method -------------------
	// Method that sets up the test (Before the test)
	@Before
	public void setUp() throws Exception 
	{
		cAccount = new CheckingAccount(11020, 1000, 50);										// Add values to the object we are testing
	}
// ------------------- End Set Up Method -------------------
	
// ------------------- Tear Down Method -------------------
	// Method that cleans up the test (Tear down the test)
	@After
	public void tearDown() throws Exception 
	{
		cAccount = null;																		// Set the object to null after tear down
	}
// ------------------- End Tear Down Method -------------------

// ------------------- Test Constructor Method -------------------
	// Method that tests the constructor for errors
	@Test
	public void testConstructor() 
	{
		assertEquals(11020, cAccount.getAccountNumber()); 										// Checks the account number to see if it's correct
		assertEquals(1000, cAccount.getBalance(), Math.pow(10, -9)); 							// Checks the balance to see if it's correct
		assertEquals(50, cAccount.getMinimumBalance(), Math.pow(10, -9)); 						// Checks the minimum balance to see if it's correct
	}
// ------------------- End Test Constructor Method -------------------
	
// ------------------- Test Withdraw Method -------------------
	// Method that tests the withdraw method
	@Test
	public void testWithdraw() 
	{
		CheckingAccount account2 = new CheckingAccount(10045, 20, 50);							// Verify the withdraw method denies withdrawing when there's not enough balance
		assertFalse(account2.withdraw(15));														// Test if the checking account can withdraw $15, will be false
		assertTrue(cAccount.withdraw(100));														// Verify the withdraw method is working properly in calculations
		assertEquals(900, cAccount.getBalance(), Math.pow(10, -9));								// After the withdraw method is used, -100 should be subtracted from the balance
	}
// ------------------- End Test Withdraw Method -------------------
	
// ------------------- Test Create Monthly Statement Method -------------------
	// Test the createMonthlyStatement method
	@Test
	public void testCreateMonthlyStatement() 
	{
		assertNotNull(cAccount.createMonthlyStatement());										// Not necessary, but checks that the method is not null - without any data
		String expected = "Account number: " + cAccount.getAccountNumber()						// Expected result 
						+ " Account balance: " + cAccount.getBalance()
						+ " Minimum balance: " + cAccount.getMinimumBalance();
		assertEquals(expected, cAccount.createMonthlyStatement());								// Compare both of the Strings to see if they're equal/accurate
	}
// ------------------- End Test Create Monthly Statement Method -------------------
} // End of class CheckingAccountTest

