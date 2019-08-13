package com.cts.components;

import org.springframework.stereotype.Component;

@Component
public class AccountRepository {
	
	public void loadAccount(){
		System.out.println("Loads account information....");
	}

}
