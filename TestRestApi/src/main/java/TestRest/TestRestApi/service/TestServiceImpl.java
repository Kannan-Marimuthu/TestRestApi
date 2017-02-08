package TestRest.TestRestApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import TestRest.TestRestApi.data.Employee;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public Employee getEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {

		List<Employee> list = new ArrayList<>();

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setEname("Kannan");

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setEname("Marimuthu");

		list.add(emp1);
		list.add(emp2);
		return list;
	}

}
