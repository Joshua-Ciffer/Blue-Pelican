// Joshua Ciffer 6/7/2017 //

import java.util.Scanner ;

public class Program16 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double num = 1 ;
		numInput = new Scanner(System.in) ;
		while (num > 0) {
			System.out.print("Enter a number: ") ;
			num = numInput.nextDouble() ;
			if (num > 0) {
				System.out.println("The number you entered is positive") ;
			}
			if (num < 0) {
				System.out.println("The number you entered is negative.") ;
				System.out.println("The program will now terminate.") ;
				break ;
			}
			if (num == 0) {
				System.out.println("The number you entered is not positve.") ;
				System.out.println("The program will now terminate.") ;
				break ;
			}
		}
		numInput.close() ;

	}

}