// Joshua Ciffer 6/7/2017

import java.util.Scanner ;

public class Program14 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double num = 1 ;
		numInput = new Scanner(System.in) ;
		while (num != 0) {
			System.out.print("Enter a number: ") ;
			num = numInput.nextDouble() ;
			if (num == 0) {
				System.out.println("The program will now terminate.") ;
				break ;
			}
			System.out.println(Math.pow(num, 2));
		}
		numInput.close() ;
 	}

}
