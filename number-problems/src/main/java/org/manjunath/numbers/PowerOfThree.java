package org.manjunath.numbers;

public class PowerOfThree {

	// Method 1: Divide and checking the remainder
	/**
	 * Method isPowerOfThree() is used to find the whether the given number is
	 * power of 3 or not. The below code works in time complexity of log-n
	 * 
	 * @param num
	 *            Input number
	 * @return boolean value, whether the number is power of 3 or not
	 */
	public boolean isPowerOfThree(int num) {
		// check whether the number is less than 1 or not, if less than one just
		// return false
		if (num < 1)
			return false;

		// divide and check whether the remainder is zero or not. If remainder
		// is zero continue on dividing the number
		while (num % 3 == 0) {
			num /= 3;
		}

		return num == 1;
	}

	/**
	 * Method powerOfThree() is used to find the whether the given number is
	 * power of 3 or not. The below code works in time complexity of o(1)
	 * 
	 * @param num
	 *            Input number
	 * @return boolean value, whether the number is power of 3 or not
	 */
	public boolean powerOfThree(int num) {
		// consider the number which is highest power of 3 (3^19) in int range
		int maxPower = 1162261467;

		// return whether the given number completely divides maxpower number
		return (num > 0) && (maxPower % num == 0);
	}
}
