package springCoreCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
	    Employee empl1 = (Employee) context.getBean("emp1");
	    System.out.println(empl1);
	    System.out.println(empl1.getAddress().getClass().getName());
	    System.out.println(empl1.getPhone_nos().getClass().getName());
	    System.out.println(empl1.getSkills().getClass().getName());
	    System.out.println(empl1.getWorkExperience().getClass().getName());
	}
}
