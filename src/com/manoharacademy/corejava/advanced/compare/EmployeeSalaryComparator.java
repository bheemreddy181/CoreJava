package com.manoharacademy.corejava.advanced.compare;

import java.util.Comparator;
import com.manoharacademy.corejava.common.Employee;


public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }

}