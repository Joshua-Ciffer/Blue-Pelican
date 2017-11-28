// Joshua Ciffer 5/9/2017

import java.util.Scanner ;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stringInput ;
		String word ;
		int wordLength ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		wordLength = word.length() ;
		for (int x = 0 ; x < wordLength ; x++) {
			System.out.print(word.charAt(wordLength - x  - 1)) ;
		}
		stringInput.close() ;
	}

}
