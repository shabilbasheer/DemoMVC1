/**
 * 
 */
package com.pillion.lambda;

/**
 * @author Hektor
 *
 */
public class TypeInferenceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//One Way
		StringLengthLambda lengthLambda = s -> s.length();
		System.out.println(lengthLambda.getLength("shabil"));
		
		//Second Way
		printStringLength(s -> s.length());
	}

	
	public static void printStringLength(StringLengthLambda lengthLambda) {
		System.out.println(lengthLambda.getLength("swati"));
	}
			
	interface StringLengthLambda {
		int getLength(String s);
	}
}
