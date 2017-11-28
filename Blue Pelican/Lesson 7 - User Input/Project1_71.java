// Joshua Ciffer 3/31/2017 //

import java.util.Scanner ;

public class Project1_71 {

	public static void main(String[] args) {

		Scanner String_Input = new Scanner(System.in) ;
		Scanner Num_Input = new Scanner(System.in) ;
		System.out.println("What is your name?") ;
		String Name = String_Input.nextLine() ;
		System.out.println("The name you entered is: " + Name) ;
		int Name_Length = Name.length() ;
		System.out.println("Your name is " + Name_Length + " characters long.") ;
		System.out.println("How many characters do you want to print out?") ;
		int Print_Characters = Num_Input.nextInt() ;
		System.out.println("Printing " + Print_Characters + " characters.") ;
		System.out.println(Name.substring(0, Print_Characters)) ;
		String_Input.close() ;
		Num_Input.close() ; 
		
	}

}