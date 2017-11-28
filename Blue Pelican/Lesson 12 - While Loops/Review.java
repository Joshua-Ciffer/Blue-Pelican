// Joshua Ciffer 6/14/2017

import java.util.Scanner ;

public class Review {

	Scanner scan = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		Review run = new Review() ;
		run.five() ;
	}

	public void one() {
		String word ;
		System.out.println("Enter a word") ;
		word = scan.nextLine() ;
		if (word.length() == 4) {
			System.out.println("By George I think he's got it") ;
		} else if (word.length() > 4) {
			System.out.println(word.substring(word.length() - 4)) ;
		} else {
			for (int i = 0 ; i < 4 ; i++) {
				System.out.println(word) ;
			}
		}
		scan.close() ;
	}
	
	public void two() {
		double number ;
		System.out.print("Enter a number: ") ;
		number = scan.nextDouble() ;
		System.out.println(Math.pow((Math.sqrt(number * 2014)), 3)) ;
		scan.close() ;
	}
	
	public void three() {
		String word ;
		System.out.println("Enter a word") ;
		word = scan.nextLine() ;
		if (word.charAt(0) == 'a') {
			System.out.println(word.substring(1)) ;
		} else if (word.charAt(0) == 'e') {
			System.out.println("eee" + word) ;
		} else if (word.charAt(0) == 'i') {
			System.out.println("eye for an " + word) ;
		} else if (word.charAt(0) == 'o') {
			System.out.println("outta here") ;
		} else if (word.charAt(0) == 'u') {
			System.out.println(word.replace('u', 'w')) ;
		} else {
			System.out.println(word) ;
		}
		scan.close() ;
	}
	
	public void four() {
		String word1, word2 ;
		System.out.println("Enter a word") ;
		word1 = scan.nextLine() ;
		System.out.println("Enter another word") ;
		word2 = scan.nextLine() ;
		if (word1.charAt(0) == word2.charAt(0)) {
			System.out.println("Whoa") ;
		} else if (word1.charAt(word1.length() - 1) == word2.charAt(word1.length() - 1)) {
			System.out.println("Man") ;
		} else if (word1.length() == word2.length()) {
			System.out.println("WhodaThunkIt") ;
		} else 
		scan.close() ;
	}
	
	public void five() {
		double number = -1 ;
		while (number < 0) {
			System.out.print("Enter a number: ") ;
			number = scan.nextDouble() ;
			
		}
		
		scan.close() ;
	}
	
	public void six() {
		
	}
	
	
}
