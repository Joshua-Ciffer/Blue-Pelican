// Joshua Ciffer 3/27/2017 //

public class Mathematics {

	public static void main(String[] args) {

		//int number = Math.abs(-5) ;
		System.out.println() ;
		
		System.out.println(Math.abs(-3)) ;
		
		double one = 9 ;
		double two = 25 ;
		System.out.println(5.8 + Math.min(one, two)) ;
		double three = Math.max(one, two) ;
		three = Math.sqrt(three) ;
		System.out.println(three) ;
		
		System.out.println(Math.PI) ;
		System.out.println(Math.E) ;
		
		int w = 2 ;
		int x = 5 ;
		int y = 10 ;
		//double z = 80.9 ;
		
		Math.pow(y, x) ;
		System.out.println(Math.pow(x, Math.min(y, w))) ;
		double a = Math.max(x, y) ;
		double b = Math.max(a, w) ;
		System.out.println((int)b) ;
		
	}
	
}