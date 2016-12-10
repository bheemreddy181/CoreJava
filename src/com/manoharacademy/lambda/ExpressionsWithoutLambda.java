package com.manoharacademy.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import com.manoharacademy.common.Employee;

public class ExpressionsWithoutLambda {

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
        

        Collections.sort(employeeList, new EmployeeSalaryComparator());
        printMessage("Employee List after sort by salary");
        employeeList.forEach(System.out::println);
        
        new Thread( new PrintingRunnable()).start();
        
        new Timer(1000, new SimpleActionListner()).start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExpressionsWithoutLambda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    private static void printMessage(String message) {
        System.out.printf("==================== %s =====================\n", message);
    }

}

class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee1.getSalary(), employee2.getSalary());
    }
}


class PrintingRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

class SimpleActionListner implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }
    
}