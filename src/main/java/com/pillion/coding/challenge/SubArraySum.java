package com.pillion.coding.challenge;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3} ;
		
		sumOfArray(arr);
	}

	public static void sumOfArray(int[] arr) {
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k] + ", ");
					result += arr[k];
				}
			}
		}
		
		System.out.print("\nresult - " + result);
	}
}
