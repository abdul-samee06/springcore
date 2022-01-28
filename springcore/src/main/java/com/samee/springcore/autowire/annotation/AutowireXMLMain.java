package com.samee.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireXMLMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowireAnnotationConfig.xml");
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.)

	}

}
