package me.gestion.employees.service;
import me.gestion.employees.model.Employee;
import java.util.List;



public interface employeeService {
	public List <Employee> getAllEmployees();
	public Employee getEmployeeById(Long id);
	public Employee addEmployee (Employee e);
	public Employee editEmployee(Employee e);
	public void deleteEmployeeById(Long id);

}
