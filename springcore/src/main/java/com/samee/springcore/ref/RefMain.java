package com.samee.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
	public static void main(String ars[]) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("refConfig.xml");
		 A a = (A) context.getBean("aref");
		 System.out.println(a);
	}
}
 