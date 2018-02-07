// Joshua Ciffer 5/8/3027 //

import java.util.Scanner ;

public class Project4 {

	public static void main(String[] args) {
		
		Scanner stringInput ;
		String word ;
		int wordLength ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		wordLength = word.length() ;
		for (int x = 0 ; x < wordLength ; x++) {
			if ((x % 2) == 0) {
				String userInputUpperCase = word.toUpperCase();
				System.out.print(userInputUpperCase.substring(x, (x + 1))) ;
			} else {
				String userInputLowerCase = word.toLowerCase() ;
				System.out.print(userInputLowerCase.substring(x, (x + 1))) ;
			}
			if (x >= wordLength) {
			break ;
			}
			
		}
		stringInput.close() ; 
		
	}

}