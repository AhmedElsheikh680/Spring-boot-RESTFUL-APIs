package com.hr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hr.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	public List<Employee> findByfName(String fName);
	
	@Query("select emp from Employee emp where emp.fName= :fNameBind and emp.lName= :lNameBind")
	public List<Employee> empSearch(@Param("fNameBind")String fName, @Param("lNameBind")String lName);
	
	public List<Employee> findByDepartmentId(long deptId);
}
