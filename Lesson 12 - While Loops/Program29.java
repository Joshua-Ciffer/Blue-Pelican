// Joshua Ciffer 6/7/2017 //

import java.util.Scanner ;

public class Program29 {

	public static void main(String[] args) {
		
		Scanner stringInput ;
		String str ;
		int stringLength, i = 0 ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		str = stringInput.nextLine() ;
		stringLength = str.length() ;
		do {
			for (int x = 0 ; x < i ; x++) {
				System.out.print(" ") ;
			}
			System.out.println(str.charAt(i)) ;
			i++ ;
		} while (i < stringLength) ;
		stringInput.close() ;
	}

}