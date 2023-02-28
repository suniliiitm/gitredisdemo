package com.sp.redis.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sp.redis.dao.IEmployeeDao;
import com.sp.redis.model.Employee;

@Component
public class RedisTest implements CommandLineRunner {
	@Autowired
	private IEmployeeDao dao;
	public void run(String... args) throws Exception {
		
	dao.addEmploye(new Employee(101,"Sunil",4000));
	dao.addEmploye(new Employee(102, "Vivek", 6000));
	dao.addEmploye(new Employee(103,"Sunila",10000));
	dao.addEmploye(new Employee(104, "Viveka", 8000));
		
	}

}
