// Joshua Ciffer 7/4/2017

public class Trail {

	public int x ;
	public int y ;
	public String s ;

	public Trail(String str) {
		x = 10 ;
		y = 10 ;
		s = str ;
	}
	
	public String met() {
		return Integer.toString(x * y) ;
	}
	
}
