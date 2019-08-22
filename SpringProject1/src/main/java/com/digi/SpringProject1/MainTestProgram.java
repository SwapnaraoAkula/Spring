package com.digi.SpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestProgram {
	
	public static void main(String[] args) {
		//it will take care of loading the bean configuration file
		//take care of creating and initializing all the objects
		ApplicationContext c = new ClassPathXmlApplicationContext("Beans.xml");
		Employee obj = (Employee) c.getBean("emp");
		System.out.println(
				obj.getName());
		System.out.println(obj.getAddress());
	}
	
}
