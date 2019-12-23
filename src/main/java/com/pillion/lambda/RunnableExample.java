/**
 * 
 */
package com.pillion.lambda;

/**
 * @author Hektor
 *
 */
public class RunnableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread normalThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Normal Thread Running..");
			}
			
		});
		
		normalThread.run();
		
		Thread lambdaThread = new Thread(() -> System.out.println("Lambda Thread Running.."));
		lambdaThread.run();
	}

}
