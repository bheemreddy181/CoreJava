package com.manoharacademy.corejava.arrays;

import java.util.Arrays;
import java.util.Date;

public class EnhancedForLoop {

    public static void main(String[] args) {

        int[] ai = {1, 2, 3, 4, 5};

        //Reading
        System.out.println("Using simple for loop");
        for (int i = 0; i < ai.length; i++) {
            System.out.println(ai[i]);
        }

        System.out.println("Using enhanced for loop/ for each loop");
        for( int i  : ai)
                System.out.println(i);
      
               
        //Writing to  array of primitive types
        System.out.println("Writing using simple for loop");
        for (int i = 0; i < ai.length; i++) {
            ai[i] = i * 2;
        }
        System.out.println(Arrays.toString(ai));

        System.out.println("Writing using enhanced for");
        for (int i : ai) {
            i = i * 3;
        }
        System.out.println(Arrays.toString(ai));
        
        /*
            for each
                iterate through all the elementes
                &
                we dont need to make any changes to actual array
               
             simple for loop
                partailly iterate through array
                when ever we need the index value
                when ever the elements in the array need to be modified 
        
        */

   /*  
        
        
         
        //Writing to array of reference type
        String[] stringArray = {"Manohar", "Academy"};
        System.out.println(Arrays.toString(stringArray));

        for (String s : stringArray) {
            s =  "M";
        }
        System.out.println(Arrays.toString(stringArray));
 
        Date[] dateArray = {new Date(100), new Date(100)};
        System.out.println(Arrays.toString(dateArray));

        for (Date d : dateArray) {
            d = new Date(1000000000);
        }
        System.out.println(Arrays.toString(dateArray));

        */
                
        //when to use simple for loop
        
        //when to use 
    }

}
