package com.ztaticvienn.controller.comparator;

import com.ztaticvienn.controller.entities.Employee;

import java.util.Comparator;

/**
 * Created by mike on 03.06.14.
 */
public class EmployeeNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
