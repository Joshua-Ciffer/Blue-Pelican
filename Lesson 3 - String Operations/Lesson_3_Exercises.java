// Joshua Ciffer 2/6/2016 //

public class Lesson_3_Exercises {

	public static void main(String[] args) {
		
		// Problem #1
		String s = "The number of rabbits is " ;
		int argh = 129 ;
		String report = s + argh ;
		System.out.println("Problem #1: " + report + ".") ;
		// Problem #2
		String p = "Groovy Dude" ;
		String p_case = p.toUpperCase() ;
		System.out.println("Problem #2: " + p_case) ;
		// Problem #3
		String g = "Computer Science is for nerds" ;
		String g_lower = g.toLowerCase() ;
		System.out.println("Problem #3: " + g_lower) ;
		// Problem #4
		String m = "The Gettysburg Address" ;
		String c = m.substring(4) ;
		System.out.println("Problem #4: " + c) ;
		// Problem #5
		String b = "Four score and seven years agp," ;
		String c_2 = b.substring(7, 12) ;
		System.out.println("Problem #5: " + c_2) ;
		// Problem #6
		String s_2 = "Surface tension" ;
		int count = s_2.length();
		System.out.println("Problem #6: " + count) ;
		// Problem #7
		String m2 = "Look here!" ;
		int m2_length = m2.length();
		System.out.println("Problem #7: " + m2 + " has " + m2_length + " characters.") ;
		// Problem #8
		System.out.println("Problem #8: All \"good\" men should come to the aid of their country.") ;
		// Problem #9
		System.out.println("Problem #9: Hello \nHello again") ;
		// Problem #10
		System.out.println("Problem #10: A backslash looks like this \\, ...right?") ;
		// Problem #11
		String pq = "Eddie Haskel" ;
		int hm = pq.length() ;
		String ed = pq.substring(hm-4) ;
		System.out.println("Problem #11: " + ed) ;
		// Problem #12
		String character = "Herman Munster" ;
		String character_5 = character.substring(4, 5) ;
		System.out.println("Problem #12: " + character_5 ) ;
		
	}

}