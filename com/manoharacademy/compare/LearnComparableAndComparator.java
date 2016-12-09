package com.manoharacademy.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.manoharacademy.common.Employee;

public class LearnComparableAndComparator {

    public static void main(String[] args) {
        Employee employee1 = new Employee(100, "Manohar", 10000);
        Employee employee2 = new Employee(200, "Gandhi", 20000);
        Employee employee3 = new Employee(101, "naga", 1000);
        Employee employee4 = new Employee(201, "Chandra", 100);
        Employee employee5 = new Employee(80, "Praveen", 90000);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(101);
        integerList.add(201);
        integerList.add(80);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        
        printMessage("Integer List before sort");
        integerList.forEach(System.out::println);
        
        Collections.sort(integerList);
        printMessage("Integer List after sort");
        integerList.forEach(System.out::println);
        
        printMessage("Employee List before sorting");
        employeeList.forEach(System.out::println);
        
        Collections.sort(employeeList);
        printMessage("Employee List after sort");
        employeeList.forEach(System.out::println);
        
        Collections.sort(employeeList, new EmployeeSalaryComparator());
        printMessage("Employee List after sort by Salary");
        employeeList.forEach(System.out::println);
        
        Collections.sort(employeeList, new EmployeeSalaryComparator().reversed());
        printMessage("Employee List after sort by Salary(in reverse order");
        employeeList.forEach(System.out::println);
        
        Collections.sort(employeeList, new EmployeeNameComparator());
        printMessage("Employee List after sort by Name");
        employeeList.forEach(System.out::println);
        
        Collections.sort(employeeList, (employee11,employee22) -> employee11.getName().compareToIgnoreCase(employee22.getName()) );
        printMessage("Employee List after sort by Name(ignoring Case)");
        employeeList.forEach(System.out::println);
        
        
        //
        
        

    }

    private static void printMessage(String message) {
        System.out.printf("==================== %s =====================\n", message);
    }

}
