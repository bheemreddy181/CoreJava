package com.manoharacademy.common;


public class Employee implements Comparable<Employee>{

    private final int employeeID;
    private final String name;
    private final double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
 
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", name=" + name + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee otherEmployee) {
            return Integer.compare(this.employeeID, otherEmployee.employeeID);
    }
    
    
    
    

   
}