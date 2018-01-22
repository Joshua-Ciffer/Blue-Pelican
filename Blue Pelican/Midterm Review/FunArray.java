import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Joshua Ciffer
 * @version 01/22/2018
 */
public abstract class FunArray {

	static Scanner userInput = new Scanner(System.in);
	
	static int[][] intArr = {{4, 6, 2, 1, 8}, {3, 8, 1, 0, 3}, {8, 3, 7, 4, 1}, {8, 3, 4, 1, 7}};

	static double[][] doubleArr = new double[4][5];

	public static void main(String[] args) {
//		System.out.println("Fill the array");
//		for (int i = 0; i < doubleArr.length; i++) {
//			for (int j = 0; j < doubleArr[i].length; j++) {
//				do {
//					System.out.print("Enter a double: ");
//					try {
//						doubleArr[i][j] = userInput.nextDouble();
//						break;
//					} catch (InputMismatchException e) {
//						System.out.println("\nEnter a double.\n");
//						userInput.next();
//						continue;
//					}
//				} while (true);
//			}
//		}
//		int[] x = {4, 0, 3, 6, 0};
//		int[] y = noZeros(x);
//		for (int i = 0; i < y.length; i++) {
//			System.out.println(y[i]);
//		}
	}
	
	static int[] noZeros(int[] x) {
		int newArrLength = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				newArrLength++;
			}
		}
		int[] noZeroArr = new int[newArrLength + 1];
		int xCounter = 0;
		for (int i = 0; i < newArrLength; i++) {
			for (int j = 0; j < x.length; j++) {
				if (x[j + xCounter] != 0) {
					noZeroArr[i] = x[j + xCounter];
					xCounter++;
					break;
				}
			}
		}
		return noZeroArr;
	}

	static void printAll(double[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	static int[] noHigh(int[] x, int y) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] > y) {
				x[i] = 0;
			}
		}
		return x;
	}

	static double[][] combineLikeTerms(double[][] x, double[][] y) {
		double[][] likeTermArr = new double[x.length][];
		for (int i = 0; i < likeTermArr.length; i++) {
			likeTermArr[i] = new double[x[i].length];
		}
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == y[i][j]) {
					likeTermArr[i][j] = x[i][j] * y[i][j];
				}
			}
		}
		return likeTermArr;
	}

}