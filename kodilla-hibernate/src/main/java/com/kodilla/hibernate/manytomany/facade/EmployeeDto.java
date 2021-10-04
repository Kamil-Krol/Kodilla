package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {

    private final int id;
    private final String firstname;
    private final String lastname;
    private final List<Company> companies;

    public EmployeeDto(int id, String firstname, String lastname, List<Company> companies) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.companies = companies;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
