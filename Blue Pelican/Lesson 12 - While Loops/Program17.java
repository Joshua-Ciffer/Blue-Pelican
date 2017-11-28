// Joshua Ciffer 6/7/2017

import java.util.Scanner ;

public class Program17 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double num = 2 ;
		numInput = new Scanner(System.in) ;
		while ((num % 2) == 0) {
			System.out.print("Enter a number: ") ;
			num = numInput.nextDouble() ;
			if ((num % 2) == 0) {
				System.out.println("The number you entered is even") ; 
			} else {
				System.out.println("The number you entered is not even.") ;
				System.out.println("Terminating program") ;
				break ;
			}
		}
		numInput.close() ;

	}

}
