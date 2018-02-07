// Joshua Ciffer 7/3/2017 //

public class ASCIIExercises {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// #1
		System.out.println("#1: ASCII Code for \'A\': 65") ;
		
		// #2
		System.out.println("#2: ASCII Code for \'B\': 90") ;
		
		// #3
		System.out.println("#3: ASCII Code for \'a\': 97") ;
		
		// #4
		System.out.println("#4: ASCII Code for \'z\': 122") ;
		
		// #5
		System.out.println("#5: How many letters are in the English alphabet: 26") ;
		
		// #6
		System.out.println("#6: ASCII Code for \'0\': 48") ;
		
		// #7
		System.out.println("#7: ASCII Code for \'9\': 57") ;
		
		// #8
		System.out.println("#8: ");
		char c ;
		for (int j = 97 ; j <= 122 ; j++) {
			c = (char)(j - 32) ;
			System.out.println(c) ;
		}
		
		// #9
		System.out.println("#9:") ;
		String s = "Alfred E. Neuman" ;
		char ch ;
		for (int x = 0 ; x < s.length(); x++) {
			ch = s.charAt(x) ;
			if ((ch <= 90) && (ch >= 65))
				ch = (char)(ch + 32) ;
			System.out.print(ch) ;
		}
		
		// #10
		System.out.println("\n#10: Wirte code that will convert char a into a String") ;
		char a = 'a' ;
		String A = "" + a ;
		
		// #11
		System.out.println("#11: Write code that will convert String p into a character.") ;
		String p = "p" ;
		char character = p.charAt(0) ;
		
		// #12
		// Is this legal?
		// char ch = 'V' ;
		// String sd = cd ;
		// No. ILLEGAL
		
		// #13
		// Is this legal?
		// char ch = 'V' ;
		// char x = (char)(ch + 56) ;
		// Yes. LEGAL.
		
		// #14
		// Is this legal?
		// char aa = "X" ;
		// No. ILLEGAL.
		
		// #15
		char k = 'B' ;
		System.out.println(k + 3) ;
		// What's printed?: 69
		
		// #16
		char k1 = 'B' ;
		System.out.println((char)(k1 + 3)) ;
		// What's printed?: E
		
		// #17
		char boy = 'a' ;
		char cv = Character.toUpperCase(boy) ;
		
		// #18
		char boy1 = 'a' ;
		char cv1 = Character.toLowerCase(boy1) ;
		
		// #19
		// char bv ;
		// How do you determine if it is a digit?
		// Character.isDigit(bv) ;
		
		// #20
		// char bv ;
		// How do you determine if it is a letter?
		// Character.isLetter(bv) ;
		
		// #21
		// char bv ;
		// How do you determine if it is uppercase?
		// Character.isUpperCase(bv) ;
		
		// #22
		// char bv ;
		// How do you determine if it is a letter or digit?
		// Character.isLetterOrDigit(bv) ;
		
		// #23
		// char bv ;
		// How do you determine if it is lowercase?
		// Character.isLowerCase(bv) ;
		
		// #24
		System.out.println("#24: ") ;
		for (int j = 0 ; j <= 127 ; j++) {
			char ch2 = (char)j ;
			if (Character.isWhitespace(ch2))
				System.out.println(j) ;
		}
		
	}

}