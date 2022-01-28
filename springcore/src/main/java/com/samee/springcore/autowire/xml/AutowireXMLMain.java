package com.samee.springcore.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireXMLMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlAutowireConfig.xml");
		Employee emp1 = context.getBean("emp1",Employee.class);
		System.out.println(emp1);

	}

}
