package com.practice.ems.service;

import com.practice.ems.model.Employee;
import com.practice.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional< Employee > optional = employeeRepository.findById(id);    //findById returns Optional object
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();  //get employee from the optional
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize) {
        //Note: Spring Data JPA provides page no. with a zero base.
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);   //PageRequest implements Pageable interface
        return this.employeeRepository.findAll(pageable);
    }
}
