package org.test;

import org.employee.dto.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.employee.dao.EmployeeDAO;

import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("configTestEmployee.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");

//        Employee employee = new Employee();
//        employee.setId(2);
//        employee.setFirstName("John");
//        employee.setLastName("McCortney");

//        int result = dao.create(employee);
//        int result = dao.update(employee);
//        int result = dao.delete(2);
//        System.out.println("Number of records = " + result);
//        System.out.println("Number of updates = " + result);
//        System.out.println("Number of deleted items = " + result);

        List<Employee> employees = dao.readAll();
        System.out.println("Employee records: " + employees);
    }
}
