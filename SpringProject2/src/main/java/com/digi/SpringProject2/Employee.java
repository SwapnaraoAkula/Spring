package com.digi.SpringProject2;

import java.util.*;

public class Employee {
	String name;
	String address;
	Map<String,String> hobbies;
	
	public Employee() {
	}
	
	public Employee(String name, String address,Map<String,String> hobbies) {
		super();
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}
	
	public void display() {
		System.out.println(name + "," + address);
		for(Map.Entry<String, String> c : hobbies.entrySet()) {
			System.out.println(c.getValue());
		}
	}
}
