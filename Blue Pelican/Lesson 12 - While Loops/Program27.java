// Joshua Ciffer 6/8/2017

import java.util.Scanner ;

public class Program27 {

	public static void main(String[] args) {
		
		Scanner stringInput ;
		String str ;
		int stringLength, i = 0 ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		str = stringInput.nextLine() ;
		stringLength = str.length() ;
		do {
			if ((i % 2) == 0) {
				System.out.print(str.substring(i, i + 1)) ;
				i++ ;
			} else {
				i++ ;
			}
		} while (i < stringLength) ;
		stringInput.close() ;
		
	}

}
