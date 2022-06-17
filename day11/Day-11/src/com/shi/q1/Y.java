package com.shi.q1;

public interface Y {
	
	abstract void method1();
	
	default void method2() {
		
		System.out.println("Inside the method2 of Y");
		
	}
	
	static void  method3() {
		
		System.out.println("Inside the method3 of Y");
		
	}

}
