package com.samee.springcore.init.destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [name=" + name + "]";
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy method -> pepsi");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method -> pepsi");

		
	}
	
	
	
}
