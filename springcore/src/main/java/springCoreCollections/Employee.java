package springCoreCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private List<String> address;
	private Set<String> phone_nos;
	private Properties skills;
	private Map<String, String> workExperience;
	
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
	public Set<String> getPhone_nos() {
		return phone_nos;
	}
	public void setPhone_nos(Set<String> phone_nos) {
		this.phone_nos = phone_nos;
	}
	public Properties getSkills() {
		return skills;
	}
	public void setSkills(Properties skills) {
		this.skills = skills;
	}
	public Employee(int id, String name, List<String> address, Set<String> phone_nos, Properties skills, Map<String,String> workExperience) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_nos = phone_nos;
		this.skills = skills;
		this.workExperience = workExperience;
	}
	
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone_nos=" + phone_nos
				+ ", skills=" + skills + ", workExperience=" + workExperience + "]";
	}
	public Map<String, String> getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(Map<String, String> workExperience) {
		this.workExperience = workExperience;
	}
	
	
		
}
