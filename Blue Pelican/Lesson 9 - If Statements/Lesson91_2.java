// Joshua Ciffer 4/24/2017 //

import java.util.Scanner ;

public class Lesson91_2 {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in) ;
		System.out.println("Enter a string") ;
		String String1 = Input.nextLine() ;
		System.out.println("Enter another string") ;
		String String2 = Input.nextLine() ;
		if (String1.equals(String2)) {
			System.out.println("Equal - Case Sensetive") ;
		} else if (String1.equalsIgnoreCase(String2)) {
			System.out.println("Equal - Not Case Sensetive") ;
		} else {
			System.out.println("Not Equal") ;
		}
		Input.close() ;
		
	}

}