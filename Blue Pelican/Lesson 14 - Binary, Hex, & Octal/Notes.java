// Joshua Ciffer 7/3/2017

public class Notes {

	public static void main(String[] args) {
		
		int hex = 0x4CB3 ; // Leading 0x indicates hex number
		System.out.println(hex) ; // Automatically prints in decimal
		
		int binary = 0b100110 ; // Leading 0b indicates binary number
		System.out.println(binary) ; // Automatically prints in decimal
		
		int octal = 0734 ; // Leading 0 indicates octal number
		System.out.println(octal) ; // Automatically prints in decimal
		
		System.out.println(Integer.toHexString(hex)) ; // Printing hex
		System.out.println(Integer.toBinaryString(binary)) ; // Printing binary
		System.out.println(Integer.toOctalString(octal)) ; // Printing octal
		
		// String s = Integer.toString(i, b) ; Converting number i in base 10 into a different base (b). 
		// Integer.parseInt("3w4br", 35) ; Converts a number string from its base to decimal.
		
	}

}
