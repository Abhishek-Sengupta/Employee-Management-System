package com.practice.ems.repository;

import com.practice.ems.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//    JpaRepository exposes CrudRepository operations
}
