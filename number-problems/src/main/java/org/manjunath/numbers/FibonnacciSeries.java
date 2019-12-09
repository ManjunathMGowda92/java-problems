package org.manjunath.numbers;

public class FibonnacciSeries {

	/**
	 * Method genearateFibNumber() generates the Fibonacci number in iterative
	 * manner.
	 * 
	 * @param num
	 *            Number to which fibonacci number
	 * @return
	 */
	public int genearateFibNumber(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;

		int fib1 = 0;
		int fib2 = 1;
		int fib = fib1 + fib2;
		for (int i = 2; i <= num; i++) {
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}

		return fib;
	}

	public void generateFibonacciSeries(int range) {
		for (int i = 0; i <= range; i++) {
			System.out.println(genearateFibNumber(i));
		}
	}

	public void generateFibSeriesWithRecursion(int range) {
		for (int i = 0; i <= range; i++) {
			System.out.println(generateFib(i));
		}
	}

	/**
	 * Method generateFib() generates the Fibonacci number in recursive manner.
	 * 
	 * @param num
	 * @return
	 */
	public int generateFib(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		else
			return generateFib(num - 1) + generateFib(num - 2);
	}
}
