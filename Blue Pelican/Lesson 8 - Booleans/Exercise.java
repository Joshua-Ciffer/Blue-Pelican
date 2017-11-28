// Joshua Ciffer 4/3/2017 //

public class Exercise {

	public static void main(String[] args) {

		int z = 23, x = -109 ;
		double c = 2_345.19, v = 157.03 ;
		boolean a = false, s = true ;
		// #1
		boolean gus = (x>0)&&(c==v) ;
		System.out.println("#1: " + gus) ;
		// #2
		System.out.println("#2: " + (a || s)) ;
		// #3
		System.out.println("#3: " + (((-1 * x)> 0)&&!a));
		// #4
		boolean r = z==x ;
		System.out.println("#4: " + (r || false)) ;
		// #5
		System.out.println("#5: " + (z!=x)) ;
		
	}

}