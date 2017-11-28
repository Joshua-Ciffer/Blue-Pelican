// Joshua Ciffer 9/25/2017 //

public class Exercises {

	public static void main(String[] args) {
		
		String s = "Lucky hockey puck" ;
		String m = "uck" ;
		int j = 6, z = 99 ;
		// #1
		int k = s.indexOf(m) ;
		System.out.println("#1:" + k) ;
		// #2
		k = s.indexOf("uck", j) ;
		System.out.println("#2:" + k) ;
		// #3
		k = s.indexOf('c') ;
		System.out.println("#3:" + k) ;
		// #4
		String str = s.replace('o', 'p') ;
		System.out.println("#4:" + str) ;
		// #5
		k = s.lastIndexOf(m, j + 3) ;
		System.out.println("#5:" + k) ;
		// #6
		char p = s.charAt(7) ;
		System.out.println("#6:" + p) ;
		// #7
		k = s.indexOf(z) ;
		System.out.println("#7:" + k) ;
		// #8
		k = s.lastIndexOf(m) ;
		System.out.println("#8:" + k) ;
		// #9
		k = s.indexOf('y', j) ;
		System.out.println("#9:" + k) ;
		// #10
		p = s.charAt(z - 90) ;
		System.out.println("#10:" + p) ;
		// #11
		k = s.indexOf(m, 15) ;
		System.out.println("#11:" + k) ;
		// #12
		k = s.indexOf(z + 2, 4) ;
		System.out.println("#12:" + k) ;
		// #13
		k = s.lastIndexOf('h') ;
		System.out.println("#13:" + k) ;
		// #14
		k = s.lastIndexOf(121) ;
		System.out.println("#14:" + k) ;
		// #15
		str = s.replace('y', 'A') ;
		System.out.println("#15:" + str) ;
		
		String xyz = "bathtub" ;
		String ddd = "BathTUB" ;
		String ccc = xyz ;
		String wc = "Whooping crane" ;
		s = "	\t\tGu daay, mates   \n" ;
		// #16
		j = xyz.compareTo(wc) ;
		boolean bb ;
		if (j > 0)
			bb = true ;
		else 
			bb = false ;
		System.out.println("#16:" + bb) ;
		// #17
		String v = ddd.toLowerCase() ;
		int fg = ccc.compareTo(v) ;
		System.out.println("#17:" + (fg + 1)) ;
		// #18
		System.out.println("#18:" + ddd.compareTo(ccc)) ;
		// #19
		System.out.println("#19:" + xyz.compareTo(ccc)) ;
		// #20
		System.out.println("#20:" + "Stupid".compareTo(ddd)) ;
		// #21
		System.out.println("#21:" + ">>>" + s.trim() + "<<<") ;
	}
	
}