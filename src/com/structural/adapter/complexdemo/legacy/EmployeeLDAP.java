package com.structural.adapter.complexdemo.legacy;

/*
*
*
*   NOTICE: We do not implement the Employee interface here
*
*       We have to assume this is legacy code that we CANNOT change
*
*       We should implement an Adapter in order for our client to use this class
*
* */

public class EmployeeLDAP {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLDAP(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

}
