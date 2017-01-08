package com.manoharacademy.corejava.programs.fundamentals;

import java.util.Scanner;

public class CheckForPrimeNumber {

    public static void main(String[] args) {
        //In this program we are going to check whether a given number is prime or not

//      A prime number (or a prime) is a natural number greater than 1 
//      that has no positive divisors other than 1 and itself
//      we are using trial division method. it is inefficient
//      It consists of testing whether n is a multiple of any integer between 2 and sqrt {n}.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        int inputValue = scanner.nextInt();

        boolean isPrime = true;

        if (inputValue % 2 == 0) {
            isPrime = false;
        }

        for (int i = 3; i <= inputValue / i && isPrime == true; i += 2) {
            System.out.println("Checking whether input value is divisible by " + i);
            if (inputValue % i == 0) {
                isPrime = false;
                //break;
            }
        }

        if (isPrime) {
            System.out.println(inputValue + " is a prime number.");
        } else {
            System.out.println(inputValue + " is not a prime number.");
        }

    }
}
