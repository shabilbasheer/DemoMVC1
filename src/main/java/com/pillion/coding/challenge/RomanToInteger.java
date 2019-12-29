package com.pillion.coding.challenge;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println("Integer Value if MCCXXXV is " + convertToInteger("MCCXXXV"));
	}

	public static int convertToInteger(String num) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		
		//XCI - 91
		//10 = 10
		//10 + 100 - (10 + 10) = 90
		//90 + 1 = 91
		
		for(int i=0; i<num.length(); i++) {
			//if the current character is higher than previous character, the subtract the previous character 2 times from the total
			if(i>0 && map.get(num.charAt(i)) > map.get(num.charAt(i-1))) {
				result += map.get(num.charAt(i)) - (2 * map.get(num.charAt(i-1)));
			} else {
				result += map.get(num.charAt(i));
			}
		}
		return result;
	}
}
