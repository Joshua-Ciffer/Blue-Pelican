// Joshua Ciffer 3/31/2017

import java.util.Scanner ;

public class Do_Now {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Name_Input = new Scanner(System.in) ;
		Scanner Age_Input = new Scanner(System.in) ;
		System.out.print("Enter your age: ") ;
		int Age = Age_Input.nextInt() ;
		System.out.println(Age);
		System.out.print("Enter your name: ") ;
		String Name = Name_Input.nextLine();
		System.out.println(Name + " is " + Age + " years old.") ;
		Age_Input.close() ;
		Name_Input.close() ;
		
	}

}
