package com.xfma.spring.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		applicationContext.getBean("person");
	}
}
