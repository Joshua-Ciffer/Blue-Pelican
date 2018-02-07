// Joshua Ciffer 10/29/2017 //

public class BankAccount {

	private String name ;
	private double balance ;
	
	public BankAccount() {
		this.name = "" ;
		this.balance = 0.00 ;
	}
	
	public BankAccount(String name, double balance) {
		this.name = name ;
		this.balance = balance ;
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			balance += depositAmount ;
		} else {
			System.out.println("Can't Deposit Negative Amount.") ;
		}
	}
	
	public void withdraw(double withdrawalAmount) {
		if (withdrawalAmount > 0) {
			if (this.balance >= withdrawalAmount) {
				balance -= withdrawalAmount ;
			} else {
				System.out.println("Insufficient Balance.") ;
			}
		} else {
			System.out.println("Can't Withdraw Negative Amount.") ;
		}
	}
	
	public boolean equals(Object bankAccount) {
		BankAccount comparingAccount = (BankAccount)bankAccount ;
		if (this.toString().equalsIgnoreCase(comparingAccount.toString())) {
			comparingAccount = null ;
			return true ;
		} else {
			comparingAccount = null ;
			return false ;
		}
	}
	
	public String toString() {
		return this.name + ", $" + this.balance ;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public double getBalance() {
		return this.balance ;
	}
	
}