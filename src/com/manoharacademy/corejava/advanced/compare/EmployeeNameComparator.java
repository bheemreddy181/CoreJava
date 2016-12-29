package com.manoharacademy.corejava.advanced.compare;

import java.util.Comparator;
import com.manoharacademy.corejava.common.Employee;


public class EmployeeNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }

}