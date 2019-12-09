package org.manjunath.numbers;

public class PowerOfTwo {

	/**
	 * Method powerOfTwo() evaluates whether given number is power of 2 or not.
	 * 
	 * @param n
	 *            Number to determine whether it is power of 2.
	 * @return
	 */
	public boolean powerOfTwo(int n) {

		if (n == 0)
			return false;

		// divide the given number by 2 and check for the remainder till it get
		// break down to 1
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}

		return true;
	}

	/**
	 * Method isPowerTwo() evaluates whether given number is power of 2 or not.
	 * 
	 * @param n
	 *            Number to determine whether it is power of 2.
	 * @return
	 */
	public boolean isPowerTwo(int n) {
		// Bitwise operation of & generates zero for integers which are power of
		// 2 and one number less than power of 2
		// i.e (2 & (2-1)) generates zero.
		// (16 & (16-1)) generates zero
		// (1024 & (1024-1)) generates zero
		return (n > 0 && n != 0 && ((n & (n - 1)) == 0));
	}
}
