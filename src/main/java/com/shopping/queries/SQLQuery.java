package com.shopping.queries;

public class SQLQuery {
	
	public static  String INSERT_INTO_EMPLOYEE="insert into Spring (EmployeeId,Password, FirstName,LastName, Gender,Salary, Address,MobileNumber, EmailId) values (?,?,?,?,?,?,?,?)";
	public static String EmployeeLogin = "select * from Spring where EmailId=? AND Password=?";
	public static String EmployeeFindAll = "select * from Spring";
	public static String findByEmpId ="select * from Spring where employeeId = ?";
	public static String findByemailId ="select * from Spring where emailId = ?";
	public static String deleteByEmpId ="delete from Spring where employeeId = ?";
	public static String updateEmployee= "Update Spring set EmployeeId=?,Password=?, FirstName=?,LastName=?, Gender=?,Salary=?,Address=?,MobileNumber=?,EmailId=?";
	public static String uploadImageById="insert into Spring (EmployeeId,Password, FirstName,LastName, Gender,Salary, Address,MobileNumber, EmailId,Image) values (?,?,?,?,?,?,?,?,?,?)";
    
}
