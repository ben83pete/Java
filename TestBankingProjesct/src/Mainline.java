import banking.*;

public class Mainline {

	public static void main(String[] args) {
		
		Savings sav = new Savings();
		Checking chk = new Checking();
		
		try {
			sav.deposit(1000);
			sav.withdraw(200);
			System.out.println("Savings balance is " + sav.getBalance());
			chk.deposit(5000);
			chk.withdraw(2000);
			System.out.println("Checking balance is " + chk.getBalance());
			chk.transferTo(sav, 500);
			System.out.println("Savings balance is " + sav.getBalance());
			System.out.println("Checking balance is " + chk.getBalance());
		} catch (Exception ex) {
			System.out.println("An Exception occured");
		}			
		
		
	}	
}
