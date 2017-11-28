// Joshua Ciffer 4/24/2017 //

import java.util.Scanner ;

public class Project {

	public static void main(String[] args) {

		Scanner stringInput, numInput ;
		String Command ;
		double OP1, OP2 ;
		System.out.println("       *****Calculator*****") ;
		System.out.println("-Addition") ;
		System.out.println("-Subtraction") ;
		System.out.println("-Multiplication") ;
		System.out.println("-Division") ;
		System.out.println("-Modulus") ;
		System.out.println("-Exponent")	; 
		System.out.println("-Root") ;
		stringInput = new Scanner(System.in) ;
		System.out.print("\nEnter one of the commands: ") ;
		Command = stringInput.nextLine() ; 
		numInput = new Scanner(System.in) ;
		switch(Command.toLowerCase()) {
			case "addition":
				System.out.print("\nEnter first operand: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("Enter second operand: ") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + " + " + OP2 + " = " + (OP1 + OP2)) ;
				break ;
			case "subtraction":
				System.out.print("\nEnter first operand: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("Enter second operand: ") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + " - " + OP2 + " = " + (OP1 - OP2)) ;
				break ;
			case "multiplication":
				System.out.print("\nEnter first operand: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("Enter second operand: ") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + " * " + OP2 + " = " + (OP1 * OP2)) ;
				break ;
			case "division":
				System.out.print("\nEnter first operand: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("Enter second operand: ") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + " / " + OP2 + " = " + (OP1 / OP2)) ;
				break ;
			case "modulus":
				System.out.print("\nEnter first operand: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("Enter second operand: ") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + " % " + OP2 + " = " + (OP1 % OP2)) ;
				break ;
			case "exponent":
				System.out.print("\nEnter the number to be raised to a power: ") ;
				OP1 = numInput.nextDouble() ;
				System.out.print("To be raised to power ^") ;
				OP2 = numInput.nextDouble() ;
				System.out.println("\n" + OP1 + "^" + OP2 + " = " + (Math.pow(OP1, OP2))) ;
				break ;
			case "root":
				System.out.print("\nEnter the index of the root: ") ;
				OP1 = numInput.nextDouble() ;
					if (OP1 == 2) {
						System.out.print("Enter the number to have the square root taken of: ") ;
						OP2 = numInput.nextDouble() ;
						System.out.println("\nSqrt[" + OP2 + "]" + " = " + (Math.sqrt(OP2))) ;
					} else if (OP1 == 3) {
						System.out.print("Enter the number to have the cube root taken of: ") ;
						OP2 = numInput.nextDouble() ;
						System.out.println("\nCbrt[" + OP2 + "]" + " = " + (Math.cbrt(OP2))) ;
					} else if (OP1 == 1) {
						System.out.print("It is pretty useless to take the 1st root of a number, but whatever: ") ;
						OP2 = numInput.nextDouble() ;
						System.out.println("\nI hope you're happy") ;
						System.out.println((int)OP1 + "strt[" + OP2 + "]" + " = " + (Math.pow(OP2, (1 / OP1)))) ;
					} else {
						System.out.print("Enter the number to have the " + OP1 + "th root taken of: " ) ;
						OP2 = numInput.nextDouble() ;
						System.out.println("\n" + (int)OP1 + "thrt[" + OP2 + "]" + " = " + (Math.pow(OP2, (1 / OP1)))) ;
					}
				break ;
			default:
				System.out.println("\nType one of the commands you moron") ;
		}
		stringInput.close() ;
		numInput.close() ;
	}

}