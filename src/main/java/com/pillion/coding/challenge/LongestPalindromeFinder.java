package com.pillion.coding.challenge;

public class LongestPalindromeFinder {

	public static void main(String[] args) {
		//System.out.println("longest Palindrome of 1234 - " + longestPalindromeString("1234"));
		System.out.println("longest Palindrome of 12321 - " + longestPalindromeString("8123219"));
		//System.out.println("longest Palindrome of 9912321456 - " + longestPalindromeString("9912321456"));
		//System.out.println("longest Palindrome of 9912333321456 - " + longestPalindromeString("9912333321456"));
		//System.out.println("longest Palindrome of 12145445499 - " + longestPalindromeString("12145445499"));
		//System.out.println("longest Palindrome of 1223213 - " + longestPalindromeString("1223213"));
		//System.out.println("longest Palindrome of abb - " + longestPalindromeString("abb"));
		//System.out.println("longest Palindrome of '' - " + longestPalindromeString(""));
	}

	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null || "".equals(s)) return "";
		
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
}
