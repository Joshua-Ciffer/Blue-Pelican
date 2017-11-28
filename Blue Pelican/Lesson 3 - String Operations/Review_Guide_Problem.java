// Joshua Ciffer 2/26/2017 //

public class Review_Guide_Problem {

	public static void main(String[] args) {
		
		String word = "bikinibottom" ;
		String word_first_half = word.substring(0, word.length()/2) ;
		String word_second_half = word.substring(word.length()/2) ;
		System.out.println("Word = " + word) ;
		System.out.println("Output = " + word_second_half + word_first_half + word_second_half) ;

	}

}