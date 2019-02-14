package test;

import banking.Savings;
import banking.exceptions.DepositWithdrawTransferException;
import banking.exceptions.InsuffcientFundsException;

public class Mainline {	

	public static void main(String[] args) {
		
		Savings acct = new Savings("My 1st savings Account");
		Savings sav = new Savings ("My Other Account");
		try {
			acct.deposit(1000);
			acct.withdraw(200);
			acct.payInt();
			System.out.println("Balance is " + acct.getBalance());
			acct.deposit(100);
			acct.transferTo(sav, 500);
			System.out.println("Balance in acct is " + acct.getBalance());
			System.out.println("Balance in sav is " + sav.getBalance());
		}catch(InsuffcientFundsException ex) {
			
			
		}catch (DepositWithdrawTransferException ex) {
			
		}
		catch (Exception e) {			
			e.printStackTrace();
		}
		System.out.println("Balance is " + acct.getBalance());
				
	}

	
}
