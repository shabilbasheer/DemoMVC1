package com.pillion.coding.challenge;

public class MethodOverloading {

	public static void main(String[] args) {
		//print(null);
	}

	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print(StringBuffer str) {
		System.out.println(str);
	}
	
	public static void print(Object str) {
		System.out.println(str);
	}
}
