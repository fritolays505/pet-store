package pet.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pet.store.entity.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
