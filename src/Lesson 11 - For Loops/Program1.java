// Joshua Ciffer 5/9/2017 //

import java.util.Scanner ;

public class Program1 {

	public static void main(String[] args) {

		Scanner stringInput ;
		String word ;
		int wordLength ;
		stringInput = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		word = stringInput.nextLine() ;
		wordLength = word.length() ;
		for (int x = 0 ; x < wordLength ; x++) {
			System.out.print(word.substring(x, (x + 1)) + " ") ;
			if (x == wordLength) {
				break ;
			}
		}
		stringInput.close() ;
		
	}

}