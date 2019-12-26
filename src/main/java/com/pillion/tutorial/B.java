package com.pillion.tutorial;

import com.pillion.test.A;

public class B extends A {
	public void protectedMethod() {
      System.out.println("subclass protected method");
   }
	
	public void plumbic() {
		protectedMethod();
      System.out.println("subclass plumbic method");
   }
}
