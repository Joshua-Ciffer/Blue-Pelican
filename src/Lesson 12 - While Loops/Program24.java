// Joshua Ciffer 6/8/2017 //

import java.util.Scanner ;

public class Program24 {

	public static void main(String[] args) {
		
		// Program always sets low value to 0
		// High value sets correctly
		Scanner numInput ;
		int values, i = 0 ;
		double low = Double.POSITIVE_INFINITY, high = 0, oldNum = 0, newNum = 0 ;
		numInput = new Scanner(System.in) ;
		System.out.print("How many numbers do you want to enter: ") ;
		values = numInput.nextInt() ;
		while (i < values) {
			oldNum = newNum ;
			System.out.print("Enter a value: ") ;
			newNum = numInput.nextDouble() ;
			low = Math.min(low, Math.min(oldNum, newNum)) ;
			high = Math.max(high, Math.max(oldNum, newNum)) ;
			i++ ;
		}
		System.out.println("The highest number you entered is " + high + ". ") ;
		System.out.println("The lowest number you entered is " + low + ".") ;
		numInput.close() ;
		
	}

}