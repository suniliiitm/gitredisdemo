package com.sp.redis.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.sp.redis.dao.IEmployeeDao;
import com.sp.redis.model.Employee;

import jakarta.annotation.Resource;
import reactor.core.publisher.Sinks.Empty;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	private String key="Employee";
	
	@Resource(name="rt")
	//@Autowired
	
	private HashOperations<String,Integer, Employee> ho;
	public void addEmploye(Employee emp) {
		
		//create a new rechord in hashMemory if given id not exist
		
		ho.putIfAbsent(key, emp.getEmpId(), emp);
	}

	public Employee getOneEmployee(Integer id) {
		//read one rechord based on HoRf and id
		
		return ho.get(key, id);
	}

	public void updateEmployee(Employee emp) {
		//update data with given id
		ho.put(key,emp.getEmpId(), emp);
	}

	public Map<Integer, Employee> getAllEmployee() {
		//hashRef get all rows as a map 
		
		return ho.entries(key);
	}

	public void removeEmployee(Integer id) {
		
		ho.delete(key, id);
	}

}
