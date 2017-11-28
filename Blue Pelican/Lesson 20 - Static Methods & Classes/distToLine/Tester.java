// Joshua Ciffer 11/13/2017 //

package distToLine ;
import distToLine.DistToLine ;
import java.util.Scanner ;
import java.util.InputMismatchException ;

public class Tester {
	
	private static Scanner userInput ;
	private static double x, y ;
	private static String closeProgram ;
	private static boolean exitLoop ;
	
	public static void main(String[] args) {
		
		userInput = new Scanner(System.in) ;
		exitLoop = false ;
		do {	// Begin Main Menu Loop
			do {	// Begin A Loop
				System.out.print("Enter The Value For A: ") ;
				try {
					DistToLine.A = userInput.nextDouble() ;
					break ;
				} catch (InputMismatchException e) {
					System.out.println("\nPlease Enter The Value For A.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End A Loop
			do {	// Begin B Loop
				System.out.print("Enter The Value For B: ") ;
				try {
					DistToLine.B = userInput.nextDouble() ;
					break ;
				} catch (InputMismatchException e) {
					System.out.println("\nPlease Enter The Value For B.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End B Loop
			do {	// Begin C Loop
				System.out.print("Enter The Value For C: ") ;
				try {
					DistToLine.C = userInput.nextDouble() ;
					break ;
				} catch (InputMismatchException e) {
					System.out.println("\nPlease Enter The Value For B.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End C Loop
			do {	// Begin x Loop
				System.out.print("Enter The Coordinate For X: ") ;
				try {
					x = userInput.nextDouble() ;
					break ;
				} catch (InputMismatchException e) {
					System.out.println("\nPlease Enter The Coordinate For x.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End x Loop
			do {	// Begin y Loop
				System.out.print("Enter The Coordinate For y: ") ;
				try {
					y = userInput.nextDouble() ;
					break ;
				} catch (InputMismatchException e) {
					System.out.println("\nPlease Enter The Coordinate For y.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End y Loop
			System.out.print("\n") ;
			System.out.println("Distance: " + DistToLine.GET_DISTANCE(x, y)) ;
			userInput.nextLine() ;
			System.out.print("\n") ;
			do {	// Begin Continue Loop
				System.out.print("Close Program: Yes Or No? ") ;
				try {
					closeProgram = userInput.nextLine() ;
					if (closeProgram.equalsIgnoreCase("Yes")) {
						exitLoop = true ;
						break ;
					} else {
						System.out.print("\n") ;
						break ;
					}
				} catch (InputMismatchException e) {
					System.out.println("\nEnter Yes or No.\n") ;
					userInput.next() ;
					continue ;
				}
			} while (true) ;	// End Continue Loop
		} while (exitLoop == false) ;	// End Main Menu Loop
		
	}
	
}