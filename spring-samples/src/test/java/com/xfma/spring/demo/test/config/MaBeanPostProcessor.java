package com.xfma.spring.demo.test.config;

import com.xfma.spring.demo.test.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @desc 修改bean属性
 * @Author mxf
 * @Date 2021/6/8 下午7:09
 */
@Component
public class MaBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 前置处理器
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization:  " + bean);
		Student student = null;
		if (bean instanceof Student) {
			student = (Student) bean;
			student.setStudentName("小红");
		}
		return student;
	}

	/**
	 * 后置处理器
	 *
	 * @param bean     the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization:  " + bean);
		return bean;
	}
}
