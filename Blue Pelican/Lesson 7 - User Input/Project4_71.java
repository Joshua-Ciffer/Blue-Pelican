// Joshua Ciffer 3/31/2017

import java.util.Scanner ;

public class Project4_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner String_Input = new Scanner(System.in) ;
		System.out.println("Enter a sentance") ;
		String Sentance = String_Input.nextLine() ;
		System.out.println("What substring should I find?") ;
		String Find = String_Input.nextLine() ;
		System.out.println("The character is at index " + Sentance.indexOf(Find)) ;
		String_Input.close() ;
		
	}

}
