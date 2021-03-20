package com.techleads.app.lamda;

public class TimeSheet {
	
	private Integer empNo;
	private Integer numOfDays;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public Integer getNumOfDays() {
		return numOfDays;
	}
	public void setNumOfDays(Integer numOfDays) {
		this.numOfDays = numOfDays;
	}
	public TimeSheet(Integer empNo, Integer numOfDays) {
		super();
		this.empNo = empNo;
		this.numOfDays = numOfDays;
	}
	public TimeSheet() {
		super();
	}
	

}
