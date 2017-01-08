package com.manoharacademy.corejava.programs.fundamentals;

public class PrintFirstTenMathTables {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            //print the ith table.
            for (int j = 1; j <= 20; j++) {
                //in ith table print 10 rows using value of j
                System.out.printf("%2d  x %2d = %3d\n", j, i, i * j);
            }
            System.out.println("");

        }
    }
}
