// Joshua Ciffer 4/3/2017

import java.util.Scanner ;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Num_Input = new Scanner(System.in) ;
		Scanner String_Input = new Scanner(System.in) ;
		System.out.println("What state do you live in?") ;
		String State = String_Input.nextLine() ;
		System.out.println("What is the price?") ;
		double Price = Num_Input.nextDouble() ;
		double Tax = 0 ;
		if ((State.equalsIgnoreCase("Texas")) || (State.equalsIgnoreCase("Tx")))
			{
				Tax = Price * .08 ;
			}
		double Total = Price + Tax ;
		System.out.println("Total is: $" + Total) ;
		
		Num_Input.close() ;
		String_Input.close() ;
		
	}

}
