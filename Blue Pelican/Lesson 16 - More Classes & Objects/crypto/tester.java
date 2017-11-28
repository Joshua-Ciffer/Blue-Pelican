// Joshua Ciffer 10/2/2017 //

package crypto ;
import java.util.Scanner ;

public class tester {

	public static void main(String[] args) {

		Crypto myCryptObj = new Crypto() ;
		Scanner userInput ;
		String sntnc, encryptdSntnc, decryptdSntnc ;
		userInput = new Scanner(System.in) ;
		System.out.print("Enter a sentence to be encrypted: ") ;
		sntnc = userInput.nextLine() ;
		System.out.println("Original sentence: " + sntnc) ;
		encryptdSntnc = myCryptObj.encrypt(sntnc) ;
		System.out.println("Encrypted sentence: " + encryptdSntnc) ;
		decryptdSntnc = myCryptObj.decrypt(encryptdSntnc) ;
		System.out.println("Decrypted sentence: " + decryptdSntnc) ;
		userInput.close() ; 
		
	}

}
