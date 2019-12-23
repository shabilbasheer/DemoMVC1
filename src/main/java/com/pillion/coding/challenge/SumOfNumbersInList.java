package com.pillion.coding.challenge;

import java.util.HashMap;
import java.util.Map;

public class SumOfNumbersInList {

	public static void main(String[] args) {
		//Give the indices of a list of elements which gives a sum 6
		//input -> [2, 3, 7, 4, 8]
		//output -> indices [1, 3]
		//Time Complexity here is O(n)
		
		int[] numbers = new int[] {-2, 3, 7, 4, 8};
		int target = 6;
		int[] result = getTwoSum(numbers, target);
		
		System.out.println(result[0] + ", " + result[1]);
	}

	public static int[] getTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> visitedNumbers = new HashMap<>();
		
		for(int i=0; i<numbers.length; i++) {
			int delta = target - numbers[i];
			
			System.out.println(numbers[i]);
			if(visitedNumbers.containsKey(delta)) { //Time complexity in this line is O(1) which constant every time for map
				return new int[] {i, visitedNumbers.get(delta)};
			}
			visitedNumbers.put(numbers[i], i);
			
		}
		return new int[] {-1, -1};
	}
}
