// Joshua Ciffer 6/8/2017

import java.util.Scanner ;

public class Program26 {

	public static void main(String[] args) {
		
		Scanner stringInput ;
		String str ;
		int stringLength, i = 0 ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		str = stringInput.nextLine() ;
		stringLength = str.length() ;
		while (i < stringLength) {
			System.out.print(str.charAt(stringLength - 1 - i)) ;
			i++ ;
		}
		
		stringInput.close() ;

	}

}
