package com.manoharacademy.corejava.arrays;

public class CommandLineArguments {

    public static void main(String[] args) {
        
        if(args.length > 0 ){
        System.out.println("Printing using enhanced for loop");
        for (String s : args) {
            System.out.println(s);
        }
        
        System.out.println("Printing using simple for loop");
        for (int i = 0 ; i <= args.length-1 ; i++) {
            System.out.println("Argument at index "+i+" is : " + args[i]);
        }
        }
    }

}
