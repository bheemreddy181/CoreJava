package com.manoharacademy.corejava.fundamentals.loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int userReponse;
        
        System.out.print("Enter your pin Number : ");
        userReponse = scanner.nextInt();
        
        do{
            System.out.print("Enter the amount : ");
            userReponse = scanner.nextInt();
            System.out.println("Transaction Successful.");
            System.out.print("Do you want to make another Transaction ( 1= Yes 0 = No) : ");
            
        }while(scanner.nextInt() == 1);
        
//        while(true){
//            System.out.println("Dummy message");
//            break;
//        }
//        
//        do{
//            
//        }while(true);
        
    }
    
}
