package TestRest.TestRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import TestRest.TestRestApi.data.Employee;
import TestRest.TestRestApi.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> allEmpObj = testService.getAllEmp();
		return new ResponseEntity<List<Employee>>(allEmpObj, HttpStatus.OK);
	}
}
