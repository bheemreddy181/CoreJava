package com.manoharacademy.lambda;

import com.manoharacademy.common.Employee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionSyntaxRules {

    public static void main(String[] args) {
        
        /* Where can we write Lambda expressions?
                Where ever an object of a Class implementing a particular 
                functional interface is required.          
        */
        
        Employee employee1 = new Employee(100, "Manohar", 10000);
        Employee employee2 = new Employee(200, "Gandhi", 20000);
        Employee employee3 = new Employee(101, "naga", 1000);
        Employee employee4 = new Employee(201, "Chandra", 100);
        Employee employee5 = new Employee(80, "Praveen", 90000);
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        
        //Lambda expression can be used as part of method input argument 
        Collections.sort(employeeList, 
                ( employee11,  employee22) ->  Double.compare(employee11.getSalary(), employee22.getSalary())
        );
        
        //Lambda expression can be assigned to a reference varible that can hold
        //given lambda expression
        Comparator<Employee> c = ( employee11,  employee22) 
        ->  Double.compare(employee11.getSalary(), employee22.getSalary());
        
        Collections.sort(employeeList, c);
        
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList.add(employee1);
        
       Collections.sort(employeeList2, c);
        
        
        
        /*
            Lamdba expression has 3 parts
            1) Method Input parameter List
            2) Arrow Symbol (->)
            3) Method Body
        
        */
        Runnable r = () -> {};
        
        /*  Lambda method Body Rule 1:
            If Lambda expression method body has multiple statments
            then
            it will be exactly same as actual method body
        */
        
        Runnable r1 = () -> 
                    {
                        for (int i = 0; i < 10; i++) {
                            System.out.println(i);
                        }
                    };
        
        ActionListener a1 = (ActionEvent e) ->
                    {
                        System.out.println(e);
                        System.out.println("End of event message");
                    };
        
        Comparator<Employee> c1 = (Employee employee11, Employee employee22)->
                    {
                        Double employee1Salary = employee11.getSalary();
                        Double employee2Salary = employee22.getSalary();
                        return Double.compare(employee1Salary, employee2Salary);
                    };
        
        /*  Lambda method Body Rule 2:
            If Lambda expression method body is a single expression
            then
            we can write the expression in place of method body
        */
        
        Runnable r2         = () -> System.out.println("HelloWorld");
        
        ActionListener a2   = (ActionEvent e) -> System.out.println(e);
        
        Comparator<Employee> c2 = (Employee employee11, Employee employee22)
                 -> Double.compare(employee11.getSalary(), employee22.getSalary());
        

        /*  Lambda method parameter list Rule 1:
            If Type of the parameter can be inferred 
            then
            parameter Type can be omitted
        
        Note: can't mix inferred and declared types
        */ 

        Runnable r3             = () -> System.out.println("HelloWorld");

        ActionListener a3       = (e) -> System.out.println(e);

        Comparator<Employee> c3 = (  employee11,   employee22)
                -> Double.compare(employee11.getSalary(), employee22.getSalary());


        /*  Lambda method parameter list Rule 2:
            If there is only one method parameter and it can be inferred
            then
            we can ommit the paranthesis around inferred parameter
        */ 
        
        ActionListener a4       =  e -> System.out.println(e);
        
    }

}
