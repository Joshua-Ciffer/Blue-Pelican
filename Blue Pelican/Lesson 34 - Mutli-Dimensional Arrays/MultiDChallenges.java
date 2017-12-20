import java.util.Scanner ;
import java.util.InputMismatchException ;

/**
 * Multidimensional Array Challenge Problems.
 * 
 * @author Joshua Ciffer, Brian Williams
 * @version 12/13/2017
 */
public abstract class MultiDChallenges {

	public static void main(String[] args) {
		do {	// Begin Main Program Loop
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in) ;
			short menuOption ;
			System.out.println("-----Stupid Array Problems-----") ;
			System.out.println("(1) randomInts()") ;
			System.out.println("(2) invert()") ;
			System.out.println("(3) toCharArray()") ;
			System.out.println("(4) doStuff()") ;
			System.out.println("(5) Exit") ;
			System.out.print("Enter an option: ") ;
			try {
				menuOption = userInput.nextShort() ;
			} catch (InputMismatchException e) {
				System.out.print("\nEnter an option you idiot.\n") ;
				userInput.next() ;
				continue ;
			}
			switch (menuOption) {	// Begin Menu Switch
				case 1: {	// randomInts()
					randomInts() ;
					break ;
				}
				case 2: {	// invert()
					try {
						invert(fillArray()) ;
					} catch (IllegalArgumentException e) {
						System.out.println(e.getMessage()) ;
					}
					break ;
				}
				case 3: {	// toCharArray()
					do {
						System.out.print("How many words do you want to enter?: ") ;
						short numWords ;
						try {
							numWords = userInput.nextShort() ;
						} catch (InputMismatchException e) {
							System.out.println("Enter a number please.") ;
							userInput.next() ;
							continue ;
						}
						String[] words = new String[numWords] ;
						userInput.nextLine() ;
						for (int i = 0 ; i < numWords ; i++) {
							System.out.print("Enter word #" + (i + 1) + ": ") ;
							words[i] = userInput.nextLine();
						}
						toCharArray(words) ; 
						break ;
					} while (true) ;
					break ;
				}
				case 4: {	// doStuff()
					// Change array values for doStuff() here. I didn't feel like implementing a way to create an int[][] off of user input.
					int[][] x = {{2, 5, 6, 87, 23}, {6, 7, 7, 7, 20}, {1, 2, 5, 80, 4}} ;
					doStuff(x) ;
					break ;
				}
				case 5: {	// Exit
					userInput.close() ; 
					System.exit(0) ;
				}
				default: {
					System.out.print("\nEnter an option you idiot.\n") ;
					continue ;
				}
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
		printArray(originalAry) ;
		System.out.print("\n") ;
		printArray(invertedAry) ;
	}
	
	public static char[][] toCharArray(String[] strAry) {
		char[][] charAry = new char[strAry.length][] ;
		for (int i = 0 ; i < charAry.length ; i++) {
			charAry[i] = new char[strAry[i].length()] ;
		}
		for (int i = 0 ; i < charAry.length ; i++) {
			int k = 0 ;
			for (int j = 0 ; j < charAry[i].length ; j++) {
				charAry[i][j] = strAry[i].charAt(k) ;
				k++ ;
			}
		}
		printArray(strAry) ;
		printArray(charAry) ;
		return charAry ;
	}
	
	public static void doStuff(int[][] ary) {
		int[][] newAry = new int[ary.length][] ;
		for (int i = 0 ; i < newAry.length ; i++) {
			newAry[i] = new int[ary[i].length] ;
		}
		for (int i = 0 ; i < newAry.length ; i++) {
			for (int j = 0 ; j < newAry[i].length ; j++) {
				if (i == (newAry.length - 1)) {
					newAry[i][j] = ary[i][j] ;
				} else if (ary[i][j] > 80) {
					newAry[i][j] = ary[i][0] ;
				} else if ((ary[i][j] % 2) == 0) {
					newAry[i][j] = ary[i + 1][j] ;
				} else {
					newAry[i][j] = ary[i][j] ;
				}
			}
		}
		printArray(ary) ;
		System.out.print("\n") ;
		printArray(newAry) ;
	}
	
	private static void printArray(String[] strAry) {
		for (int i = 0 ; i < strAry.length ; i++) {
			System.out.print(strAry[i] + "\t") ;
		}
		System.out.print("\n") ;
	}
	
	private static void printArray(char[][] charAry) {
		for (int i = 0 ; i < charAry.length ; i++) {
			for (int j = 0 ; j < charAry[i].length ; j++) {
				System.out.print(charAry[i][j] + "\t") ;
			}
			System.out.print("\n") ;
		}
		System.out.print("\n") ;
	}
	
	private static void printArray(int[][] intAry) {
		for (int i = 0 ; i < intAry.length ; i++) {
			for (int j = 0 ; j < intAry[i].length ; j++) {
				System.out.print(intAry[i][j] + "\t") ;
			}
			System.out.print("\n") ;
		}
		System.out.print("\n") ;
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