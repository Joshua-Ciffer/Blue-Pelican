// Joshua Ciffer 10/2/2017 ;

package crypto ;

public class Crypto {
	
	public Crypto() {}
	
	public String encrypt(String str) {
		if (str.contains("V") || str.contains("v")) {
			str = str.replace("V", "ag\',r") ;
			str = str.replace("v", "ag\',r") ;
		} 
		if (str.contains("M") || str.contains("m")) {
			str = str.replace("M", "ssad") ;
			str = str.replace("m", "ssad") ;
		} 
		if (str.contains("G") || str.contains("g")) {
			str = str.replace("G", "jeb..w") ;
			str = str.replace("g", "jeb..w") ;
		} 
		if (str.contains("B") || str.contains("b")) {
			str = str.replace("B", "dug>?/") ;
			str = str.replace("b", "dug>?/") ;
		}
		return str ;
	}
	
	public String decrypt(String str) {
		if (str.contains("ag\',r")) {
			str = str.replace("ag\',r", "v") ;
		} 
		if (str.contains("ssad")) {
			str = str.replace("ssad", "m") ;
		} 
		if (str.contains("jeb..w")) {
			str = str.replace("jeb..w", "g") ;
		} 
		if (str.contains("dug>?/")) {
			str = str.replace("dug>?/", "b") ;
		}
		return str ;
	}
	
}