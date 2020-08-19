package com.shopping.model;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class EmployeeDTO {
	private byte[] bphoto;
	private MultipartFile photo;
	private int employeeId;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private int salary;
	private String address;
	private long mobileNumber;
	private String emailId;
	
	
	
	
	public EmployeeDTO(byte[] bphoto, MultipartFile photo, int employeeId, String password, String firstName,
			String lastName, String gender, int salary, String address, long mobileNumber, String emailId) {
		super();
		this.bphoto = bphoto;
		this.photo = photo;
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


	public EmployeeDTO(){
		
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
	
	public byte[] getBphoto() {
		return bphoto;
	}


	public void setBphoto(byte[] bphoto) {
		this.bphoto = bphoto;
	}


	public MultipartFile getPhoto() {
		return photo;
	}


	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}


	
	@Override
	public String toString() {
		return "EmployeeDTO [bphoto=" + Arrays.toString(bphoto) + ", photo=" + photo + ", employeeId=" + employeeId
				+ ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", salary=" + salary + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", emailId=" + emailId + "]";
	}


	public void add(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		
	}
	

}
