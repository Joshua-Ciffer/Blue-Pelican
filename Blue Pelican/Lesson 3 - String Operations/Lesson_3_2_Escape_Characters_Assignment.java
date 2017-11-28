// Joshua Ciffer 2/15/2017 //

public class Lesson_3_2_Escape_Characters_Assignment {

	public static void main(String[] args) {

		// #1
		System.out.println("a\\b\\c\\\"d\"") ;
		// #2
		System.out.println("\\t is a tab, \\n is a new line, \\\" prints a \"quote\"") ;
		// #3
		System.out.println("\"line one\"\n\\line\ttwo\\") ;
		// #4
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\") ;
		// #5
		System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\\\n\\\"\"\"\"\\") ;
		// #6
		String word = "Birthday" ;
		System.out.println(word.toUpperCase()) ;
		// #7
		word = "it's my party" ;
		System.out.println(word.substring(0,5) + word.substring(9,10) + " \"" + word.substring(8).toUpperCase() + "\"") ;
		// #8
		word = "\"whose a whats it\"" ;
		System.out.print(word.substring(1,6).toUpperCase() + "\n" + word.substring(15,16)) ;
		System.out.println(word.substring(4, 5) + " " + word.substring(9, 13).toUpperCase()) ;
		// #9
		word = "Every Way The Wind Blows" ;
		System.out.print(word.substring(0, 5).toLowerCase() + word.substring(5, 9).toUpperCase()) ;
		System.out.print(" " +  word.substring(10, 14).toLowerCase() + "\\" + word.substring(14, 18).toUpperCase() + "\\") ;
		System.out.println(word.substring(18, 24).toLowerCase() + " " + word.substring(0, 4).length()) ;
		// #10
		word = "Peter Piper Picked A Peck Of Pickled Peppers" ;
		System.out.print(word.substring(19,20) + word.substring(20, 37).toLowerCase() + "\t" + word.substring(36, 44).toLowerCase()) ;
		System.out.println(" " + word.substring(0, 11) + "\t" + word.substring(12, 19).toLowerCase()) ;
		// #11
		word = "word has 4 letters" ;
		System.out.print("\"" + word.substring(0,4).length() + "\"" + word.substring(10, 18) + word.substring(4, 8) + " \"" + word.substring(0, 9).length()) ;
		System.out.println("\"" + word.substring(10, 18));
		// #12
		word = "if SUBSTRING is used" ;
		System.out.println(word.substring(3, 13).toLowerCase() + word.substring(13, 16) + word.substring(0, 9).length()) ;
		word = "Jim, Jacky, Johnny, Jill" ;
		System.out.print(word.substring(0, 3).toLowerCase() + "\\" + word.substring(0, 3).length() + "\n") ;
		System.out.print(word.substring(5, 10).toUpperCase() + "\\" + word.substring(0, 5).length() + "\n") ;
		System.out.print(word.substring(12, 18).toLowerCase() + "\\" + word.substring(0, 6).length() + "\n") ;
		System.out.println(word.substring(20, 24).toUpperCase() + "\\" + word.substring(0, 4).length()) ;
			
		
	}

}