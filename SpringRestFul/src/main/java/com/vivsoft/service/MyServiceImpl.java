package com.vivsoft.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivsoft.mapper.MyMapper;
import com.vivsoft.model.Employee;

@Service("myService")
public class MyServiceImpl implements MyService{
	@Autowired
	private MyMapper myMapper;

	@Override
	public int getUnoFromDual() {
		// TODO Auto-generated method stub
		return myMapper.getUnoFromDual();
	}

	@Override
	public List<Employee> getEmployees2() {
		// TODO Auto-generated method stub
		return myMapper.getEmployees4();
	}
	@Override
	public List<Employee> getEmployees() {
		Map<String,Object> params = new HashMap<String,Object>();
		myMapper.getEmployees(params);
		return ((ArrayList<Employee>)params.get("my_cursor")); 
	}
	
	
	
}
