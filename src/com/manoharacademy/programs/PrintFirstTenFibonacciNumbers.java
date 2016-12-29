package com.manoharacademy.programs;

public class PrintFirstTenFibonacciNumbers {
    public static void main(String[] args) {
//        https://en.wikipedia.org/wiki/Fibonacci_number
        int i = 0;
        int j = 1;
        System.out.println("0\n1");

        for(int k=1 ; k <= 8 ; k++){
            System.out.println(i+j);
            j = i + (i=j); 
            // it is possible to write this expression as expression evaluate 
//            from left to right.
            
        }
    }
}
