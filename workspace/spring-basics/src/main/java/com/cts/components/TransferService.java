package com.cts.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferService {
	
	@Autowired
	AccountRepository accountRepo;
	
	public void transferFunds(){
		accountRepo.loadAccount();
		System.out.println("Doing funds transfer now");
	}

}
