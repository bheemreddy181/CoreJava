package com.manoharacademy.corejava.fundamentals.loops;

import java.util.Scanner;

public class UsingBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int inputValue = scanner.nextInt();

        for (int i = 1; i <= inputValue; i++) {
            System.out.println("-------------------------------");
            System.out.println("first step in current iteration");
            System.out.println(i);
            //if some condition is met we want to terminate while loop
            //hence we skip 1)next steps in current iteration  2)remaining iterations.
            
            if(i == 7){
                break;
            }

            System.out.println("last step in current iteration");
        }

        System.out.println("First statement after loop.");
    }
}
