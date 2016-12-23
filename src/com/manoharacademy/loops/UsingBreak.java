package com.manoharacademy.loops;

import java.util.Scanner;

public class UsingBreak {
    public static void main(String[] args) {
//        In this lesson we are going to see where to use a break statement

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number : ");
        int inputValue = scanner.nextInt();
        
        boolean isPrime = true;
        
        
        if(inputValue % 2 == 0){
            isPrime = false;
        }
        
        for(int i = 3; i <= inputValue/i & isPrime == true; i = i+2){
            System.out.println("tring to find out if it is divisible by " + i);
            if( inputValue % i == 0){
                isPrime = false;
            }           
        }
        
        if(isPrime){
            System.out.println(inputValue + " is a prime number.");
        }else {
            System.out.println(inputValue + " is not a prime number.");
        }
            
    }
}
