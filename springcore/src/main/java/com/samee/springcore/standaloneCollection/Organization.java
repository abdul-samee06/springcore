package com.samee.springcore.standaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Organization {
	private int id;
	private String name;
	private List<String> address;
	private Map<String, Integer> programs;
	private Properties properties;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getPrograms() {
		return programs;
	}
	public void setPrograms(Map<String, Integer> programs) {
		this.programs = programs;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Organization() {
		super();
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + ", programs=" + programs
				+ ", properties=" + properties + "]";
	}
}
