// Joshua Ciffer 3/28/2017 //

import java.util.Scanner ;

public class Tester {

	public static void main(String[] args) {

		Scanner inputScan = new Scanner(System.in) ;
		System.out.println("What's your age? ") ;
		int age = inputScan.nextInt();
		System.out.println("You are " + age + " years old.") ;
		System.out.println("Next year you will be " + (++age) + " years old.") ;
		inputScan.close() ;

		Scanner StringScanner = new Scanner(System.in) ;
		System.out.println("What is your name?") ;
		String name = StringScanner.nextLine() ;
		System.out.println("Your name is: " + name) ;
		StringScanner.close() ;
		
	}

}