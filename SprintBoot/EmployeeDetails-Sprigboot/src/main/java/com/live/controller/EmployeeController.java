package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.entity.Employee;

@RestController

public class EmployeeController {
	List<Employee> employee = new ArrayList<Employee>();
	@GetMapping("/employee")
	public List<Employee> getProducts()
	{
		if(employee.size()==0)
		{
			employee.add(new Employee(1001,"Ayushi Gupta","AE","Synechron","Finance"));
			employee.add(new Employee(1002, "David becham", "Developer", "Synechron","HR"));
		
		}
		return employee;
	}

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee product) {
		
		employee.add(new Employee(1004,"Employee 3","AE","Synechron","Finance"));
		return product;
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable(value="id") long employeeId, @RequestBody Employee product) {
		Employee employeevar=null;
		for(Employee employee1:employee)
		{
			if(employee1.getEmpId()==employeeId)
			{
				employee1.setEmpName(product.getEmpName());
				employee1.setEmpTitle(product.getEmpTitle());
				employee1.setCompanyName(product.getCompanyName());
				employee1.setProjectName(product.getProjectName());
				employeevar=employee1;
				break;
			}
		}
		
		return employeevar;
	}
	@DeleteMapping("/employee/{id}")
	public Employee deleteEmployee(@PathVariable(value="id") long employeeId,HttpServletRequest request) {
		Employee empvar=null;
		String reuest=request.getRequestURL().toString();
		int index=-1;
		for(Employee employee1:employee)
		{
			index++;
			if(employee1.getEmpId()==employeeId)
			{
				
				employee.remove(index);
				break;
			}
		}
		
		return empvar;
	}


}
