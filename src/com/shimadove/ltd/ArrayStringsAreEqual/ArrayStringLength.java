package com.shimadove.ltd.ArrayStringsAreEqual;
public class ArrayStringLength {

	/**
	 * Question
	 * Given two string arrays word1 and word2,
	 * return true if the two arrays represent the same string, and false otherwise.
	 * A string is represented by an array if the array elements concatenated in order forms the string.
	 */

	public boolean array_str_length(String[] word1, String[] word2) {
		return helper(word1).equals(helper(word2));
	}

	private String helper(String[] word1) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String word : word1) {
			stringBuilder.append(word);
		}
		return stringBuilder.toString();
	}
}
