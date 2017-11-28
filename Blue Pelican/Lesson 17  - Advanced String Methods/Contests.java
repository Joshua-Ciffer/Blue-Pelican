// Joshua Ciffer 9/25/2017 //

public class Contests {

	public static void main(String[] args) {
		System.out.println("#1:" + Tester1.doStuff("I would if I could")) ;
		System.out.println("#2:" + Tester1.doStuff("fee fi fo fum")) ;
		System.out.println("#3:" + Tester2.convert("Abe Lincoln")) ;
		System.out.println("#4:" + Tester2.convert("BR549")) ;
		System.out.println("#5:" + Tester3.bailOnM("mumify")) ;
		System.out.println("#6:" + Tester4.met()) ;
		System.out.println("#7:") ;
		Tester5.printStuff("A1 USDA prime.") ;
		System.out.println("\n#8:" + Tester6.elim("ABC1234DEF")) ;
		System.out.println("#9:" + "Alf Abrams".indexOf('A')) ;
		System.out.println("#10:" + "Alf Abrams".lastIndexOf('A')) ;
		System.out.println("#11:") ;
		Tester7.doStuff("3872345619") ;
	}
	
	static class Tester1 {
		public static int doStuff(String myString) {
			int cc = 0 ;
			int p = myString.length() / 2 ;
			for (int k = 0 ; k < myString.length() / 2 ; k++, p++)
				if (myString.charAt(k) == myString.charAt(p))
					cc++ ;
			return cc ;
		}
	}
	
	static class Tester2 {
		public static String convert(String myString) {
			String tot = "" ;
			for (int j = 0 ; j < myString.length() ; j++) {
				char ch = Character.toUpperCase(myString.charAt(j)) ;
				tot = tot + ch ;
			}
			return tot ;
		}
	}
	
	static class Tester3 {
		public static int bailOnM(String myString) {
			int indx = 0 ;
			do {
				indx++ ;
			} while (myString.charAt(indx) != 'm') ;
			return indx ;
		}
	}
	
	static class Tester4 {
		public static char met() {
			return "Nertz to you".charAt(4) ;
		}
	}
	
	static class Tester5 {
		public static void printStuff(String theString) {
			for (int j = 0 ; j < theString.length(); j++) {
				char chr = theString.charAt(j) ;
				if (Character.isLetter(chr))
					System.out.print(chr) ; 
			}
		}
	}
	
	static class Tester6 {
		public static double elim(String theString) {
			int sum = 0 ;
			for (int j = 0 ; j < theString.length(); j++) {
				if (theString.charAt(j) > '1' && theString.charAt(j) < '8')
					sum = sum + theString.charAt(j) * 2 ;
			}
			return sum ;
		}
	}
	
	static class Tester7 {
		public static void doStuff(String aString) {
			int p = 1 ;
			int j = aString.indexOf("23") + p ;
			String s ;
			System.out.print(j) ;
			if (j >= 0)
				s = aString.substring(j, j + 4) ;
			else
				s = "No can do" ;
			System.out.println(s + ">>>" + j%3) ;
		}
	}
	
}