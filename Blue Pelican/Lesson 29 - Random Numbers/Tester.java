// Joshua Ciffer 11/17/2017 //

import java.util.Random ;

public class Tester {

	public static void main(String[] args) {

		Random num = new Random() ;
		System.out.println(num.nextBoolean()) ;
		System.out.println(num.nextFloat()) ;
		System.out.println(num.nextGaussian()) ;
		System.out.println(num.nextInt()) ;
		System.out.println(num.nextInt(45)) ;
		System.out.println(num.nextLong()) ;
		
	}

}