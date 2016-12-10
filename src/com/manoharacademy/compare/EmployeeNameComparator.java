package com.manoharacademy.compare;

import java.util.Comparator;
import com.manoharacademy.common.Employee;


public class EmployeeNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }

}