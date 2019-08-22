package com.digi.SpringProject2;

import java.util.List;

public class Customer {
	String name;
	String address;
	List<String> phoneno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}
	
	public void display() {
		System.out.println(name + "," + address);
		for(String i : phoneno) {
			System.out.println(i);
		}
	}
	
}
