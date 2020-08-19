package com.shopping.dao;

import java.util.List;

import com.shopping.model.Employee;

public interface EmployeeDao {

	Employee authUser(String EmailId, String password);
	void signup(Employee employeeEntity);
	Employee findById(int sid);
	void deleteById(int sid);
	List<Employee> findAll();
	void updateSignup(Employee employeeEntity);
	List<Employee> getEntity(int pageid, int total);
	int findTotalEmployee();
	void upload(Employee employee);
	





}

