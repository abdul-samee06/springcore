package com.samee.springcore.init.destroy;

public class VIP {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public VIP() {
		super();
	}

	public VIP(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "VIP [name=" + name + "]";
	}
	
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
}


