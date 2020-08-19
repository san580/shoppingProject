package com.shopping.model;

import java.util.Arrays;

public class Employee {
	private byte[] bphoto;
	private int employeeId;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private int salary;
	private String address;
	private long mobileNumber;
	private String emailId;

	




	public Employee(byte[] bphoto, int employeeId, String password, String firstName, String lastName, String gender,
			int salary, String address, long mobileNumber, String emailId) {
		super();
		this.bphoto = bphoto;
		this.employeeId = employeeId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}



	public Employee() {
		// TODO Auto-generated constructor stub
	}


	

	public byte[] getBphoto() {
		return bphoto;
	}



	public void setBphoto(byte[] bphoto) {
		this.bphoto = bphoto;
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public long getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	@Override
	public String toString() {
		return "Employee [bphoto=" + Arrays.toString(bphoto) + ", employeeId=" + employeeId + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", salary=" + salary
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}



	
}