/**
 * 
 */
package com.pillion.lambda;

/**
 * @author Hektor
 *
 */
public class TestLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLambda testLam = new TestLambda();
		
		TestLambdaPrintImpl01 impl1 = new TestLambdaPrintImpl01();
		TestLambdaPrint myLambdaFunction = () -> System.out.println("Hello World Lambda !!");
		//myLambdaFunction.print();
		
		TestLambdaPrint innerClass = new TestLambdaPrint() {
			public void print() {
				System.out.println("Hello World Inner Class !!");
			}
		};
		//innerClass.print();
		
		testLam.print(myLambdaFunction);
		testLam.print(innerClass);
		
		//TestLambdaPrintImpl02 impl2 = new TestLambdaPrintImpl02();
		//testLam.print(impl2);
		
		
	}

	public void print(TestLambdaPrint lambda) {
		lambda.print();
	}
}
