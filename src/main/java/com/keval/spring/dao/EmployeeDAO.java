package com.keval.spring.dao;

import java.util.List;

import com.keval.spring.model.DepartmentEntity;
import com.keval.spring.model.EmployeeEntity;

public interface EmployeeDAO 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}