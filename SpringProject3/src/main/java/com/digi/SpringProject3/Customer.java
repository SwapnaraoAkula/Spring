package com.digi.SpringProject3;

import java.util.List;

public class Customer {
	Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address: " + address;
	}
}
