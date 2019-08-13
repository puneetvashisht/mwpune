package com.cts;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.components.A;
import com.cts.components.TransferService;

public class TestDepInjection {
	
	@Test
	public void testTransferService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");	
		TransferService service = context.getBean(TransferService.class);
		service.transferFunds();
	}

	@Test
	public void test() {
//		B b = new B();
//		A a = new A(b);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		A a = context.getBean(A.class);
		a.execute();
	}

}
