package com.structural.adapter.complexdemo.adapters;


import com.structural.adapter.complexdemo.newcode.Employee;
import com.structural.adapter.complexdemo.legacy.EmployeeLDAP;

public class EmployeeAdapterFromLDAP implements Employee {

    private EmployeeLDAP instance;

    public EmployeeAdapterFromLDAP(EmployeeLDAP inst) {
        this.instance = inst;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    /*
    *
    *   Some may say that overriding the base toString here is getting into the realms of the Decorator pattern
    *
    *   Others may say that this code will make the structural output the same as our new Employee and therefore is still within the Adapter pattern
    *
    * */

    public String toString() {
        return "ID: " + instance.getCn() + ", FirstName: " + instance.getGivenName() + ", LastName: " + instance.getSurname() + ", Email: " + instance.getMail();
    }

}
