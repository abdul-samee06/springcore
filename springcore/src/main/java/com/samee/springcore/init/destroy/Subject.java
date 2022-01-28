package com.samee.springcore.init.destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject() {
		super();
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside the init method of subject class");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside the destroy method of Subject class");
	}
	
	
}
