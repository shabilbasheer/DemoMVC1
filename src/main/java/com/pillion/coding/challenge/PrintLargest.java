package com.pillion.coding.challenge;

public class PrintLargest {

	public static void main(String[] args) {
		int arr[] = {12, 13, -14, 10, 0, 9};
		findLargest(arr);
	}

	public static void findLargest(int[] num) {
		int first = 0, second = 0, third = 0;
		
		for(int i=0; i<num.length; i++) {
			int x = num[i];
			if(x > first) {
				third = second;
				second = first;
				first = x;
			} else if(x > second) {
				third = second;
				second = x;
			} else if(x > third) {
				third = x;
			}
		}
		
		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}
}
