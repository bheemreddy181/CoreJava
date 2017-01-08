package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class InsertionSort {
    //https://en.wikipedia.org/wiki/Insertion_sort
    public static void main(String[] args) {
        int[] ai = {9,8,7,3,2,1,6,5,4,0};
        int currentElement;
        
        int temp;
        
        for(int i=1; i<ai.length; i++){
            currentElement = ai[i];
            int comparingIndex = i-1;
            while(comparingIndex >= 0 && currentElement < ai[comparingIndex]   ){
                ai[comparingIndex+1] = ai[comparingIndex];                        
                comparingIndex--;
            }
            ai[comparingIndex+1] = currentElement;
        }
        
        System.out.println(Arrays.toString(ai));
    }
    
}
