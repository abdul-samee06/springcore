package com.samee.springcore.standaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("standaloneConfig.xml");
		Organization org1 = context.getBean("org1", Organization.class);
		System.out.println(org1);

	}

}
