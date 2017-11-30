// Joshua Ciffer 10/25/2017 //

public class ForEach {
	
	public static void main(String[] args) {

		double d[] = {100, -25, 16, 27, -102} ;
		double product = 1 ;
		for (double j : d) {
			product *= j ;
		}
		System.out.println(product) ;
		
	}

}