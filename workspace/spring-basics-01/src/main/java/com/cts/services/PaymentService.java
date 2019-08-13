package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.repos.PaymentRepository;
@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	public void payment(){
		System.out.println("In Payment servie");
		paymentRepository.payment();
		
	}

}
