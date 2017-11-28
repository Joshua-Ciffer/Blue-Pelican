// Joshua Ciffer 4/3/2017 //

import java.util.Scanner ;

public class Test {

	public static void main(String[] args) {

		Scanner String_Input = new Scanner(System.in) ;
		Scanner Num_Input = new Scanner(System.in) ;
		System.out.println("What is your grade?") ;
		int Grade = String_Input.nextInt() ;
		
		if (Grade >= 70) {
				System.out.println("You passed") ;
		} else {
			System.out.println("You failed") ;
		}
			
		System.out.println("") ;
		
		String_Input.close() ;
		Num_Input.close() ;
		
	}

}