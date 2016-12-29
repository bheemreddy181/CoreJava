package com.manoharacademy.arrays;

import java.util.Date;

public class ArraysDemo {
    public static void main(String[] args) {
        int j;
        j = 10;
        
        int[] ai = new int[5];
        
        System.out.println("Before assigning values (with default values)");
        for(int i = 0 ; i <= 4 ; i++)
         System.out.println(ai[i]);
        
        ai[0] = 10;
        ai[1] = 20;
        ai[2] = 25;
        ai[3] = 45;
        ai[4] = 56;
        
        System.out.println("After assigning values ");
        for(int i = 0 ; i <= 4 ; i++)
         System.out.println(ai[i]);
        
        System.out.println("After assigning values using length");
        for(int i = 0 ; i < ai.length ; i++) //i <= ai.length-1
         System.out.println(ai[i]);
        
        int[] tempArray = new int[10];
        for(int i = 0 ; i < ai.length ; i++) //i <= ai.length-1
            tempArray[i] = ai[i];
        
        System.out.println("temporary array after copying values");
        for(int i = 0 ; i < tempArray.length ; i++) //i <= ai.length-1
         System.out.println(tempArray[i]);
        
        tempArray[5] = 55;
        tempArray[9] = 100;
        System.out.println("temporary array after copying values & assinging 2 other values");
        for(int i = 0 ; i < tempArray.length ; i++) //i <= ai.length-1
         System.out.println(tempArray[i]);
        
        ai = tempArray;
        System.out.println("After making ai point to new array");
        for(int i = 0 ; i < ai.length ; i++) //i <= ai.length-1
         System.out.println(ai[i]);
        
        tempArray = null;
        
        String[] namesArray = new String[2];
        namesArray[0] = "Manohar";
        namesArray[1] = "Academy";
        for(int i = 0 ; i<= namesArray.length -1 ; i++)
               System.out.println(namesArray[i]);
        
        
        
        
        
        
        
        
        
    }
}
