package com.digi.SpringProject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestProgram {

	public static void main(String[] args) {
		ApplicationContext r = new ClassPathXmlApplicationContext("Beans.xml");
		Employee e = (Employee) r.getBean("emp");
		e.display();
		
		Customer c = (Customer) r.getBean("cust");
		c.display();
	}

}
