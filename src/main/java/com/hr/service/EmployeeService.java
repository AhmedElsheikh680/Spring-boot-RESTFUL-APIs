package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Employee;
import com.hr.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getDeptEmps(long deptId) {

		return employeeRepo.findByDepartmentId(deptId);
	}

	public List<Employee> getAllEmeployees() {

		return employeeRepo.findAll();
	}

	public Employee getEmpById(long id) {

		return employeeRepo.findById(id).orElseThrow(null);
	}

	public List<Employee> getEmpByfName(String fName) {

		return employeeRepo.findByfName(fName);
	}

	public List<Employee> getEmpSearch(String fName, String lName) {

		return employeeRepo.empSearch(fName, lName);
	}

	public void addEmp(Employee emp) {

		employeeRepo.save(emp);
	}

	public void updateEmp(Employee emp) {
		employeeRepo.save(emp);
	}

	public void deleteEmp(long id) {
		employeeRepo.deleteById(id);
	}

}
