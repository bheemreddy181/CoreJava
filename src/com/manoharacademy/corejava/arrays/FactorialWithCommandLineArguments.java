package com.manoharacademy.corejava.arrays;

import java.util.Scanner;

public class FactorialWithCommandLineArguments {
    
    public static void main(String[] args) {
        int inputValue;
        
        if(args.length > 0 ){
            inputValue = Integer.parseInt(args[0]) ;
        }else{
            System.out.print("Please enter a number between 1 and 10 : ");
            Scanner scanner = new Scanner(System.in);
            inputValue = scanner.nextInt();
        }
        
        int product = 1;
        for(int i = 1; i <= inputValue ; i++ )
                product *= i;
        
        System.out.printf("The value of %d factorial is %d\n", inputValue,product);
            
    }
    
}
