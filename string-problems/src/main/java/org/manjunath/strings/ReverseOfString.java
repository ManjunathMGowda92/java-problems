package org.manjunath.strings;

public class ReverseOfString {

	public String reverseString(String str) {
		String temp = "";

		for (char c : str.toCharArray()) {
			temp = c + temp;
		}
		return str;
	}
	
	public String reverseTheString(String str) {
		if (str == null || str.length() == 0)
			return str;
		
		return reverseTheString(str.substring(1))+ str.charAt(0);
	}
	
	public String reverseUsingStrBuilder(String str) {
		StringBuilder strBuilder = new StringBuilder(str);
		
		int start = 0;
		int end = str.length() -1 ;
		for (int i = 0; i < strBuilder.length()/2; i++) {
			char c = strBuilder.charAt(start);
			strBuilder.setCharAt(start, strBuilder.charAt(end));
			strBuilder.setCharAt(end, c);
			
			start++;
			end--;
		}
		
		return strBuilder.toString();		
	}
	
	/**
	 * Method reverseString() is used to reverse the character input array,
	 * without using an extra array.
	 * 
	 * @param s
	 *            Character input array
	 * @return reversed Character array
	 */
	public char[] reverseString(char[] s) {
		int length = s.length;
		for (int i = 0; i < length / 2; i++) {
			char c = s[i];

			s[i] = s[length - 1 - i];
			s[length - 1 - i] = c;
		}

		return s;
	}
}
