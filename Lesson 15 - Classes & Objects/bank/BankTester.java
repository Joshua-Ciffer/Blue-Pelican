// Joshua Ciffer 7/4/2017 //

package bank ;
import java.util.Scanner ;

public class BankTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		String name ;
		double balance ;
		System.out.print("Enter your name: ") ;
		name = input.nextLine() ;
		System.out.print("Enter the account balance: ") ;
		balance = input.nextDouble() ;
		BankAccount myAccount = new BankAccount(balance, name) ;
		myAccount.deposit(505.22) ;
		System.out.println("Balance: " + myAccount.balance) ;
		myAccount.withdraw(100) ;
		System.out.println("The " + name + " account balance is, $" + myAccount.balance) ;
		input.close() ;

	}

}