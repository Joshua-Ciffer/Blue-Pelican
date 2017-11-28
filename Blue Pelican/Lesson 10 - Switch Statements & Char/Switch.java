// Joshua Ciffer 4/24/2017

import java.util.Scanner ;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Num_Input = new Scanner(System.in) ;
		
		System.out.println("1. Addition") ;
		System.out.println("2. Subtraction") ;
		System.out.println("3. Multiplication") ;
		System.out.println("4. Division\n") ;
		System.out.print("Enter a number that corresponds to the operation: ") ;
		
		int Choice = Num_Input.nextInt() ;
		System.out.print("\nEnter first operand: ") ;
		double OP1 = Num_Input.nextDouble();
		System.out.print("Enter second operand: \n") ;
		double OP2 = Num_Input.nextDouble() ;
		
		switch(Choice) {
			case 1: // Addition
				System.out.println(OP1 + " + " + OP2 + " = " + (OP1 + OP2)) ;
				break ;
			case 2: // Subtraction
				System.out.println(OP1 + " - " + OP2 + " = " + (OP1 - OP2)) ;
				break ;
			case 3: // Multiplication
				System.out.println(OP1 + " * " + OP2 + " = " + (OP1 * OP2)) ;
				break ;
			case 4: // Division
				System.out.println(OP1 + " / " + OP2 + " = " + (OP1 / OP2)) ;
				break ;
			default:
				System.out.println("Hey dummy, enter only a 1, 2, 3, or a 4!") ;
				break ;
		}
		
		Num_Input.close() ;
		
	}

}
