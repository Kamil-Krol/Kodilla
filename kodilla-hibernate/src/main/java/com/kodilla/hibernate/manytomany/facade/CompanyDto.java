package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {

    private final int id;
    private final String name;
    private final List<EmployeeDto> employeeDtos;

    public CompanyDto(int id, String name, List<EmployeeDto> employeeDtos) {
        this.id = id;
        this.name = name;
        this.employeeDtos = employeeDtos;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<EmployeeDto> getEmployeeDtos() {
        return employeeDtos;
    }
}
