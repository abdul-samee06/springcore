package com.samee.springcore.init.destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samee.springcore.ref.A;

public class InitDestMain {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("init_des_config.xml");
		 VIP vip = (VIP) context.getBean("vip");
		 System.out.println(vip);
		 context.registerShutdownHook();
		 
		 System.out.println("*****************************************************************************");
		 Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
		 System.out.println(pepsi);
		 
		 System.out.println("#############################################################################");
		 Subject subject = (Subject) context.getBean("sub1");
		 System.out.println(subject);
	}
}
