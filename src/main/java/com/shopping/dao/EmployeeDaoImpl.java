package com.shopping.dao;

import java.sql.Types;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;

import com.shopping.model.Employee;
import com.shopping.queries.SQLQuery;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	@Qualifier("tsdataSource")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Employee authUser(String EmailId, String password) {
		 List<Employee> employeeList=jdbcTemplate.query(SQLQuery.EmployeeLogin, new Object[] {EmailId,password},new BeanPropertyRowMapper<>(Employee.class));
		 return employeeList.size()==0 ?null : employeeList.get(0);
	}

	@Override
	public void signup(Employee employeeEntity) {
	//	Timestamp timestamp=new Timestamp(new Date().getTime());
		//Object[] data= {signupEntity.getUsername(),signupEntity.getPassword(),signupEntity.getEmail(),signupEntity.getName(),signupEntity.getSalutation(),timestamp};
		//jdbcTemplate.update(SQLQuery.INSERT_SIGNUP,data);
		
	}

	@Override
	public Employee findById(int sid) {
		
		Employee employeeEntity=(Employee)jdbcTemplate.queryForObject(SQLQuery.findByEmpId ,new Object[] {sid},new BeanPropertyRowMapper<>(Employee.class));
	return employeeEntity;
	}

	@Override
	public void deleteById(int sid) {
		jdbcTemplate.update(SQLQuery.deleteByEmpId,new Object[] {sid});
		
	}

	@Override
	public List<Employee> findAll() {
		 List<Employee> employeeList=jdbcTemplate.query(SQLQuery.EmployeeFindAll, new BeanPropertyRowMapper<>(Employee.class));
			return employeeList;
	}

	@Override
	public void updateSignup(Employee employeeEntity) {
		//Object[] data= {employeeEntity.employeeId(),employeeEntity.getPassword(),employeeEntity.FirstName(),signupEntity.getName(),signupEntity.getSalutation(),signupEntity.getSid()};
		//jdbcTemplate.update(SQLQuery.UPDATE_SIGNUP_BY_SID,data);
	}

	@Override
	public List<Employee> getEntity(int pageid, int total) {
		//10,5
        String sql = "select EmployeeId,Password, FirstName,LastName, Gender,Salary, Address,MobileNumber, EmailId from spring order by EmployeeId desc limit "+(pageid-1)+","+total;
        List<Employee> employeeList=jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        return employeeList;
	}

	@Override
	public int findTotalEmployee() {
		String sql = "select count(*) from spring";
        Integer count=jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
	}

	@Override
	public void upload(Employee employee) {
		LobHandler lobHandler = new DefaultLobHandler();
		SqlLobValue sqlLobValue = new SqlLobValue(employee.getBphoto(),lobHandler);
		Object[] data = {employee.getEmployeeId(),employee.getPassword(),employee.getFirstName(),employee.getLastName(),employee.getGender(),employee.getSalary(),employee.getAddress(),employee.getMobileNumber(),employee.getEmailId(),sqlLobValue};
		jdbcTemplate.update(SQLQuery.uploadImageById,data,new int[] {Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR,Types.INTEGER,Types.VARCHAR,Types.BIGINT,Types.VARCHAR,Types.BLOB});
	}
}