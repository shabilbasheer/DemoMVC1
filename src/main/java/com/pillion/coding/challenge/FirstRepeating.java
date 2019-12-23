package com.pillion.coding.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FirstRepeating {

	public static void main(String[] args) {
		String str = "shabilbasheer"; 
		char[] array = str.toCharArray();
		System.out.println("First Repeated Charater - " + getRepeatingCharacter(array));
		System.out.println("Repeated Charater - " + getListOfRepeatingCharacter(array).toString());
	}

	public static char getRepeatingCharacter(char[] array) {
		HashSet<Character> h = new HashSet<>(); 
		
		for(int i=0; i<array.length; i++) {
			char c = array[i];
			if(h.contains(c)) {
				return c;
			} else {
				h.add(c);
			}
		}
		
		return '\0';
	}
	
	public static List<Character> getListOfRepeatingCharacter(char[] array) {
		HashSet<Character> h = new HashSet<>();
		List<Character> repeatedCharacters = new ArrayList<Character>();
		
		for(int i=0; i<array.length; i++) {
			char c = array[i];
			if(h.contains(c)) {
				repeatedCharacters.add(c);
			} else {
				h.add(c);
			}
		}
		
		return repeatedCharacters;
	}
}
