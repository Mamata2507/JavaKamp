package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}
