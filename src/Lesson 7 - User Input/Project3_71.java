// Joshua Ciffer 3/31/2017 //

import java.util.Scanner ;

public class Project3_71 {

	public static void main(String[] args) {

		Scanner Num_Input = new Scanner(System.in) ;
		System.out.println("-----Quadratic Equation Calculator-----") ;
		System.out.print("Enter A: ") ;
		double A = Num_Input.nextDouble() ;
		System.out.print("Enter B: ") ;
		double B = Num_Input.nextDouble() ;
		System.out.print("Enter C: ") ;
		double C = Num_Input.nextDouble() ;
		double X_Plus = ((-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C))/(2 * A)) ;
		double X_Minus = ((-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C))/(2 * A)) ;
		System.out.println("A = " + A) ;
		System.out.println("B = " + B) ;
		System.out.println("C = " + C) ;
		System.out.println("+X = " + X_Plus) ;
		System.out.println("-X = " + X_Minus) ;
		Num_Input.close() ;
		
	}

}