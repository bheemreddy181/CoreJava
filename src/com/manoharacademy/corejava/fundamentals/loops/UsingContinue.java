package com.manoharacademy.corejava.fundamentals.loops;

import java.util.Scanner;

public class UsingContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int inputValue = scanner.nextInt();

        for (int i = 1; i <= inputValue; i++) {
            System.out.println("-------------------------------");
            System.out.println("first step in current iteration");
            System.out.println(i);
            //if some condition is met we want to skip next steps in current iteration
            
            if( i % 2 == 0) continue;
            System.out.println("last step in current iteration");
        }
        System.out.println("-------------------------------");
        System.out.println("First statement after loop.");
    }

}
