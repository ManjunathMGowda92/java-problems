package org.manjunath.arrays;

/**
 * class <i> Dynamic2DArray </i> is used to create a 2-Dimensional array. Where
 * the array columns ranges as the power of 2
 * 
 * @author Manjunath HM
 *
 */
public class Dynamic2DArray {

	/**
	 * Method createDynamicArray() creates an dynamic array. Where numbers of
	 * rows will be an input from the user and columns will be dynamically
	 * generated.
	 * 
	 * @param rowCount
	 *            Number of rows in the array
	 * @return Dynamically generated array
	 */
	public int[][] createDynamicArray(int rowCount) {
		int[][] arr = new int[rowCount][];

		// each column will be in power(2) range
		for (int i = 0; i < rowCount; i++) {
			arr[i] = new int[(int) Math.pow(2, i)];
		}

		return arr;
	}

	/**
	 * Method fillValues() is used to fill the values for input array. The
	 * values will be dynamically generated.
	 * 
	 * @param arr
	 *            Input array for filling
	 */
	public void fillValues(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	/**
	 * Method printArray() prints the values in matrix to the console.
	 * 
	 * @param arr
	 */
	public void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Method execute() from Dynamic2DArray class do the following things.
	 * <ol>
	 * <li>Create the dynamic array using rowCount.</li>
	 * <li>Fill the values into the dynamic array</li>
	 * <li>Print the array to the console</li>
	 * <li>Return the array</li>
	 * </ol>
	 * 
	 * @param rowCount
	 *            Number of rows to be in Dynamically genearted array.
	 * @return Dynamically generated array
	 */
	public int[][] execute(int rowCount) {
		int[][] arr = createDynamicArray(rowCount);
		fillValues(arr);
		printArray(arr);

		return arr;
	}
}
