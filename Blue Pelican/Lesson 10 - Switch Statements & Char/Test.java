// Joshua Ciffer 5/4/2017 //

import java.util.Scanner ;

public class Test {

	public static void main(String[] args) {

		Scanner Num_Input;
		int iSwitch;
		System.out.print("Enter a number: ") ;
		Num_Input = new Scanner(System.in) ;
		iSwitch = Num_Input.nextInt() ; 
		switch (iSwitch) {
		case 0:
			System.out.println("ZERO") ;
			break ;
		case 1:
			System.out.println("ONE") ; 
			break ;
		case 2:
			System.out.println("TWO") ; 
			break ;
		case 3:
			System.out.println("THREE") ;
			break ;
		case 4: 
			System.out.println("FOUR") ;
			break ;
		case 5:
			System.out.println("FIVE") ;
			break ;
		case 6:
			System.out.println("SIX") ;
			break ;
		case 7:
			System.out.println("SEVEN") ;
			break ;
		case 8:
			System.out.println("EIGHT") ;
			break ;
		case 9:
			System.out.println("NINE") ;
			break ;
		case 10:
			System.out.println("TEN") ;
			break ;
		default:
			System.out.println("Not in the list") ;
			break ; 
		}
		Num_Input.close() ;
		
	}
	
}