// Joshua Ciffer 3/30/2017

import java.util.Scanner ;

public class Project_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----Test Grade Averager-----") ;
		Scanner Test1 = new Scanner(System.in) ;
		Scanner Test2 = new Scanner(System.in) ;
		Scanner Test3 = new Scanner(System.in) ;
		System.out.println("Test 1 Grade? ") ;
		double Grade1 = Test1.nextDouble() ;
		System.out.println("Test 2 Grade? ") ;
		double Grade2 = Test2.nextDouble() ;
		System.out.println("Test 3 Grade? ") ;
		double Grade3 = Test3.nextDouble() ;
		double Average = ((Grade1 + Grade2 + Grade3)/3) ;
		System.out.println("Test 1 Grade: " + (int)Grade1) ;
		System.out.println("Test 2 Grade: " + (int)Grade2) ;
		System.out.println("Test 3 Grade: " + (int)Grade3) ;
		System.out.println("Average: " + Average) ;
		Test1.close() ;
		Test2.close() ;
		Test3.close() ;
		
	}

}
