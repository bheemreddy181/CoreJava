package com.manoharacademy.conditional_statements;

import java.util.Scanner;

public class ConditionalExecution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10 : ");
        int inputValue = scanner.nextInt();

        if (inputValue <= 5) {
            System.out.println(inputValue + " is less than or equal to 5");
        } else {
            System.out.println(inputValue + " is greater than to 5");
        }

        System.out.print("Enter a number between 1 and 30 : ");
        inputValue = scanner.nextInt();
        if (inputValue >= 1 && inputValue <= 10) {
            System.out.println(inputValue + " is between 1 and 10");
        } else if (inputValue >= 11 && inputValue <= 20) {
            System.out.println(inputValue + "  is between 11 and 20");
        } else if (inputValue >= 21 && inputValue <= 30) {
            System.out.println(inputValue + " is between 21 and 30");
        } else {
            System.out.println("The number is not between 1 and 30");
        }

        System.out.print("Enter a number between 1 and 100: ");
        inputValue = scanner.nextInt();
        
        if(inputValue % 7 == 0){
            System.out.println(inputValue + " is divisible by 7.");
            System.out.println("hi");
        }
        else{
            System.out.println(inputValue + " is not divisible by 7.");
        }
        
            

    }
}
