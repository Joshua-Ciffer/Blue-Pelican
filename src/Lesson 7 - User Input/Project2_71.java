// Joshua Ciffer 3/31/2017 //

import java.util.Scanner ;

public class Project2_71 {

	public static void main(String[] args) {

		Scanner Num_Input = new Scanner(System.in) ;
		System.out.println("-----Pythagorean Theorem Calculator-----") ;
		System.out.print("Enter A: ") ;
		double A = Num_Input.nextDouble() ;
		System.out.print("Enter B: ") ;
		double B = Num_Input.nextDouble() ;
		double C = (Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2))) ;
		System.out.println("A = " + A) ;
		System.out.println("B = " + B) ;
		System.out.println("C = " + C) ;
		System.out.println("Square root of " + A +"^2" + " + " + B + "^2" + " = " + C) ;
		
		Num_Input.close();
		
	}

}