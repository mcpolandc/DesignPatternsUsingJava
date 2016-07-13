package com.structural.adapter.complexdemo;


import com.structural.adapter.complexdemo.newcode.Employee;
import com.structural.adapter.complexdemo.newcode.EmployeeClient;

import java.util.List;

public class ComplexAdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
