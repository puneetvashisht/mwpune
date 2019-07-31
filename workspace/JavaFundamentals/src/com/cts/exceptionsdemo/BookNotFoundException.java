package com.cts.exceptionsdemo;

public class BookNotFoundException extends RuntimeException{
	
	public BookNotFoundException(String message){
		super(message);
	}

}
