package com.keval.spring.service;

import java.util.List;

import com.keval.spring.model.DepartmentEntity;
import com.keval.spring.model.EmployeeEntity;

public interface EmployeeManager 
{
	public List<EmployeeEntity> getAllEmployees();
	public List<DepartmentEntity> getAllDepartments();
	public void addEmployee(EmployeeEntity employee);
}
