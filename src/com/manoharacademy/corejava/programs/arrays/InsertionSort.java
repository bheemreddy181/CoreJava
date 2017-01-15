package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class InsertionSort {

    //https://en.wikipedia.org/wiki/Insertion_sort
    public static void main(String[] args) {
        int[] ai = {9, 8, 7, 3, 2, 1, 6, 5, 4, 0};
        System.out.println("Before Sorting : " + Arrays.toString(ai));
        for(int index =1 ; index <= ai.length-1; index++){
            int numberToBeInserted = ai[index];
            int comapringIndex = index-1;
            while(  comapringIndex >= 0 && ai[comapringIndex] > numberToBeInserted   ){
                ai[comapringIndex+1] = ai[comapringIndex];
                comapringIndex--;
            }
            ai[comapringIndex+1] = numberToBeInserted;            
        }
         System.out.println("After Sorting : " + Arrays.toString(ai));
        
    }

}
