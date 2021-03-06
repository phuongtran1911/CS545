package edu.mum.server.controller;

import edu.mum.server.domain.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController {

	@CrossOrigin(origins = "http://localhost:8000")
	@PostMapping(value = "/api/addEmployee", produces = "application/json")
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employee;
	}

}
