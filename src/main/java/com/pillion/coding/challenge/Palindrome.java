package com.pillion.coding.challenge;

public class Palindrome {
	//Palindrome in Lexicographic order by replacing *

    //str[i] and str[j] both are same and also not equal to ‘*’. In this case simply continue.
    //str[i] and str[j] both are same and are equal to ‘*’. Here you must fill str[i] = str[j] = ‘a’ for smallest possible palindrome.
    //str[i] equals to ‘*’ and str[j] is some alphabet. Here fill str[i] = str[j] to make our string a palindrome.
    //str[j] equals to ‘*’ and str[i] is some alphabet. Here fill str[j] = str[i] to make our string a palindrome.
    //str[i] is not equals to str[j] and also both are some alphabet. In this case palindrome construction is not possible. So, print “Not Possible” and break from loop.

	public static void main(String[] args) {
		String word = "malayalam";
		//String word = "bc*a*cb";
		//word = "bc*a*zb";
		//word = "mala*a*am";
		
		checkPalendrome(word);
	}

	public static void checkPalendrome(String word) {
		boolean flag = true;
		char []str = word.toCharArray();
		
		int i = 0; 
		int j = word.length() - 1;
		for(; i<=j; i++, j--) {
			System.out.println(word.charAt(i) + ", " + word.charAt(j));
			
			if(str[i] == str[j] && str[i] != '*') {
				continue;
			} else if(str[i] == str[j] && str[i] == '*') {
				str[i] = str[j] = 'a';
			} else if(str[i] != str[j] && str[i] == '*') {
				str[i] = str[j];
			} else if(str[i] != str[j] && str[j] == '*') {
				str[j] = str[i];
			} else {
				flag = false;
				System.out.println(word + " is not Palindrome");
				break;
			}
		}
		
		word = String.valueOf(str);
		
		if(flag) {
			System.out.println(word + " is a Palindrome");
		}
	}
}
