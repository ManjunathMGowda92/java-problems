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
}
