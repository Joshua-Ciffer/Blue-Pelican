// Joshua Ciffer 3/31/2017 //

import java.util.Scanner ;

public class Project_3 {

	public static void main(String[] args) {

		Scanner FNameIn = new Scanner(System.in) ;
		Scanner LNameIn = new Scanner(System.in) ;
		System.out.println("What is your first name?") ;
		String FName = FNameIn.nextLine() ;
		System.out.println("What is your last name?") ;
		String LName = LNameIn.nextLine() ;
		System.out.println("Your full name is " + FName + " " + LName) ;
		FNameIn.close() ;
		LNameIn.close() ;
		
	}

}