package com.digi.SpringProject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestProgram {

	public static void main(String[] args) {
		ApplicationContext r = new ClassPathXmlApplicationContext("Beans.xml");
		Customer e = (Customer) r.getBean("cust");
		System.out.println(e);
		
	}

}
