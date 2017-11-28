// Joshua Ciffer 10/29/2017 //


import java.util.Scanner ;
import bank.BankAccount ;
import java.util.InputMismatchException ;

public class Bank {

	private static Scanner userInput = new Scanner(System.in) ;
	private static BankAccount[] customers = new BankAccount[5] ;
	private static String accountName ;
	private static short menuOption, numBankAccounts = 0, currentAccount ;
	private static double accountBalance, depositAmount, withdrawalAmount ;
	private static boolean accountFound ;
	
	private static void MENU() {
		do {
			System.out.println("--------Bank Main Menu---------") ;
			System.out.println("(1) Login") ;
			System.out.println("(2) Open Account") ;
			System.out.println("(3) List Accounts") ;
			System.out.println("(4) Exit") ;
			System.out.print("Enter An Option: ") ;
			try {
				menuOption = userInput.nextShort() ;
			} catch (InputMismatchException e) {
				System.out.println("Enter One Of The Given Options.") ;
				userInput.next() ;
				continue ;
			}
			switch (menuOption) {
				case 1: {
					LOGIN() ;
					continue ;
				}
				case 2: {
					OPEN_ACCOUNT() ;
					continue ;
				}
				case 3: {
					LIST_ACCOUNTS() ;
					continue ;
				}
				case 4: {
					EXIT() ;
					continue ;
				}
				default: {
					System.out.println("Enter One Of The Given Options.") ;
					continue ;
				}
			}
		} while (true) ;
	}
	
	private static void OPEN_ACCOUNT() {
		userInput.nextLine() ;
		do {	// Begin Account Name Loop
			System.out.print("Enter The Account Name: ") ;
			try {
				accountName = userInput.nextLine() ;
				break ;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter The Account Name.") ;
				userInput.next() ;
				continue ;
			}
		} while (true) ;	// End Account Name Loop
		do {	// Begin Account Balance Loop
			System.out.print("Enter The Starting Balance: $") ;
			try {
				accountBalance = userInput.nextDouble() ;
				if (accountBalance < 0) {
					System.out.println("Enter A Positive Amount.") ;
					continue ;
				}
				break ;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter A Dollar Amount.") ;
				userInput.next() ;
				continue ;
			}
		} while (true) ;	// End Account Balance Loop
		try {
			customers[numBankAccounts] = new BankAccount(accountName, accountBalance) ;
			numBankAccounts++ ;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot Create Account, There Are No Open Spaces.") ;
		}
	}
	
	private static void CLOSE_ACCOUNT() {
		customers[currentAccount] = null ;
		LOGOUT() ;
	}
	
	private static void LOGIN() {
		userInput.nextLine() ;
		do {	// Begin Account Name Loop
			System.out.print("Enter Your Account Name: ") ; 
			try {
				accountName = userInput.nextLine() ;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter Your Account Name.") ;
				userInput.next() ;
				continue ;
			}
			for (int i = 0 ; i < customers.length ; i++) {
				if (accountName.equalsIgnoreCase(customers[i].getName())) {
					currentAccount = (short)i ;
					accountFound = true ;
					break ;
				} else {
					accountFound = false ;
				}
			}
			if (accountFound) {
				do {
					System.out.println("--------Account Menu--------") ;
					System.out.println("(1) Deposit") ;
					System.out.println("(2) Withdraw") ;
					System.out.println("(3) Close Account") ;
					System.out.println("(4) Logout") ;
					System.out.print("Enter An Option: ") ;
					try {
						menuOption = userInput.nextShort() ;
					} catch (InputMismatchException e) {
						System.out.println("Please Enter An Option.") ; 
						userInput.next() ;
						continue ;
					}
					switch (menuOption) {
						case 1: {
							DEPOSIT() ;
							continue ;
						}
						case 2: {
							WITHDRAW() ;
							continue ;
						}
						case 3: {
							CLOSE_ACCOUNT() ;
							continue ;
						}
						case 4: {
							LOGOUT() ;
						}
						default: {
							System.out.println("Enter One Of The Given Options.") ;
							continue ;
						}
					}
				} while (true) ;
			} else {
				System.out.println("Your Account Was Not Found.") ;
				break ;
			}
		} while (true) ;	// End Account Name Loop
	}
	
	private static void LOGOUT() {
		MENU() ;
	}
	
	private static void DEPOSIT() {
		do {
			System.out.print("Enter The Amount You Want To Deposit: $") ; 
			try {
				depositAmount = userInput.nextDouble() ;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter A Dollar Amount.") ;
				userInput.next() ;
				continue ;
			}
			customers[currentAccount].deposit(depositAmount) ;
			break ;
		} while (true) ;
	}
	
	private static void WITHDRAW() {
		do {
			System.out.print("Enter The Amount You Want To Withdraw: $") ; 
			try {
				withdrawalAmount = userInput.nextDouble() ;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter A Dollar Amount.") ;
				userInput.next() ;
				continue ;
			}
			customers[currentAccount].withdraw(withdrawalAmount) ;
			break ;
		} while (true) ;
	}
	
	private static void LIST_ACCOUNTS() {
		int i = 1 ;
		for (BankAccount ba : customers) {
			System.out.println("#" + i + ": " + ba.toString()) ;
			i++ ;
		}
	}
	
	private static void EXIT() {
		userInput.close() ;
		userInput = null ;
		System.exit(0) ;
	}
	
	public static void main(String[] args) {
		for (int i = 0 ; i < customers.length ; i++) {
			customers[i] = new BankAccount() ;
		}
		MENU() ;
	}

}
