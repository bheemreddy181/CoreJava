package com.manoharacademy.corejava.arrays;

import java.util.Arrays;

public class ArraysUtilityClass {
    public static void main(String[] args) {
        
/*
           fill
   
            toString
            deepToString

            copyOf
            copyOfRange

            sort

            binarySearch
            -------- we dont see below ones ---------
            asList
            deepEquals
            deepHashCode
            equals
            hashCode
        */
        
        int[] intArray = new int[10];
        int[][] int2DArray = new int[10][10];
//        for(int i : intArray) System.out.println(i);
        
        Arrays.fill(intArray, 10);
//        for(int i : intArray) System.out.println(i);

//        Arrays.fill(intArray, 2,4,10); 
//        for(int i : intArray) System.out.println(i);
//        //Number of elements that will be filled are 2 ( 4 - 2)
        
//        System.out.println(Arrays.toString(intArray));
//        System.out.println(Arrays.deepToString(int2DArray));
//        
//        intArray = Arrays.copyOf(intArray, 13);
//        System.out.println(Arrays.toString(intArray));
//        
//        intArray = new int[]{0,1,2,3,4,5,6,7,8,9};
//        
//        intArray = Arrays.copyOfRange(intArray, 0, 13);
//        System.out.println(Arrays.toString(intArray));
//        number of elements that will be copied is 3 - 1 = 2
        
        intArray = new int[]{2,5,3,8,6,1};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        
//       [1, 2, 3, 5, 6, 8]
        System.out.println("is 5 present in Array ? " + Arrays.binarySearch(intArray, 5));
        System.out.println("is 9 present in Array ? " + Arrays.binarySearch(intArray, 9));
//        if element is found then it returns its index
//        if element is not found then it returns -(insertion point) -1
//        if element is found  non-negative value, otherwise negative value

        
        
        
    }
}
