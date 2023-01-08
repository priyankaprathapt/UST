package com.studentTrans.StudentTrans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentpayment")
public class Payment {
	
	@Id
	@GeneratedValue
	private int id;
	private int studentid;
	private String studentname;
	private int amount;
	private String lastoperation;
	


	public Payment() {
		super();
	}



	public Payment(int id, int studentid, String studentname, int amount, String lastoperation) {
		super();
		this.id = id;
		this.studentid = studentid;
		this.studentname = studentname;
		this.amount = amount;
		this.lastoperation = lastoperation;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public String getStudentname() {
		return studentname;
	}



	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getLastoperation() {
		return lastoperation;
	}



	public void setLastoperation(String lastoperation) {
		this.lastoperation = lastoperation;
	}



	

}
