
/**
 * 
 * @author Joshua Ciffert
 * @version 12/12/2017
 */
public class Matrix10by10 {

	public static void main(String[] args) {
		int[][] matrix = new int[10][10] ;
		int counter = 0 ;
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j < matrix[i].length ; j++) {
				matrix[i][j] = counter ;
				counter++ ;
			}
		}
		for (int i = 0 ; i < matrix.length ; i++) {
			for (int j = 0 ; j < matrix.length ; j++) {
				System.out.print(matrix[i][j] + "\t") ;
			}
			System.out.print("\n") ;
		}
	}
	
}