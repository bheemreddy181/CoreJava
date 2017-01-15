package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class SelectionSort {
//    https://en.wikipedia.org/wiki/Selection_sort
    public static void main(String[] args) {
        int[] ai = {5,3,2,4,1};
        System.out.println("Before Sorting : " + Arrays.toString(ai));
 
        for(int index = 0 ; index <= ai.length-1; index++ ){
            int minValueIndex = index;
            for(int j = 0 ; j<= ai.length -1 ; j++){
                    if(ai[j] < ai[minValueIndex]){
                        minValueIndex = j;
                    }                        
            }
            
            //swap them
            ai[index] = ai[minValueIndex] + ai[index]  - (ai[minValueIndex] = ai[index]);
            
        }

        System.out.println("Aftere Sorting : " + Arrays.toString(ai));
        

    }
    
}
