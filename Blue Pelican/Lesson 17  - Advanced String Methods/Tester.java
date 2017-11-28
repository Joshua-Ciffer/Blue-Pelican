

public class Tester {

	public static int doStuff(String myString) {
		int cc = 0 ;
		int p = myString.length()/2 ;
		for (int k = 0; k <myString.length()/2; k++, p++) 
			if (myString.charAt(k) == myString.charAt(p))
				cc++ ;
		return cc ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(doStuff("fee fi fo fum")) ;
		
	}

}
