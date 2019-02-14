package banking;

import banking.exceptions.DepositWithdrawTransferException;
import banking.exceptions.InsuffcientFundsException;

public class Account  {

	private double balance;
	private int id;
	private static int nextId = 1;
	private String description;	
	
	public int getId() {return id;}	
	public double getBalance() {return balance;}
	private void setBalance(double newBalance) {balance = newBalance;}
	public String getDescription() {return description;}
	public void setDescription(String newDescription) {description = newDescription;}
	
	
	public boolean transferTo(Account account, double amount) throws DepositWithdrawTransferException {
		try{
			withdraw(amount);
		}	
		catch (InsuffcientFundsException | DepositWithdrawTransferException ex) {
			return false;
		}
		account.deposit(amount);
		return true;
	}
	
	private void checkAmountGtZero(double amount)throws DepositWithdrawTransferException{
		if(amount <= 0) {
			throw new DepositWithdrawTransferException("Amount must be positive.");
			}		
	}
	
	public void deposit(double amount)throws DepositWithdrawTransferException {
		checkAmountGtZero(amount);
				setBalance(getBalance()+ amount);
	}
	
	public void withdraw(double amount)
			throws DepositWithdrawTransferException, InsuffcientFundsException {
		checkAmountGtZero(amount);
		if(getBalance() < amount) {
			throw new InsuffcientFundsException("Insufficent Funds.");
		}
		setBalance(getBalance()- amount);
	}
	
	public Account(String newDescription) {
		this();
		description = newDescription; 
	}
	
	public Account() {
		
		id = nextId++;
		balance = 0;
		description = "*New Account*";			
	}
	

}
