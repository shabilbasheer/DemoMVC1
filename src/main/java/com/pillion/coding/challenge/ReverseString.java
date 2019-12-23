package com.pillion.coding.challenge;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Builder - " + reverseStringUsingBuilder("shabil"));
		System.out.println("Manual - " + reverseStringUsingMaually("shabil"));
	}

	public static String reverseStringUsingBuilder(String str) {
		//Using StringBuilder
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static String reverseStringUsingMaually(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
