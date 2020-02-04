package org.employee.dao;

import org.employee.dto.Employee;

import java.util.List;

public interface EmployeeDAO {
    int create(Employee employee);
    int update(Employee employee);
    int delete(long id);
    Employee read(long id);
    List<Employee> readAll();
}
