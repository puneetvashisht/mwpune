package com.cts.exceptionsdemo;

public class ExceptionsDemo {
	
	
	public static void m2(int a){
		try{
			double x = 12/a;
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
			throw new BookNotFoundException("Don't just pass value 0");
		}
		finally{
		
		}
		
		System.out.println("In M2");
		
	}
	
	
	public static void m1(){
		
		m2(0);
		System.out.println("In M1");
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In Main");
		System.out.println("Allz well that ends well!!");

	}

}
