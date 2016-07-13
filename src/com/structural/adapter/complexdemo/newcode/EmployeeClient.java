package com.structural.adapter.complexdemo.newcode;

import com.structural.adapter.complexdemo.adapters.EmployeeAdapterFromLDAP;
import com.structural.adapter.complexdemo.legacy.EmployeeLDAP;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "Joe", "Bloggs", "joe.bloggs@gmail.com");
        employees.add(employeeFromDB);

        //The statement below cannot be done because EmployeeFromLDAP does not implement the Employee interface
        //Employee employeeFromLDAP = new EmployeeLDAP("5678", "Jon", "Snow", "jon.snow@castleblack.com");

        //We should use an Adapter instead!!
        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("5678", "Jon", "Snow", "jon.snow@castleblack.com");
        employees.add(new EmployeeAdapterFromLDAP(employeeFromLDAP));

        return employees;
    }
}
