package com.cts.di;

public class A {
	
	B b;
	A(B b){
		this.b = b;
	}

	public void execute() {
		System.out.println("Execute in A");
		b.execute();
		
	}

}
