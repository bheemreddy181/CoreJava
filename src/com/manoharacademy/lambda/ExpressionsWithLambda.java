package com.manoharacademy.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import com.manoharacademy.common.Employee;

public class ExpressionsWithLambda {

    public static void main(String[] args) {
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
        

        Collections.sort(employeeList, 
                ( employee11,  employee22) ->  Double.compare(employee11.getSalary(), employee22.getSalary())
        );
        printMessage("Employee List after sort by salary");
        employeeList.forEach(System.out::println);
        
        new Thread( ()-> {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        }).start();
        
        new Timer(1000, e -> System.out.println(e) ).start();
        new Timer(1000, System.out::println ).start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExpressionsWithLambda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private static void printMessage(String message) {
        System.out.printf("==================== %s =====================\n", message);
    }

}
