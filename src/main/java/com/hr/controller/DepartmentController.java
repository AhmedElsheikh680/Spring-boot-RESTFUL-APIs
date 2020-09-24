package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Department;
import com.hr.service.DepartmentService;

@RestController
@RequestMapping("/api/v1")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/getAllDept")
	public List<Department> getAllDept(){
		
		return departmentService.getAllDept();
	}
	
	@GetMapping("/getDeptById")
	public Department getDeptById(@RequestParam long id) {
		
		return departmentService.getDeptById(id);
	}
	
	@PostMapping("/addDept")
	public String addDept(@RequestBody Department dept) {
		
		departmentService.addDept(dept);
		return "Added Successfully";
	}
	
	@PutMapping("/updateDept")
	public String updateDept(@RequestBody Department dept) {
		
		departmentService.updateDept(dept);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deleteDept")
	public String deleteDept(@RequestParam long id) {
		
		departmentService.deleteDept(id);
		return "Deleted Successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
