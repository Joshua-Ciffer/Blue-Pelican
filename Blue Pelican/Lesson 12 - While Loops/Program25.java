// Joshua Ciffer 6/8/2017

import java.util.Scanner ;

public class Program25 {

	public static void main(String[] args) {

		Scanner stringInput ;
		String str ;
		int stringLength, i = 0, a = 0 ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		str = stringInput.nextLine() ;
		stringLength = str.length() ;
		while (i < stringLength) {
			if (str.charAt(i) == 'a') {
				a++ ;
			}
			i++ ;
		}
		System.out.println("The letter 'a' occoured " + a + " times in the string you entered.") ;
		stringInput.close() ;

	}

}
