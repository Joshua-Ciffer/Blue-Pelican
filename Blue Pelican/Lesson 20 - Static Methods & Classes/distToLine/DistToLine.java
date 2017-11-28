// Joshua Ciffer 11/13/2017 //
/*
 * 
 */

package distToLine ;
import static java.lang.Math.* ;

public class DistToLine {

	public static double A, B, C ;
	
	public static double GET_DISTANCE(double a, double b) { 
		return abs((A * a) + (B * b) + C) / sqrt(pow(A, 2) + pow(B, 2)) ;
	}
	
}