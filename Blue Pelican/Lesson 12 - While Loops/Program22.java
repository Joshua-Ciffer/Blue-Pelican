// Joshua Ciffer 6/8/2017

import java.util.Scanner ;

public class Program22 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		double low, high, swap1, swap2, i = 0 ;
		numInput = new Scanner(System.in) ;
		System.out.print("Enter a number: ") ;
		low = numInput.nextDouble() ;
		System.out.print("Enter another number: ") ;
		high = numInput.nextDouble() ;
		if (low > high) {
			swap1 = low ;
			swap2 = high ;
			low = swap2 ;
			high = swap1 ;
		}
		i = low ;
		System.out.println("Printing numbers between " + low + " and " + high + " that are divisable by 4, but not by 5.") ;
		while (i <= high) {
			if ((i % 4) == 0) {
				if ((i % 5) != 0 ){
					System.out.println(i) ;
				}
			}
			i++ ;
		}
		numInput.close() ;

	}

}
