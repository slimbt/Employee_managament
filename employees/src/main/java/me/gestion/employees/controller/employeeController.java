package me.gestion.employees.controller;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.gestion.employees.model.Employee;
import me.gestion.employees.service.employeeService;

	@CrossOrigin("*")
	@RestController
	@RequestMapping("/employees")
	public class employeeController {
		@Autowired
		public employeeService eService;
		@GetMapping("/")
		public List<Employee> getAllEmployees() {
			return eService.getAllEmployees();
		}

		@DeleteMapping("/{x}")
		public void deleteEmployee(@PathVariable Long x) {
			eService.deleteEmployeeById(x);
		}
		@GetMapping("/{y}")
		public Employee getEmployee (@PathVariable Long y) {
			return eService.getEmployeeById(y);
		}
		@PostMapping
		public Employee addEmployee (@RequestBody Employee employee) {
			return eService.addEmployee(employee);
		}
		@PutMapping
		public Employee editEmployee(@RequestBody Employee employee) {
			return eService.addEmployee(employee);}
	}
	
	
