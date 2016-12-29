package com.manoharacademy.corejava.fundamentals.operators;

public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        //Precedence
        System.out.printf("1 + 2 * 3 = %d\n" , (1 + 2) * 3); //3 * 3 = 9  // 1 + 6 = 7
        //Associativity
        System.out.printf("8 / 4 / 2 = %d\n" , 8 / (4 / 2)); // 2/2 =1    // 8/2 =4   
    }
}
