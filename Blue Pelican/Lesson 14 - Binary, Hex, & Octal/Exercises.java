// Joshua Ciffer 7/3/2017 //

public class Exercises {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// #1
		System.out.println("#1: " + Integer.parseInt("3C4F", 16)) ;
		
		// #2
		System.out.println("#2: " + Integer.parseInt("100011", 2)) ;
		
		// #3
		System.out.println("#3: " + Integer.parseInt("637", 8)) ;
		
		// #4
		// Is the following code legal?
		// int v = 04923 ;
		// No, there is no number 9 in the octal number system.
		
		// #5
		// Is the following code legal?
		int w = 0xAAFF ;
		// Yes. Perfectly legal.
		
		// #6
		System.out.println("#6: " + Integer.parseInt("9A4E", 16)) ;
		
		// #7
		System.out.println("#7: " + Integer.parseInt("1011011", 2)) ;
		
		// #8
		System.out.println("#8: " + Integer.parseInt("6437", 8)) ;
		
		// #9
		int a = 0x5C3B ;
		
		// #10
		int k = 03365 ;
		
		// #11
		System.out.println("#11: " + Integer.toString(478, 2)) ;
		
		// #12
		System.out.println("#12: " + Integer.toString(5678, 16).toUpperCase()) ;
		
		// #13
		System.out.println("#13: " + Integer.toString(5678, 8)) ;
		
		// #14
		System.out.println("#14: " + Integer.toHexString(0x2C6 * 0x3F).toUpperCase()) ;
		
		// #15
		System.out.println("#15: " + Integer.toOctalString(03456 + 745).toUpperCase()) ;
		
		// #16
		// A(hex) to (dec): 10
		
		// #17
		// 8(hex) to (dec): 8
		
		// #18
		// Base of the hex system: 16
		
		// #19
		// 16(dec) to (hex): 10
		
		// #20
		// Base of binary system: 2
		
		// #21
		System.out.println("#21: " + Integer.toBinaryString(0b1111000 + 0b1001110)) ;
		
		// #22
		System.out.println("#22: " + Integer.toBinaryString(0b1000001 + 0b1100001)) ;
		
		// #23
		// There are 10 types of people in the word. Those who understand binary and those who don't.
		// 10(bin) = 2(dec).
		
		// #24
		// String s has a number in base b. Write int i = string s number in base 10.
		// int i = Integer.parseInt(s, b) ;
		
		// #25
		// Convert 9322gf33 toString s in base 28.
		String s = Integer.toString(Integer.parseInt("9322gf33, 28")) ;
		
	}

}