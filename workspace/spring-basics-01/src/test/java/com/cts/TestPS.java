package com.cts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cts.services.PaymentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPS {
	
	@Autowired
	PaymentService paymentService;

	@Test
	public void test() {
	
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		PaymentService paymentService = context.getBean(PaymentService.class);
		paymentService.payment();
	}

}
