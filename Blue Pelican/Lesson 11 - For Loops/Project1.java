// Joshua Ciffer 5/8/2017

import java.util.Scanner ;

public class Project1 {

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
			System.out.println(word.charAt(x)) ;
		}
		stringInput.close() ;
		
	}

}
