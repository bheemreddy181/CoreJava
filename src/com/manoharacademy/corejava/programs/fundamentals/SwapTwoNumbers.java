package com.manoharacademy.corejava.programs.fundamentals;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        
        secondNumber = firstNumber + secondNumber - (firstNumber = secondNumber);
        
//        int temp = secondNumber;
//        secondNumber = firstNumber;
//        firstNumber = temp;
        // it is possible to write this expression as expression evaluate 
        //from left to right.

        System.out.println(firstNumber);
        System.out.println(secondNumber);
                
    }
}


