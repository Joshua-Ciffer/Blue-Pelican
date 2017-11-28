// Joshua Ciffer 4/24/2017

import java.util.Scanner ;

public class Switch_On_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Char_Input = new Scanner(System.in) ;
		
		System.out.println("A. Addition") ;
		System.out.println("S. Subtraction") ;
		System.out.println("M. Multiplication") ;
		System.out.println("D. Division\n") ;
		System.out.print("Enter a letter that corresponds to the operation: ") ;
		
		String Choice = Char_Input.nextLine() ;
		char ch = Choice.charAt(0) ;
		System.out.print("\nEnter first operand: ") ;
		double OP1 = Char_Input.nextDouble();
		System.out.print("Enter second operand: \n") ;
		double OP2 = Char_Input.nextDouble() ;
		
		switch(ch) {
			case 'A': // Addition
			case 'a': 
				System.out.println(OP1 + " + " + OP2 + " = " + (OP1 + OP2)) ;
				break ;
			case 'S':  // Subtraction
			case 's':
				System.out.println(OP1 + " - " + OP2 + " = " + (OP1 - OP2)) ;
				break ;
			case 'M': // Multiplication
			case 'm':
				System.out.println(OP1 + " * " + OP2 + " = " + (OP1 * OP2)) ;
				break ;
			case 'D': // Division
			case 'd':
				System.out.println(OP1 + " / " + OP2 + " = " + (OP1 / OP2)) ;
				break ;
			default:
				System.out.println("Hey dummy, enter only a 1, 2, 3, or a 4!") ;
				break ;
		}
		Char_Input.close() ;

	}

}
