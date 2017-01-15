package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class BubbleSort {

    //https://en.wikipedia.org/wiki/Bubble_sort
    public static void main(String[] args) {
        int[] ai = {5, 3, 2, 4, 1};
        System.out.println("Before Sorting : " + Arrays.toString(ai));

        for (int j = 0; j <= ai.length - 2; j++) {
            for (int i = 0; i <= ai.length - 2 - j; i++) {
                if (ai[i] > ai[i + 1]) {
                    ai[i + 1] = ai[i] + ai[i + 1] - (ai[i] = ai[i + 1]);
                }
            }
            System.out.println("By the end of iteration " + Arrays.toString(ai));
        }
    }
}
