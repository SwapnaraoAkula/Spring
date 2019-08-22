package com.digi.SpringProject3;

import java.util.*;

public class Address {
	String name;
	String address;
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

	@Override
	public String toString() {
		return "Address Info: " + name + "," + address;
	}
}
