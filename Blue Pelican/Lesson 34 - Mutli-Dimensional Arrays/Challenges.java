import java.util.Scanner ;
import java.util.InputMismatchException ;

/**
 * Multidimensional Array Challenge Problems.
 * 
 * @author Joshua Ciffer
 * @version 12/13/2017
 */
public abstract class Challenges {

	public static void main(String[] args) {
		do {	// Begin Main Program Loop
			Scanner userInput = new Scanner(System.in) ;
			short menuOption ;
			System.out.println("-----Stupid Arrays Problem-----") ;
			System.out.println("(1) randomInts()") ;
			System.out.println("(2) invert()") ;
			System.out.println("(3) toCharArray()") ;
			System.out.println("(4) doStuff()") ;
			System.out.print("Enter an option: ") ;
			try {
				menuOption = userInput.nextShort() ;
			} catch (InputMismatchException e) {
				System.out.print("\nEnter an option you idiot.\n") ;
				userInput.next() ;
				continue ;
			}
			switch (menuOption) {	// Begin Menu Switch
				
			}	// End Menu Switch
		} while (true) ;	// End Main Program Loop
	}
	
	public static void randomInts() {
		int[][] ary = new int[10][10] ;
		int randomIncrementer = 10 ;
		for (int i = 0 ; i < ary.length ; i++) {
			for (int j = 0 ; j < ary[i].length ; j++) {
				ary[i][j] = (int)(Math.random() * randomIncrementer) ;
			}
			randomIncrementer += 10 ;
		}
		printArray(ary) ;
	}
	
	public static void invert(int[][] originalAry) throws IllegalArgumentException {
		for (int i = 0 ; i < originalAry.length ; i++) {
			if (originalAry[i].length == originalAry.length) {
				// Do nothing.
			} else {
				throw new IllegalArgumentException("The array needs to be square.") ;
			}
		}
		int[][] invertedAry = new int[originalAry.length][originalAry.length] ;
		for (int i = 0 ; i < invertedAry.length ; i++) {
			for (int j = 0 ; j < invertedAry[i].length ; j++) {
				invertedAry[i][j] = originalAry[j][i] ;
			}
		}
		printArray(invertedAry) ;
	}
	
	public static char[][] toCharArray(String[] strAry) {
		char[][] charAry = new char[strAry.length][] ;
		for (int i = 0 ; i < charAry.length ; i++) {
			charAry[i] = new char[strAry[i].length()] ;
		}
		for (int i = 0 ; i < charAry.length ; i++) {
			for (int j = 0 ; j < charAry[i].length ; j++) {
				for (int k = 0 ; k < strAry[i].length() ; k++) {
					charAry[i][j] = strAry[i].charAt(k) ;
				}
			}
		}
		printArray(strAry) ;
		printArray(charAry) ;
		return charAry ;
	}
	
	private static void printArray(String[] strAry) {
		for (int i = 0 ; i < strAry.length ; i++) {
			System.out.print(strAry[i] + "/t") ;
		}
	}
	
	private static void printArray(char[][] charAry) {
		for (int i = 0 ; i < charAry.length ; i++) {
			for (int j = 0 ; j < charAry[i].length ; j++) {
				System.out.print(charAry[i][j] + "/t") ;
			}
			System.out.print("/n") ;
		}
	}
	
	private static void printArray(int[][] intAry) {
		for (int i = 0 ; i < intAry.length ; i++) {
			for (int j = 0 ; j < intAry[i].length ; j++) {
				System.out.print(intAry[i][j] + "/t") ;
			}
			System.out.print("\n") ;
		}
	}
	
	private static int[][] fillArray() {
		int[][] ary = new int[10][10] ;
		int randomIncrementer = 10 ;
		for (int i = 0 ; i < ary.length ; i++) {
			for (int j = 0 ; j < ary[i].length ; j++) {
				ary[i][j] = (int)(Math.random() * randomIncrementer) ;
			}
			randomIncrementer += 10 ;
		}
		return ary ;
	}
	
}