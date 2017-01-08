package com.manoharacademy.corejava.programs.arrays;

import java.util.Arrays;

public class BubbleSort {

    //https://en.wikipedia.org/wiki/Bubble_sort
    public static void main(String[] args) {
        int[] ai = {5, 3, 2, 4, 1};
        System.out.println("Before Sorting : " + Arrays.toString(ai));

        for (int j = 0; j < ai.length - 1; j++) {

            for (int i = 0; i < ai.length - 1 - j; i++) {
                if (ai[i] > ai[i + 1]) {
                    ai[i] = ai[i + 1] + ai[i] - (ai[i + 1] = ai[i]);
                }
            }
            System.out.printf("At the end of iteration %d : %s\n", j + 1, Arrays.toString(ai));

        }

    }
}
