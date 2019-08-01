package com.cts.di;

// this import is from spring-context, reason why we included spring-context dependency
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		B b = new B();
//		A a = new A(b);
//		With spring avoid creating a new object with new keyword.. instead will create application context
		// We no longer are creating objects with new keyword, Spring does it for us
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		A a = context.getBean(A.class);
		a.execute();
	}

}
