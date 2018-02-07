// Joshua Ciffer 3/3/2017 //

import java.util.Scanner ;

public class Strings {

	public static void main(String[] args) {

		Scanner InputString = new Scanner(System.in) ;
		System.out.print("Type something: ") ;
		String x = InputString.nextLine() ;
		InputString.close() ;
		System.out.println("You typed: " + "\n" + x) ;
		
	}

}