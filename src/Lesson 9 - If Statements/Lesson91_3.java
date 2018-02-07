// Joshua Ciffer 4/24/2017 //

import java.util.Scanner ;

public class Lesson91_3 {

	public static void main(String[] args) {

		Scanner Num_Input = new Scanner(System.in) ;
		System.out.print("Enter a number: ") ;
		double Number = Num_Input.nextDouble() ;
		double Remainder = (Number % 5) ;
		if (Remainder == 0) {
			System.out.println("The dude abides") ;
		} else if (Remainder == 1) {
			System.out.println("The road to success is always under construction") ;
		} else if (Remainder == 2) {
			System.out.println("Has Anyone Really Been Far Even as Decided to Use Even Go Want to do Look More Like?") ;
		} else if (Remainder == 3) {
			System.out.println("I can lick my elbows") ;
		} else if (Remainder == 4) {
			System.out.println("Shrek is love, Shrek is life") ;
		} else {
			System.out.println("Error!") ; 
		}
		Num_Input.close() ;
		
	}

}