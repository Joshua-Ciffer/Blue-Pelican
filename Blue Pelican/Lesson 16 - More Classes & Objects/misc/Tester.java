// Joshua Ciffer 10/2/2017 //

package misc ;
import java.util.Scanner ;

public class Tester {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in), parse ;
		String s ;
		int sum = 0 ;
		System.out.print("Enter something like 8 + 33 + 1,345 + 137: ") ;
		s = userInput.nextLine() ;
		parse = new Scanner(s) ;
		parse.useDelimiter("\\s*\\+\\s") ;
		while (parse.hasNextInt()) {
			sum += parse.nextInt() ;
		}
		System.out.println("Sum is: " + sum) ;
		parse.close() ;
		userInput.close() ;
		
	}
	
}