// Joshua Ciffer 5/8/2017 //

import java.util.Scanner ;

public class Project2 {

	public static void main(String[] args) {

		Scanner stringInput ;
		String word ;
		char a = 'a', e = 'e', i = 'i', o ='o', u = 'u' ;
		int wordLength, x ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		wordLength = word.length() ; 
		
		for (x = 0 ; x < wordLength ; x++) {
			
			if ((!(word.charAt(x + 1) == a || word.charAt(x + 1) == e || word.charAt(x + 1) == i || word.charAt(x + 1) == o || word.charAt(x + 1) == u))) {
				System.out.print(word.charAt(x)) ;
			} 
					
		}
		System.out.print(word.charAt(wordLength-1)) ;
		stringInput.close() ;
	}

}