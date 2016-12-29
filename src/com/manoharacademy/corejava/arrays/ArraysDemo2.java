package com.manoharacademy.corejava.arrays;

import java.util.Arrays;
import java.util.Date;

public class ArraysDemo2 {

    public static void main(String[] args) {

        /*
        int[] ai = new int[5];
        
        System.out.println("Before assigning values (with default values)");
        for(int i = 0 ; i <= 4 ; i++)
         System.out.println(ai[i]);
        
        ai[0] = 10;
        ai[1] = 20;
        ai[2] = 25;
        ai[3] = 45;
        ai[4] = 56;
         */
        int[] ai = {10, 20, 25, 45, 56}; // Array Initializer
        System.out.println(Arrays.toString(ai));

        ai = Arrays.copyOf(ai, 3);
        System.out.println(Arrays.toString(ai));
//        int[] copy = new int[newLength];
//        System.arraycopy(original, 0, copy, 0,
//                Math.min(original.length, newLength));
//        return copy;

        int[] tempArray;
        tempArray = new int[]{10, 20, 25, 45, 56}; //annonymous Array



//        String[] namesArray = new String[2];
//        namesArray[0] = "Manohar";
//        namesArray[1] = "Academy";

        //String[] namesArray = {"Manohar", "Academy"};
        String[] namesArray = {new String("Manohar"), new String("Academy")};
        System.out.println(Arrays.toString(namesArray));
        
        Date[] dateArray = new Date[]{new Date(), new Date()};
         System.out.println(Arrays.toString(dateArray));

    }
}
