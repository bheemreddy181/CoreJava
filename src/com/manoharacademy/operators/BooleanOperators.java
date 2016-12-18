package com.manoharacademy.operators;

public class BooleanOperators {

    public static void main(String[] args) {
        //In this lesson we are going to discuss Boolean Operators

        
        //Relational Operaors	== 	!=
        System.out.printf(" (2 == 2) = %b\n", 2 == 2);
        System.out.printf(" (2 != 2) = %b\n", 2 != 2);

        //Logical Complement	!
        boolean boolean1 = true;
        printSeperator("");
        System.out.printf("The complement of true is %b.\n", !boolean1);
        System.out.printf("The complement of false is %b.\n", ! !boolean1);

        //Logical & | ^
        
        //f
        /*
            true & ture = true (*)
            ture & false = false
            false & true = false
            false & false = false
        
            true | true = true
            true | false = true
            false | true = true
            false | false = false
        
            true ^ true = false
            true ^ false = true
            false ^ true = true
            false ^ false = false
        */
        printSeperator("Below one is truth table for &");
        System.out.printf("%5b & %7b = %7b\n", true , true, true & true);
        System.out.printf("%5b & %7b = %7b\n", true , false, true & false);
        System.out.printf("%5b & %7b = %7b\n", false , true, false & true);
        System.out.printf("%5b & %7b = %7b\n", false , false, false & false);
        
        
        printSeperator("Below one is truth table for |");
        System.out.printf("%5b | %7b = %7b\n", true , true, true | true);
        System.out.printf("%5b | %7b = %7b\n", true , false, true | false);
        System.out.printf("%5b | %7b = %7b\n", false , true, false | true);
        System.out.printf("%5b | %7b = %7b\n", false , false, false | false);
        
        printSeperator("Below one is truth table for ^");
        System.out.printf("%5b ^ %7b = %7b\n", true , true, true ^ true);
        System.out.printf("%5b ^ %7b = %7b\n", true , false, true ^ false);
        System.out.printf("%5b ^ %7b = %7b\n", false , true, false ^ true);
        System.out.printf("%5b ^ %7b = %7b\n", false , false, false ^ false);
        
         //Conditional And, OR	&& ||
        boolean accountIsActive = true;
        boolean enoughBalanceAvailable = true;
        printSeperator("&&");
        System.out.printf("%5b && %7b = %7b\n", accountIsActive , enoughBalanceAvailable
                , accountIsActive && enoughBalanceAvailable);
        //Condiational And :: if first expression is false, it wont look at next expression
        
        boolean sufficientBalanceAvailable = true;
        boolean overDraftAllowed = false;
        printSeperator("||");
        System.out.printf("%5b || %7b = %7b\n", sufficientBalanceAvailable , overDraftAllowed
                , sufficientBalanceAvailable || overDraftAllowed);
        
    }

    private static void printSeperator(String message) {
        System.out.println("================  " + message + "  =====================");
       
    }
}
