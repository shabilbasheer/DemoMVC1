package com.pillion.coding.challenge;

import java.util.Arrays;

public class ReArrangeArray {

	/*
	 * 	Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
		Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

		Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
		Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
		
		Approach:
		1. Navigate the array.
		2. Check if a[i] = -1, if yes then ignore it.
		3. If a[i] != -1, Check if element a[i] is at its correct position (i=A[i]). If yes then ignore it.
		4. If a[i] != -1 and element a[i] is not at its correct position (i!=A[i]) then place it to its correct position, but there are two conditions:

	    Either A[i] is vacate, means A[i] = -1, then just put A[i] = i .
	    OR A[i] is not vacate, means A[i] = x, then int y=x put A[i] = i. Now, we need to place y to its cor­rect place, so repeat from step 3.
	 * */
	
	public static void main(String[] args) {
		int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		
		System.out.println(Arrays.toString(fixPosition(arr)));
	}

	public static int[] fixPosition(int arr[]) {
		for(int i=0; i< arr.length; i++) {
			
			if(arr[i] != -1 && arr[i] != i) {
				int x = arr[i];
				
				while(arr[x] != -1 && arr[x] != x) {
					int y = arr[x];
					arr[x] = x;
					x = y;
				}
				
				arr[x] = x; 
				
				if(arr[i] != i) {
					arr[i] = -1; 
				}
			}
		}
		
		return arr;
	}
}
