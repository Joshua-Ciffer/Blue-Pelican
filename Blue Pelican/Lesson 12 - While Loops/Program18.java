// Joshua Ciffer 6/7/2017

import java.util.Scanner ;

public class Program18 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double num = 0 ;
		final int sentinel = 3 ;
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
			}
		}
		numInput.close() ;

	}

}
