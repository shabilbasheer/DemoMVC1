package com.pillion.test;

import java.util.stream.IntStream;

public class SortBasedOnFrequency {

	//Input [4,3,1,6,4,3,6,4]
	//Output [4,4,4,3,3,6,6,1]
	static int x = 0;
	
	public static void main(String args[]) {
		int a[] = {4,3,1,6,4,3,6,4};
		int b[][] = new int[a.length][2];

		a = sort(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
	}
	
	public static int[] sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				
				//System.out.println("i-" + i + ", j-"+j);
				if(a[i] < a[j]) {
					System.out.println("i-" + i);
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
