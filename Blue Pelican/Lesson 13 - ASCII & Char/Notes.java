// Joshua Ciffer 7/3/2017 //

public class Notes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		// char ch = aString ; <--- Illegal
		// ^ Strings and characters cannot be stored into each other.
		int x = 1 ;
		char ch = 'A' ; // ASCII code of 65
		int y = x + ch ;
		System.out.println(y) ; //Prints 66 (ASCII code of B)
		int z = ch ; // Characters can be stored into integers. It stores the ASCII code for the character into the int.
		
		// Storing an integer into a character is illegal unless you cast with (char)
		// char ch = int j ; <--- illegal
		int j = 67 ;
		ch = (char)j ;
		
		// Conversion of a string to a character
		String s = "w" ;
		char w = s.charAt(0) ;
		
		// Conversion of a character to a string
		char t = 't' ;
		String let = "" + t ;
		
		// Character methods
		// Character.isDigit(char) ;
		// Character.isLetter(char) ;
		// Character.isLetterOrDigit(char) ;
		// Character.isWhitespace(char) ;
		// Character.isLowerCase(char) ;
		// Character.isUpperCase(char) ;
		// Character.toUpperCase(char) ;
		// Character.toLowerCase(char) ;
		
	}

}