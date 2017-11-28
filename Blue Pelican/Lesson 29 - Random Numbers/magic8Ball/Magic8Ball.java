// Joshua Ciffer 11/25/2017 //

package magic8Ball ;
import java.util.Random ;
import java.util.ArrayList ;
import java.util.Scanner ;
import java.util.InputMismatchException ;

public class Magic8Ball {

	private static ArrayList<String> PHRASES = new ArrayList<>(20) ;
	private static Random RANDOM = new Random() ;
	private static Scanner userInput ;
	
	public static void main(String[] args) {
		INITIALIZE_PHRASES() ;
		do {	// Begin Main Program Loop
			String phrase ;
			short menuOption ;
			userInput = new Scanner(System.in) ;
			System.out.println("-----Magic 8 Ball Main Menu-----") ;
			System.out.println("(1) Roll") ;
			System.out.println("(2) Display Phrases") ;
			System.out.println("(3) Add Phrase") ;
			System.out.println("(4) Delete Phrase") ;
			System.out.println("(5) Exit") ;
			System.out.print("Enter An Option: ") ;
			try {
				menuOption = userInput.nextShort() ;
			} catch (InputMismatchException e) {
				System.out.println("\nEnter One Of The Given Options.\n") ;
				userInput.next() ;
				continue ;
			}
			switch (menuOption) {
				case 1: {	// Roll
					ROLL() ;
					break ;
				}
				case 2: {	// Display Phrases
					System.out.print("\n") ;
					DISPLAY_PHRASES() ;
					System.out.print("\n") ;
					break ;
				}
				case 3: {	// Add Phrase
					userInput.nextLine() ;
					do {	// Begin Add Phrase Loop
						System.out.print("\nEnter The Phrase To Add: ") ;
						try {
							phrase = userInput.nextLine() ;
						} catch (InputMismatchException e) {
							System.out.println("\nEnter The Phrase.\n") ;
							userInput.next() ;
							continue ;
						}
						ADD_PHRASE(phrase) ;
						break ;
					} while (true) ;	// End Add Phrase Loop
					break ;
				}
				case 4: {	// Delete Phrase
					userInput.nextLine() ;
					do {	// Begin Delete Phrase Loop
						System.out.print("\nEnter The Phrase To Delete: ");
						try {
							phrase = userInput.nextLine() ;
						} catch (InputMismatchException e) {
							System.out.println("\nEnter The Phrase.\n") ;
							userInput.next() ;
							continue ;
						}
						DELETE_PHRASE(phrase) ;
						break ;
					} while (true) ;	// End Delete Phrase Loop
					break ;
				}
				case 5: {	// Exit
					System.exit(0) ;
				}
				default: {	// Error
					System.out.println("\nEnter One Of The Given Options.\n") ;
					continue ;
				}
			}
		} while (true) ;	// End Main Program Loop
	}
	
	private static void INITIALIZE_PHRASES() {
		String[] initialPhrase = new String[20] ;
		initialPhrase[0] = "It is certain" ;
		initialPhrase[1] = "It is decidedly so" ;
		initialPhrase[2] = "Without a doubt" ;
		initialPhrase[3] = "Yes definently" ;
		initialPhrase[4] = "You may rely on it" ;
		initialPhrase[5] = "As I see it, yes" ;
		initialPhrase[6] = "Most likely" ;
		initialPhrase[7] = "Outlook good" ;
		initialPhrase[8] = "Yes" ;
		initialPhrase[9] = "Signs point to yes" ;
		initialPhrase[10] = "Reply hazy try again" ;
		initialPhrase[11] = "Ask again later" ;
		initialPhrase[12] = "Better not tell you now" ;
		initialPhrase[13] = "Cannot predict now" ;
		initialPhrase[14] = "Concentrate and ask again" ;
		initialPhrase[15] = "Don't count on it" ;
		initialPhrase[16] = "My reply is no" ;
		initialPhrase[17] = "My sources say no" ;
		initialPhrase[18] = "Outlook is not so good" ;
		initialPhrase[19] = "Very doubtful" ;
		for (String phrase : initialPhrase) {
			Magic8Ball.PHRASES.add(phrase) ;
		}
  	}	
	
	public static void ROLL() {
		int rolledNumber = 0 + Magic8Ball.RANDOM.nextInt(Magic8Ball.PHRASES.size()) ;
		System.out.println("\n" + Magic8Ball.PHRASES.get(rolledNumber) + ".\n") ;
	}
	
	public static void DISPLAY_PHRASES() {
		int i = 1 ;
		for (String phrase : Magic8Ball.PHRASES) {
			System.out.println("Phrase "+ i + ": " + phrase) ;
			i++ ;
		}
	}	
	
	public static void ADD_PHRASE(String newPhrase) {
		Magic8Ball.PHRASES.add(newPhrase) ;
		System.out.println("\nAdded Phrase \"" + newPhrase + "\".\n") ;
	}	
	
	public static void DELETE_PHRASE(String deleteThisPhrase) {
		boolean arrayContainsPhrase = false ;
		for (int i = 0 ; i < Magic8Ball.PHRASES.size() ; i++) {
			if (Magic8Ball.PHRASES.get(i).equalsIgnoreCase(deleteThisPhrase)) {
				arrayContainsPhrase = true ;
				Magic8Ball.PHRASES.remove(i) ;
				break ;
			}
			arrayContainsPhrase = false ; 
		}
		if (arrayContainsPhrase) {
			System.out.println("\nDeleted Phrase \"" + deleteThisPhrase + "\".\n") ;
		} else {
			System.out.println("\nThis phrase was not found.\n-") ;
		}
	}	
	
}	// End Magic8Ball Class