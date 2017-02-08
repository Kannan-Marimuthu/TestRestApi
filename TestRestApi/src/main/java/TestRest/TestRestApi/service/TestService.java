package TestRest.TestRestApi.service;

import java.util.List;

import TestRest.TestRestApi.data.Employee;

public interface TestService {
	Employee getEmp(int id);

	List<Employee> getAllEmp();
}
