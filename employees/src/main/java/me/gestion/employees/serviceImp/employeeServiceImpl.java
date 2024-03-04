package me.gestion.employees.serviceImp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import me.gestion.employees.model.Employee;
import me.gestion.employees.repo.employeeRepo;
import me.gestion.employees.service.employeeService;
import org.springframework.stereotype.Service;

@Service
public class employeeServiceImpl implements employeeService{
@Autowired
private employeeRepo employeerepo ;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  employeerepo.findAll();
		
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> e= employeerepo.findById(id);
		return e.isPresent() ? e.get() : null;
	}

	@Override
	public Employee addEmployee(Employee e) {
		return employeerepo.save(e);
	}

	@Override
	public Employee editEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeerepo.save(e);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeerepo.deleteById(id);		
	}

}
