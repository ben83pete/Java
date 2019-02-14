package banking;

import java.util.ArrayList;
import java.util.Date;

import banking.exceptions.*;

// constructed using composition
public class Checking {

	private Account account;
	private static int nextCheckNbr = 100;	
	private static ArrayList<Check> checks = new ArrayList<Check>();
	
	public void writeCheck(String payee, double amount)throws DepositWithdrawTransferException, InsuffcientFundsException {
		Check check = new Check(nextCheckNbr++, new Date(), amount, this.getID(), payee);
		checks.add(check);
		this.withdraw(amount);
	}
		
	public int getID() {
		return account.getId();
	}
	public double getBalance() {
		return account.getBalance();
	}
	public String getDescription() {
		return account.getDescription();				
	}
	public void setDescription(String newDescription) {
		account.setDescription(newDescription);
	}
	public void deposit(double amount) throws DepositWithdrawTransferException {
		account.deposit(amount);
	}
	public void withdraw(double amount) 
			throws DepositWithdrawTransferException, InsuffcientFundsException {
		account.withdraw(amount);
	}
	public boolean transferTo(Account toAccount, double amount)
			throws DepositWithdrawTransferException {
		return account.transferTo(toAccount, amount);		
	}
		
	public Checking() {
		account = new Account();
	}		
	public Checking(String newDescription) {
		account = new Account(newDescription);
	}
	
	
}
