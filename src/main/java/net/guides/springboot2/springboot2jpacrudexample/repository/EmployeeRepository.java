package net.guides.springboot2.springboot2jpacrudexample.repository;


import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Titus Murithi Bundi
 */
//This interface is used to access the Employee's data from the database.
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
