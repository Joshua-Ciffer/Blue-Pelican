// Joshua Ciffer 5/9/2017

import java.util.Scanner ;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stringInput ;
		String word ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		for (int x = 0 ; x < word.length() ; x++) {
			char a = 'a', e = 'e', i = 'i', o ='o', u = 'u' ;
			if (!(word.charAt(x) == a || word.charAt(x) == e || word.charAt(x) == i || word.charAt(x) == o || word.charAt(x) == u)) {
				System.out.print(word.charAt(x)) ;
			} 
			if (x >= word.length()) {
				break ;
			}
		}
		stringInput.close() ;
		
	}

}
