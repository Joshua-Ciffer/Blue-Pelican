// Joshua Ciffer 7/4/2017

public class TableOfBases {

	public static void main(String[] args) {
		
		System.out.println("Decimal     Binary     Octal     Hex     Character") ;
		for (int i = 48 ; i <= 57 ; i++) {
			System.out.print("   " + i + "       ") ;
			System.out.print(Integer.toBinaryString(i) + "     ") ;
			System.out.print(Integer.toOctalString(i) + "      ") ;
			System.out.print(Integer.toHexString(i) + "          ") ;
			System.out.println(((char)i)) ;
		}
		for (int i = 65 ; i <=90 ; i++) {
			System.out.print("   " + i + "       ") ;
			System.out.print(Integer.toBinaryString(i) + "     ") ;
			System.out.print(Integer.toOctalString(i) + "      ") ;
			System.out.print(Integer.toHexString(i) + "          ") ;
			System.out.println(((char)i)) ;
		}
		for (int i = 97 ; i <= 122 ; i++) {
			System.out.print("   " + i + "       ") ;
			System.out.print(Integer.toBinaryString(i) + "     ") ;
			System.out.print(Integer.toOctalString(i) + "      ") ;
			System.out.print(Integer.toHexString(i) + "          ") ;
			System.out.println(((char)i)) ;
		}

	}

}
