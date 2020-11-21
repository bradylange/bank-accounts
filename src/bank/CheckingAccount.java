package bank;

/*
 * Developer: Brady Lange
 * Course: Object-Oriented Programming - CSIS 235
 * Class: CheckingAccount
 * Language: Java
 * Date: 11/1/17
 * Description: This class contains checking account attributes and algorithms to modify the attributes. 
 */

// This class contains attributes related to a checking account and is a bank account
public class CheckingAccount extends BankAccount
{
	// Instance variables
	private double minimumBalance;														// Checking account's minimal amount of money needed to continue with the account
// ------------------- Default Constructor -------------------
	// Default Constructor
	public CheckingAccount()
	{
		// Instantiate default properties 
		super();																		// Instantiate parent (BankAccount) class properties
		minimumBalance = 0;
	}
// ------------------- End Default Constructor -------------------
	
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Account Number, Balance, Minimum Balance
	public CheckingAccount(int acctNum, double balc, double minBalc)
	{
		// Instantiate properties with parameter values
		super(acctNum, balc);															// Instantiate parent (BankAccount) class properties 
		minimumBalance = minBalc;
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Withdraw Method -------------------
	// Method that withdraws money from the checking account
	public boolean withdraw(double amount)
	{
		if (getBalance() < minimumBalance || getBalance() - amount < minimumBalance)	// Balance is less than the min. balance or amount - balance is less than min. balance
		{
			return false;																// Unsuccessfully withdrew money from checking account
		}
		else																			// Selected amount meets the guidelines withdraw
		{																				// Use parent (BankAccount) class's withdraw method to withdraw money 
			return super.withdraw(amount);												// Successfully withdrew money from checking account 
		}
	}
// ------------------- End Withdraw Method -------------------
	
// Setters:
// ------------------- Set Minimum Balance Method -------------------
	// Method alters the minimum balance of the checking account required
	public void setMinimumBalance(double minBal)
	{
		minimumBalance = minBal;														// Alter the checking account's minimum balance 
	}
// ------------------- End Set Minimum Balance Method -------------------
	
// Getters: 
// ------------------- Get Minimum Balance Method -------------------
	// Method that returns the minimum balance of the checking account required
	public double getMinimumBalance()
	{
		return minimumBalance;															// Return the checking account's minimum balance 
	}	
// ------------------- End Get Minimum Balance Method -------------------
	
// ------------------- Create Monthly Statement Method -------------------
	// Method that creates the monthly statement of the checking account 
	public String createMonthlyStatement()
	{
		String statement = "Account number: " + getAccountNumber()
				+ " Account balance: " + getBalance()
				+ " Minimum balance: " + minimumBalance;
		return statement;																// Return the checking account's monthly statement
	}
// ------------------- End Create Monthly Statement Method -------------------
} // End of class CheckingAccount
