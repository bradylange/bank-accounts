package bank;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: BankAccount 
 * Language: Java
 * Date: 11/1/17
 * Description: This class contains bank account attributes and algorithms to modify the attributes. 
 */

// This abstract class contains attributes related to a bank account
abstract public class BankAccount 
{
	// Instance variables
	private int accountNumber;												// Bank account's identification number
	private double balance;													// Bank account's balance in users currency 
// ------------------- Default Constructor -------------------
	// Default Constructor
	public BankAccount()
	{
		// Instantiate default properties
		accountNumber = 0;
		balance = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Account Number, Balance 
	public BankAccount(int number, double bal)
	{
		// Instantiate properties with parameter values 
		accountNumber = number;
		balance = bal;
	}
// ------------------- End Alternate Constructor -------------------
	
// Setters:
// ------------------- Set Account Number Method -------------------
	// Method that alters the bank account number 
	public void setAccountNumber(int accNum)
	{	
		accountNumber = accNum;												// Alter the bank account's number 
	}
// ------------------- End Set Account Number Method -------------------
	
// ------------------- Set Balance Method -------------------
	// Method that alters the balance of the bank account
	public void setBalance(double bal)
	{
		balance = bal;														// Alter the bank account's balance
	}
// ------------------- End Set Balance Method -------------------
	
// Getters:
// ------------------- Get Account Number Method -------------------
	// Method that returns the bank account number
	public int getAccountNumber()
	{
		return accountNumber;												// Return the bank account's number 
	}
// ------------------- End Get Account Number Method -------------------
	
// ------------------- Get Balance Method -------------------
	// Method that returns the bank accounts total balance
	public double getBalance()
	{
		return balance;														// Return the bank account's balance
	}
// ------------------- End Get Balance Method -------------------
	
// ------------------- Withdraw Method -------------------
	// Method that returns a user selected amount to withdraw from the bank account
	public boolean withdraw(double amount)
	{
		if (balance - amount < 0)											// Selected amount is more than the balance don't withdraw money
		{
			return false;													// Unsuccessfully withdrew money from the bank account 
		}
		else																// Selected amount is less than than balance withdraw money
		{	
			balance = balance - amount;										// Update bank account balance
			return true;													// Successfully withdrew money from bank account
		}
	}
// ------------------- End Withdraw Method -------------------
	
// ------------------- Deposit Method -------------------
	// Method that deposits a user selected amount into their bank account
	public void deposit(double amount)
	{
		balance = balance + amount;											// Update the bank account's balance 
	}
// ------------------- End Deposit Method -------------------
} // End of class BankAccount
