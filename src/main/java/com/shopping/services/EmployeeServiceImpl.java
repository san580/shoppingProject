package com.shopping.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dao.EmployeeDao;
import com.shopping.model.Employee;
import com.shopping.model.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	 private EmployeeDao employeeDao;
	@Override
	public EmployeeDTO authUser(String EmailId, String password) {
		Employee employeeEntity= employeeDao.authUser(EmailId, password);
		EmployeeDTO employeeDTO=null;
		if(employeeEntity!=null) {
			employeeDTO=new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);	
		}
		return employeeDTO;
	}

	@Override
	public void persist(EmployeeDTO employeeDTO) {
		Employee employeeEntity=new Employee();
		BeanUtils.copyProperties(employeeDTO, employeeEntity);
		employeeDao.signup(employeeEntity);
		
	}

	@Override
	public EmployeeDTO findById(int sid) {
		Employee employeeEntity=employeeDao.findById(sid);
		EmployeeDTO employeeDTO=new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		return employeeDTO;
		
	}

	@Override
	public void deleteById(int sid) {
		employeeDao.deleteById(sid);
				
	}

	@Override
	public List<EmployeeDTO> findAll() {
		List<Employee> list=employeeDao.findAll();
		List<EmployeeDTO> employeeDTOs=new ArrayList<>();
		for(Employee entity:list) {
			EmployeeDTO employeeDTO=new EmployeeDTO();
			BeanUtils.copyProperties(entity, employeeDTO);
			employeeDTOs.add(employeeDTO);
		}
		return employeeDTOs;
	}

	@Override
	public void updateSignup(EmployeeDTO employeeEntity) {
	//	Employee employeeEntity1=new Employee();
	//	BeanUtils.copyProperties(employeeDTO, employeeEntity1);
		//employeeDTO.updateSignup(employeeEntity1);		
	}

	@Override
	public List<EmployeeDTO> getDTO(int pageid, int total) {
		List<Employee> list=employeeDao.getEntity(pageid, total);
		List<EmployeeDTO> employeeDTOs=new ArrayList<>();
		for(Employee entity:list) {
			EmployeeDTO signupDTO=new EmployeeDTO();
			BeanUtils.copyProperties(entity, signupDTO);
			employeeDTOs.add(signupDTO);
		}
		return employeeDTOs;
		
	}

	@Override
	public int findTotalEmployee() {
		return employeeDao.findTotalEmployee();

	}

	@Override
	public void upload(EmployeeDTO dtoEmployee) {
		Employee employeeEntity = new Employee();
		BeanUtils.copyProperties(dtoEmployee,employeeEntity);
		employeeDao.upload(employeeEntity);
		
	}

}
