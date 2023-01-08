package com.chitfunds.ChitFund.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue
	private int customerid;
	private String name;
	private String address;
	private Long aadhaar;
	private int chitid;
	private int groupid;
	public Customer() {
		super();
	}
	public Customer(int customerid, String name, String address, Long aadhaar, int chitid, int groupid) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.address = address;
		this.aadhaar = aadhaar;
		this.chitid = chitid;
		this.groupid = groupid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
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
	public Long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(Long aadhaar) {
		this.aadhaar = aadhaar;
	}
	public int getChitid() {
		return chitid;
	}
	public void setChitid(int chitid) {
		this.chitid = chitid;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	
	
	

}
