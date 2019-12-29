package com.pillion.coding.challenge;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Reverse of 123456 - " + reverseInteger(123456));
	}

	public static long reverseInteger(int input) {
		int reversed = 0;
		
		while(input != 0) {
			System.out.println(reversed * 10 + "  " + input % 10);
			reversed = reversed * 10 + input % 10;

			if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
			
			input /= 10;
		}
		//2147483647 - Integer.MAX_VALUE
		//-2147483648 - Integer.MIN_VALUE
		return reversed;
	}
}
