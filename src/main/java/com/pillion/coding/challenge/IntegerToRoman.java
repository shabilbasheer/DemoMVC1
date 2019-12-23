package com.pillion.coding.challenge;

public class IntegerToRoman {

	static final String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	static final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	static final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	static final String[] thousands = {"", "M", "MM", "MMM"};
	
	public static void main(String[] args) {
		System.out.println("Roman Value if 1235 is " + convertToRoman(1235));
	}

	public static String convertToRoman(int num) {
		
		return thousands[(num % 10000)/1000]
				+ hundreds[(num % 1000)/100]
				+ tens[(num % 100)/10]
				+ units[num % 10];
	}
}
