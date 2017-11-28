// Joshua Ciffer 2/21/2017 //

public class Lesson_Four_Assignment {

	public static void main(String[] args) {

		// Problem #1
		int h = 103 ;
		int p = 5 ;
		System.out.print("Problem #1: " );
		System.out.println(++h + p) ;
		System.out.println(h) ;
		// Problem #2
		int j = 5 ;
		System.out.print("Problem #2 : ") ;
		System.out.println(++j) ;
		System.out.println(j++) ;
		System.out.println(j += 1) ;
		// Problem #3
		double def ;
		double f = 1_992.37 ;
		def = f ;
		System.out.println("Problem #3 " + def) ;
		// Problem #4
		int zulu = 7 ;
		System.out.println(zulu--) ;
		// Problem #5
		int a = 100 ;
		int b = 200 ;
		b /= a ;
		System.out.print("Problem #5: ") ;
		System.out.println(b+1) ;
		//Problem #6
		int v = 40 ;
		p = 25 ;
		v -= p - 30 ;
		System.out.println("Problem #6: " + v) ;
		// Problem #7
		v = v - (p - 30) ;
		System.out.println("Problem #7: " + v) ;
		// Problem #8
		p = 40 ;
		int q = 4 ;
		System.out.print("Problem #8: ") ;
		System.out.println(2 + 8 * q / 2 - p) ;
		// Problem #9
		int sd = 12 ;
		int x = 4 ;
		System.out.print("Problem #9: ") ;
		System.out.println(sd%(++x)) ;
		System.out.println(x) ;
		// Problem #10
		int g ; 
		g = 3 ; //Problem said 3 = g ; That would be an error!
		System.out.print("Problem #10: ") ;
		System.out.println(++g * 79) ;
		// Problem #11
		double m = 3.14, b1 = 3.14, f1 = 3.14 ;
		System.out.print("Problem #11: ") ;
		System.out.println(m + b1 + f1) ;
		// Problem #12
		//int x1, y, z ;
		// Problem #13
		int m1 = 36 ;
		int j1 = 5 ;
		m1 = m1 / j1 ;
		System.out.println("Problem #13: " + m1) ;
		// Problem #14 **********
		System.out.print("Problem #14: ") ;
		System.out.println(3/4 + 5*2/33 - 3 + 8/3) ;
		// Problem #15
		System.out.println("Problem #15: The assignemnt operator is the \"=\"") ;
		// Problem #16
		j = 7 ;
		int i = 5 ;
		int k ;
		k = i%j ;
		System.out.println("Problem #16: " + k) ;
		// Problem #17
		j = 2 ;
		System.out.print("Problem #17: ") ;
		System.out.println(7%3 + j++ + (j-2)) ;
		// Problem #18
		System.out.print("Problem #18: ") ;
		System.out.println(j--) ;
		System.out.println(--j) ;
		System.out.println(j -= 1) ;
		
	}

}