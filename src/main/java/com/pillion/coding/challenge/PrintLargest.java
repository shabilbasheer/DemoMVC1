package com.pillion.coding.challenge;

public class PrintLargest {

	public static void main(String[] args) {
		int arr[] = {12, 13, -14, -13};
		findLargest(arr);
	}

	public static void findLargest(int[] num) {
		
		if(num.length > 3) {
			int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
			
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
		} else {
			System.out.println("Array length is less than 3");
		}
		
	}
}
