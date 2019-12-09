package org.manjunath.strings;

import java.util.Arrays;

/**
 * class StringAnagram is used to verify whether the given Strings are anagrams
 * or not.
 * 
 * @author Manjunath HM
 *
 */
public class StringAnagram {
	/**
	 * Method anagram() is used to find out the whether the given strings are
	 * anagrams or not.
	 * 
	 * <p>
	 * Method first sorts the given arrays using the Arrays.sort method, by
	 * converting them to character array. Then those character arrays will be
	 * compared.
	 * </p>
	 * 
	 * @param s
	 *            First input String
	 * @param t
	 *            Second input String
	 * @return Boolean value whether the strings are anagrams or not
	 */
	public static boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();

		Arrays.sort(sArr);
		Arrays.sort(tArr);

		s = new String(sArr);
		t = new String(tArr);
		return s.equalsIgnoreCase(t);
	}

	/**
	 * Method anagram() is used to find out the whether the given strings are
	 * anagrams or not.
	 * <p>
	 * This method find outs the whether the strings are anagram or not by using
	 * the Hashtable method. An Array of 26 integers will be taken and each
	 * character from the first String will be stored as positive integer at
	 * respective positions and second string each character is stored as
	 * negative integer. Then the integer array is iterated for any value
	 * greater than zero. If the integer array is having any integer value other
	 * than the zero, then the given strings are not anagrams
	 * </p>
	 * 
	 * <p>
	 * Explanation:
	 * <ul>
	 * <li>Consider 2 Strings abc and cab</li>
	 * <li>Create an integer Array with 26 integers ([0, 0, 0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])</li>
	 * <li>Iterate through the strings and store first String character as
	 * positive integer and second String character as negative integer
	 * <ul>
	 * <li>For the first iteration the array will be like [1, 0, -1, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]. i.e characters
	 * a and c were replaced as integer values into the array</li>
	 * <li>For the second iteration the array will be like [0, 1, -1, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]. here
	 * actually the index of a will be replaced by the 0 because second string
	 * is having 'a' and this will be deducted from the array</li>
	 * <li>For the third iteration the array will be like [0, 0, 0, 0, 0, 0, 0,
	 * 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]. i.e characters
	 * will be matched and all the values will be deducted.</li>
	 * </ul>
	 * </li>
	 * <li>Iterate through the integer array and check whether the array
	 * contains any integers other than zero. If the array contains any integer
	 * other than zero then the given Strings are not anagrams else both the
	 * Strings are anagrams.</li>
	 * </ul>
	 * </p>
	 * 
	 * @param s
	 *            First input String
	 * @param t
	 *            Second input String
	 * @return Boolean value whether the Strings are anagrams or not
	 */
	public static boolean anagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] counter = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}

		for (int count : counter) {
			if (count != 0)
				return false;
		}

		return true;
	}
}
