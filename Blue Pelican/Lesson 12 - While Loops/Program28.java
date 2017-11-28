// Joshua Ciffer 6/9/2017

import java.util.Scanner ;

public class Program28 {

	public static void main(String[] args) {
		
		Scanner numInput ;
		int lines, i = 0 ;
		numInput = new Scanner(System.in) ;
		System.out.print("How many lines of asterisks do you want to print?: ") ;
		lines = numInput.nextInt() ;
		do {
			for (int x = 0 ; x < i ; x++) {
				System.out.print(" ");
			}
			System.out.println("*") ;
			i++ ;
		} while (i < lines) ;
		numInput.close() ;
	}

}
