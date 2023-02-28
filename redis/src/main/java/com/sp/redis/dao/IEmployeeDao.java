package com.sp.redis.dao;

import java.util.Map;

import com.sp.redis.model.Employee;

public interface IEmployeeDao {
	void	addEmploye(Employee emp);
	
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee emp);
	
	Map<Integer,Employee>getAllEmployee();
	
	void removeEmployee(Integer id);
}
