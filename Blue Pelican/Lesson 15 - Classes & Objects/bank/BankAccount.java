// Joshua Ciffer 7/4/2017 //

package bank ;

public class BankAccount {

	public String name ;
	public double balance ;
	
	public BankAccount() {
		name = " " ;
		balance = 0 ;
	}
	
	public BankAccount(double accountBalance, String accountName) {
		name = accountName ;
		balance = accountBalance ;
	}
	
	public void deposit(double amount) {
		balance += amount ;
	}
	
	public void withdraw(double amount) {
		balance -= amount ;
	}
	
}