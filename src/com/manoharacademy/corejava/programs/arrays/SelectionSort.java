package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class SelectionSort {
//    https://en.wikipedia.org/wiki/Selection_sort
    public static void main(String[] args) {
        int[] ai = {5,3,2,4,1};
        
        for(int i = 0; i < ai.length ; i++){
            int minValueIndex=i;
            for (int j = i+1; j < ai.length; j++) {
                if(ai[j] < ai[i]){
                    minValueIndex = j;
                }
            }            
            ai[i] = ai[minValueIndex] + ai[i] - (ai[minValueIndex] = ai[i]);
        }
        System.out.println(Arrays.toString(ai));
    }
    
}
