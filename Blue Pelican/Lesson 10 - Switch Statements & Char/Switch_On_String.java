// Joshua Ciffer 4/24/2017

public class Switch_On_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello" ;
		
		switch(s) {
			case "Good Bye":
				System.out.println("You said Good Bye.") ;
				break ;
			case "Hello":
				System.out.println("You said Hello.") ;
				break ;
			case "Auf wiedersehen":
				System.out.println("You spoke German.") ;
				break ;
			default:
				System.out.println("What did you say?") ;
		}
		
		
	}

}
