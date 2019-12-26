package com.pillion.coding.challenge;

import java.util.StringTokenizer;

public class StringTokenize {

	public static void main(String[] args) {
		String str = "one,two,,three,four,,five";
		System.out.println(str);
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println("Tokenizer:");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println();
		System.out.println("Split:");
		for(String strSplit : str.split(",")) {
			System.out.println(strSplit);
		}
	}
}
