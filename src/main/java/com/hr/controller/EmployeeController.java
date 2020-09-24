package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hr.model.Employee;
import com.hr.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${hr.file.path}")
	String filePath;
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getAllDept/{deptId}/getAllEmployees")
	public List<Employee> getDeptEmps(@PathVariable long deptId){
		
		return employeeService.getDeptEmps(deptId);
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		System.out.println("App Name: "+appName+ " And File path "+filePath);
		
		return  employeeService.getAllEmeployees();
	}
	
	@GetMapping("/getEmpById")
	public Employee getEmpById(@RequestParam long id) {
		
		return employeeService.getEmpById(id);
	}
	
	@GetMapping("/getEmpbyFName")
	public List<Employee> getEmpbyFName(@RequestParam String fName){
		
		return employeeService.getEmpByfName(fName);
	}
	
	@GetMapping("/getSearchEmp")
	public List<Employee> getSearchEmp(String fName, String lName){
		
		return employeeService.getEmpSearch(fName, lName);
	}
	
	@PostMapping("/addEmp")
	public String addEmp(@RequestBody Employee emp) {
		employeeService.addEmp(emp);
		return "Added Successfully";
	}
	
	@PutMapping("/updateEmp")
	public String updateEmp(@RequestBody Employee emp) {
		
		employeeService.updateEmp(emp);
		return "Updated Successfuly";
	}
	
	
	@DeleteMapping("/deleteEmp")
	public String deleteEmp(@RequestParam long id) {
		
		employeeService.deleteEmp(id);
		return "Deleted Successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
