package com.shopping.services;

import java.util.List;

import com.shopping.model.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO authUser(String EmailId, String password);
	void persist(EmployeeDTO employeeDTO);
	EmployeeDTO findById(int sid);
	void deleteById(int sid);
	List<EmployeeDTO> findAll();
	void updateSignup( EmployeeDTO employeeEntity);
	List<EmployeeDTO> getDTO(int pageid, int total);
	int findTotalEmployee();
	void upload(EmployeeDTO dtoEmploye);
	

	
}
