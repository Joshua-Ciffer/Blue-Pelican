
/**
 * 
 * @author Joshua Ciffer
 * @version 01/22/2018
 */
public abstract class FunArray {

	static int[][] intArr = {{4, 6, 2, 1, 8}, {3, 8, 1, 0, 3}, {8, 3, 7, 4, 1}, {8, 3, 4, 1, 7}};

	static double[][] doubleArr = new double[4][5];

	public static void main(String[] args) {

	}

	static void mirrorArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			if (i >= (x.length / 2)) {
				x[i] = x[(x.length - 1) - i];
			}
		}
	}

	static int[] noZeros(int[] x) {
		int numZeros = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0) {
				numZeros++;
			}
		}
		int[] newArr = new int[x.length - numZeros];
		int arrPosition = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != 0) {
				newArr[arrPosition] = x[i];
				arrPosition++;
			}
		}
		return newArr;
	}

	static void printAll(double[][] x) {
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + "\t");
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
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] == y[i][j]) {
					x[i][j] = x[i][j] * y[i][j];
				}
			}
		}
		return x;
	}

	static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

}