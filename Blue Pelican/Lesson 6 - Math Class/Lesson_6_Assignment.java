// Joshua ciffer 3/27/2017
public class Lesson_6_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #1
		double x = 9 ;
		double y = Math.sqrt(x) ;
		System.out.println("#1: " + (int)y) ;
		// #2
		int j = 5 ;
		int m = 2 ;
		double k = (j * Math.abs(m)) ;
		System.out.println("#2: " + (int)k) ;
		// #3
		//int k = Math.abs(-127.5) ; //ILLEGAL
		//Change int to double
		System.out.println("#3: " + "double k = Math.abs(-127.5)") ;
		// #4
		System.out.println("#4: " + Math.pow(2,  1.5)) ;
		// #5
		System.out.println("#5: " + Math.ceil(-157.2)) ;
		// #6
		System.out.println("#6: " + Math.floor(-157.2)) ;
		// #7
		System.out.println("#7: " + Math.ceil(157.2)) ;
		// #8
		System.out.println("#8: " + Math.floor(157.2)) ;
		// #9
		System.out.println("#9: " + Math.round(-157.2)) ;
		// #10
		System.out.println("#10: " + Math.ceil(-157.7)) ;
		// #11
		System.out.println("#11: " + Math.ceil(157)) ;
		// #12
		System.out.println("#12: " + Math.ceil(157.7)) ;
		// #13
		System.out.println("#13: " + Math.log(18)) ;
		// #14
		int p = 4 ;
		double b = (p * Math.PI) ;
		System.out.println("#14: " + b) ;
		
	}

}
