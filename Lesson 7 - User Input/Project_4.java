// Joshua Ciffer 3/31/2017 //

import java.util.Scanner ;

public class Project_4 {

	public static void main(String[] args) {

		Scanner inputScan ;
		inputScan = new Scanner(System.in) ;
		int teams, players ;
		double weight ;
		System.out.println("How many teams are in your league?") ;
		teams = inputScan.nextInt();
		System.out.println("How many players are on each team?") ;
		players = inputScan.nextInt();
		System.out.println("How much does the average player weigh?") ;
		weight = inputScan.nextDouble() ;
		System.out.println("Your league has " + teams + " teams.") ;
		System.out.println("With " + players + " players on each team.") ;
		System.out.println("Each player has an average player of " + weight + " lbs") ;
		System.out.println("The league has a combined weight of " + (weight * teams * players) + " lbs") ;
		inputScan.close();
		
	}

}