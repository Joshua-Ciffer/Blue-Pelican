// Joshua Ciffer 4/24/2017

import java.util.Scanner ;

public class Lesson91_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Num_Input = new Scanner(System.in) ;
		System.out.println("Enter a number") ;
		double Num1 = Num_Input.nextDouble() ;
		System.out.println("Enter another number") ;
		double Num2 = Num_Input.nextDouble() ;
		if ((Num1) == (Num2 / 2)) {
			System.out.println("That's so fetch!") ;
		} else if ((2 * Num1) >= (Num2)) {
			System.out.println("Your face smells like peppermint!") ;
		} 
		Num_Input.close() ;
		
	}

}
