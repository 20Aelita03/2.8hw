package com.homework28.aelita.Service;

import com.homework28.aelita.Employee;
import com.homework28.aelita.Exsception.EmployeeAlreadyAddedException;

import java.util.Collection;

public interface ServiceN{
    Employee add(String firstName, String secondName) throws EmployeeAlreadyAddedException;
    Employee delete(String firstName, String secondName);



    Employee find(String firstName, String secondName);
    Collection<Employee> showAll();
}
