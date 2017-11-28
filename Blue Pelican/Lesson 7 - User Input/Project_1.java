// Joshua Ciffer 3/30/2017

import java.util.Scanner ;

public class Project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----Radius of a Circle Calculator-----") ;
		Scanner Area_Input = new Scanner(System.in) ;
		System.out.print("Enter the area of a circle to calculate its radius: ") ;
		double Area = Area_Input.nextDouble();
		Area_Input.close() ;
		double Radius = (Math.sqrt(Area / Math.PI)) ;
		System.out.println("Radius: " + Radius) ;
		System.out.println("Area: " + Area) ;
	}

}

