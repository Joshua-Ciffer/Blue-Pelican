// Joshua Ciffer 4/25/2017 //

import java.util.Scanner ;

public class WeightProject {

	public static void main(String[] args) {

		Scanner Num_Input ;
		double Earth_Weight ;
		int Selection ;
		System.out.print("What is your weight on Earth: ") ;
		Num_Input = new Scanner(System.in) ;
		Earth_Weight = Num_Input.nextDouble() ;
		System.out.println("Choose one of the numbers to see what your weight would be on that planet.") ;
		System.out.println("1. Voltar") ;
		System.out.println("2. Krypton") ;
		System.out.println("3. Fertos") ;
		System.out.println("4. Servontos") ;
		System.out.print("Selection: ") ;
		Selection = Num_Input.nextInt() ;
		switch(Selection) {
			case 1:
				System.out.println("Your weight on Voltar would be " + (Earth_Weight * .071)) ;
				break ;
			case 2:
				System.out.println("Your weight on Krypton would be " + (Earth_Weight * .720)) ;
				break ;
			case 3:
				System.out.println("Your weight on Fertos would be " + (Earth_Weight * .865)) ;
				break ;
			case 4:
				System.out.println("Your weight on Servontos would be " + (Earth_Weight * 4.612)) ;
				break ;
			default:
				System.out.println("Error choose one of the options.") ;
				break ;
		}
		Num_Input.close() ;
		
	}

}