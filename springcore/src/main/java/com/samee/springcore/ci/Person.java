package com.samee.springcore.ci;

import java.util.List;

public class Person {
	private int personId;
	private String name;
	private Certificate cert;
	private List<String> skills;
	
	
	public Person(int personId, String name, Certificate cert, List<String> skills) {
		super();
		this.personId = personId;
		this.name = name;
		this.cert = cert;
		this.skills = skills;
	}



	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", cert=" + cert + ", skills=" + skills + "]";
	}
	
	
	
	
	
	
}
