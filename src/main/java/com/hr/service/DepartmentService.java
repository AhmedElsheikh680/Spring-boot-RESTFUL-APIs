package com.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.model.Department;
import com.hr.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired 
	private DepartmentRepo departmentRepo;
	
	public List<Department> getAllDept(){
		
		return departmentRepo.findAll();
	}
	
	public Department getDeptById(long id) {
		
		return departmentRepo.findById(id).orElseThrow(null);
	}
	
	public void addDept(Department dept) {
		
		departmentRepo.save(dept);
	}
	
	public void updateDept(Department dept) {
		
		departmentRepo.save(dept);
	}
	
	public void deleteDept(long id) {
		
		departmentRepo.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
