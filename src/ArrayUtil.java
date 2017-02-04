
public class ArrayUtil {

	/**
	 * Reverse elements of array arr Precondition: arr.length > 0.
	 * Postcondition: The elements of arr have been reversed
	 * 
	 * @param arr
	 *            the array to manipulate
	 */
	public static void reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversed[(arr.length-1)-i]=arr[i];
		}
		for (int i = 0; i < reversed.length; i++) {
			arr[i] = reversed[i];
		}
	}
}

class Matrix {
	private int[][] mat;

	public Matrix(int[][] m) {
		mat = m;
	}

	/**
	 * Revereses the elements in each row of mat. Postcondition: The elements in
	 * each row have been reversed
	 */
	public void reverseAllRows() {
		for (int j = 0; j < mat.length; j++) {
			int[] reversed = new int[mat[j].length];
			for (int i = 0; i < mat[j].length; i++) {
				reversed[(mat[j].length-1)-i]=mat[j][i];
			}
			for (int i = 0; i < reversed.length; i++) {
				mat[j][i] = reversed[i];
			}
		}
		
	}

	/**
	 * Reverses the elements of mat. Postcondition: - The final elements of mat,
	 * when read in row-major order, are the same as the original elements of
	 * mat when read from the bottom corner, right to left, going upward. -
	 * mat[0][0] contains what was originally the last element. - mat[mat.length
	 * - 1][mat[0].length -1] contains what was originally the first element.
	 */
	public void reverseMatrix() {
		for (int j = 0; j < mat.length; j++) {
			int[] reversed = new int[mat[j].length];
			for (int i = 0; i < mat[j].length; i++) {
				reversed[(mat[j].length-1)-i]=mat[j][i];
			}
			for (int i = 0; i < reversed.length; i++) {
				mat[j][i] = reversed[i];
			}
		}
		for (int i = 0; i < mat.length/2; i++) {
			int[] temp = mat[i];
			mat[i] = mat[mat.length-i-1];
			mat[mat.length-i-1] = temp;
		}
	}

	public int[][] getIntArray() {
		return mat;
	}
}
