package com.studentTrans.StudentTrans.model;

public class AccountTransferRestModel {
	
	private int studentId;
	private Long studentAccNO;
	private Long schoolAccNo;
	private int amount;
	
	public AccountTransferRestModel() {
		super();
	}

	public AccountTransferRestModel(int studentId, Long studentAccNO, Long schoolAccNo, int amount) {
		super();
		this.studentId = studentId;
		this.studentAccNO = studentAccNO;
		this.schoolAccNo = schoolAccNo;
		this.amount = amount;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Long getStudentAccNO() {
		return studentAccNO;
	}

	public void setStudentAccNO(Long studentAccNO) {
		this.studentAccNO = studentAccNO;
	}

	public Long getSchoolAccNo() {
		return schoolAccNo;
	}

	public void setSchoolAccNo(Long schoolAccNo) {
		this.schoolAccNo = schoolAccNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
