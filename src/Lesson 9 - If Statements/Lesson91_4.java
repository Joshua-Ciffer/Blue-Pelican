// Joshua Ciffer 4/24/2017 //

import java.util.Scanner ;

public class Lesson91_4 {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in) ;
		System.out.print("Type yes or no: ") ;
		String UserInput = Input.nextLine() ;
		if (UserInput.equalsIgnoreCase("yes")) {
			System.out.println("of course") ;
		} else if (UserInput.equalsIgnoreCase("no")) {
			System.out.println("indubiably") ;
		} else {
			System.out.println("hhhhhwwwhhaatttt?!?!") ;
		}
		Input.close() ;
		
	}

}