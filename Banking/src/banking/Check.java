package banking;

import java.util.Date;

public class Check {

	private int nbr;
	private Date date;
	private double amount;
	private int acctID;
	private String payee;
	
	
	public int getNbr() {
		return nbr;
	}
	public Date getDate() {
		return date;
	}
	public double getAmount() {
		return amount;
	}
	public int getAcctID() {
		return acctID;
	}
	public String getPayee() {
		return payee;
	}
	private void setNbr(int nbr) {
		this.nbr = nbr;
	}
	private void setDate(Date date) {
		this.date = date;
	}
	private void setAmount(double amount) {
		this.amount = amount;
	}
	private void setAcctID(int acctID) {
		this.acctID = acctID;
	}
	private void setPayee(String payee) {
		this.payee = payee;
	}
	public Check(int nbr, Date date, double amount, int acctID, String payee) {
		this.nbr = nbr;
		this.date = date;
		this.amount = amount;
		this.acctID = acctID;
		this.payee = payee;
	}
	
	
	
	
}
