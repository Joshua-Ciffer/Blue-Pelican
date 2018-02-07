// Joshua Ciffer 6/8/2017 //

import java.util.Scanner ;

public class Program23 {

	public static void main(String[] args) {

		Scanner numInput ;
		double number ;
		int i = 1 ;
		numInput = new Scanner(System.in) ;
		System.out.print("Enter a number to FACTOR THOSE PUPS: ") ;
		number = numInput.nextDouble() ;
		if (number < 0) {
			number *= -1 ;
		}
		System.out.print("The factors of THAT DANK PUP " + number + " are ");
		while (i <= number) {
			if ((number % i) == 0) {
				System.out.print(i + ", ") ;
			}
			i++ ;
		}
		numInput.close() ;
		
	}

}