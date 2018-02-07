// Joshua Ciffer 4/24/2014 //

import java.util.Scanner ;

public class Exercises {

	public static void main(String[] args) {

		// #1
		System.out.println("#1: 3 data types that can be used in switch statments are Strings, Integers, and Characters") ;
		// #2
		int x = 3, p = 5, y = -8 ;
		switch(x) {
			case 2:
				p++ ;
			case 3:
			case 4:
				y += (--p) ;
				break ;
			case 5:
				y += (p++) ;
		}
		System.out.println("#2: " + y) ;
		// #3
		Scanner Char_Input = new Scanner(System.in) ;
		System.out.println("#4 Enter a character: ") ;
		String Input = Char_Input.nextLine() ;
		char myChar = Input.charAt(0) ;
		switch(myChar) {
			case 'g':
			case 'G':
				y++ ;
				break ;
			case 'm':
			case 'M':
				y-- ;
				break ;
			default:
				y += 100 ;
				break ;
		}
		Char_Input.close() ;
		// #4
		String s = "Green" ;
		int q = 0 ;
		switch(s) {
			case "Red":
				q++ ;
			case "Green":
				q++ ;
			case "Blue":
				q++ ;
			case "Yellow":
				q++ ;
			default:
				q++ ;				
		}
		System.out.println(--q) ;
		// #5
		char chr = 'z' ;
		System.out.println("#5: " + chr) ;
		// #6
		//int x1 = 10, y1 = 12 ;
		System.out.println("#6: The sum is " + x + y) ;
		System.out.println("The sum is " + (x + y)) ;
		// #7
		int speed = 0 ;
		switch(speed) {
			case 75:
				System.out.println("Exceeding speed limit") ;
				break ;
			case 69:
			case 70:
				System.out.println("Getting close") ;
				break ;
			case 65:
				System.out.println("Cruising") ;
				break ;
			default:
				System.out.println("Very slow") ;
				break ;
		}
		// #8 
		// Defualt is not a mandatory part of a switch structure
		// #9
		//String s1 = "X" ;
		//char chr1 = s1.charAt(0) ;
		
	}

}