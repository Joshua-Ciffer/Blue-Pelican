// Joshua Ciffer 5/8/2017

import java.util.Scanner ;

public class Project5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner stringInput, numInput ;
		String word ;
		int number, wordLength ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		wordLength = word.length() ;
		numInput = new Scanner(System.in) ;
		System.out.println("Enter a number") ;
		number = numInput.nextInt() ;
		
		for (int x = 0 ; x < wordLength ; x++) {
			char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u' ; 
			
			if (!(word.charAt(x) == a || word.charAt(x) == e || word.charAt(x) == i || word.charAt(x) == o || word.charAt(x) == u)) {
				System.out.print(word.charAt(x)) ;
			} else if (word.charAt(x) == a || word.charAt(x) == e || word.charAt(x) == i || word.charAt(x) == o || word.charAt(x) == u) {
				for (int y = 0 ; y < number ; y++) {
					
				}
			}
			//for (int y = 0 ; y <= number ; y++, x++) {
 			//	if (word.charAt(x) == a || word.charAt(x) == e || word.charAt(x) == i || word.charAt(x) == o || word.charAt(x) == u) {
 			//		System.out.print(word.charAt(x)) ;
 			//	}
			//	if (y == number) {
			//		break ;
			//	}
			//}
		}
		stringInput.close() ;
		numInput.close() ; 
	}
}
