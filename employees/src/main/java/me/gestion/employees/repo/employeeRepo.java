package me.gestion.employees.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import me.gestion.employees.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<Employee, Long>{ 

}
