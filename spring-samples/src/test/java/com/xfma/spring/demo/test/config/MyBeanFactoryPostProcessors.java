package com.xfma.spring.demo.test.config;

import com.xfma.spring.demo.test.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * 自定义BeanFactoryPostProcessor
 */
@Component
public class MyBeanFactoryPostProcessors implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 可以通过beanFactory操作具体的bean：修改属性、创建bean等
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		Student student = (Student) beanFactory.getBean("student");
		System.out.println(student);
	}

	/**
	 * 注册bean到容器
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		RootBeanDefinition beanDefinition = new RootBeanDefinition(Student.class);
		registry.registerBeanDefinition("student",beanDefinition);
	}
}
