package com.cts.di;

public class Test {

	public static void main(String[] args) {
		B b = new B();
		A a = new A(b);
		a.execute();
	}

}
