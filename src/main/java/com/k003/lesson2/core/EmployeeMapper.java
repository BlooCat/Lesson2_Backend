
package com.k003.lesson2.core;

import com.k003.lesson2.object.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Employee employee = new Employee();
        employee.setId_Employee(resultSet.getInt("ID"));
        employee.setFirstName_Employee(resultSet.getString("FIRST_NAME"));
        employee.setLastName_Employee(resultSet.getString("LAST_NAME"));
        employee.setAddress_Employee(resultSet.getString("ADDRESS"));
        return employee;
    }
}
