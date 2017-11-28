// Joshua Ciffer 6/7/2017

import java.util.Scanner ;

public class Program19 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double num = 1, product = 1 ;
		final int sentinel = 0 ;
		numInput = new Scanner(System.in) ;
		while (num != sentinel) {
			System.out.print("Enter a number: ") ;
			num = numInput.nextDouble() ;
			if (num == sentinel) {
				System.out.println("You entered the sentinel value.") ;
				System.out.println("The program will now terminate.") ;
				break ;
			} else {
				System.out.println("You entered: " + num) ;
				product *= num ;
				System.out.println("The product of the numbers you have entered so far is: " + product + "\n") ;
			}
		}
		numInput.close() ;
	}

}
