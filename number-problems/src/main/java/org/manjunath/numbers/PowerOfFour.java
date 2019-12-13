package org.manjunath.numbers;

public class PowerOfFour {

	public boolean isPowerOfFour(int num) {
		if (num < 1)
			return false;

		while (num % 4 == 0) {
			num = num / 4;
		}

		return num == 1;
	}
	
	public boolean isPowerofFour(int num) {
		return num != 0 && ((num & (num -1))== 0) && (num & 0XAAAAAAAA)==0;
	}
}
