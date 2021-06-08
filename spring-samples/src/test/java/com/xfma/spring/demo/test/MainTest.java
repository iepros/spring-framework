package com.xfma.spring.demo.test;

import com.xfma.spring.demo.test.config.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	/**
	 * 通过XML启动spring
	 */
	@Test
	public void testXml(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(applicationContext.getBean("person"));
	}

	/**
	 * 通过注解启动spring
	 */
	@Test
	public void testAnnotation(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean("myBeanFactoryPostProcessors"));
	}
}
