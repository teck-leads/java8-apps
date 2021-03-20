package com.techleads.app.lamda;

public class MyUsers {
	
	private String username;
	private String pwd;
	private Double salary;
	private Integer age;
	
	
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public MyUsers(String username, Double salary, Integer age) {
		super();
		this.username = username;
		this.salary = salary;
		this.age = age;
	}
	public MyUsers(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "MyUsers [username=" + username + ", pwd=" + pwd + ", salary=" + salary + ", age=" + age + "]";
	}
	

}
