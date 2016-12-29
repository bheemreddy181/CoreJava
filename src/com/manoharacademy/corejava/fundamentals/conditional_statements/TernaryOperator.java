package com.manoharacademy.corejava.fundamentals.conditional_statements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        
        //Ternary Operator is also called Conditional operator
        //(boolean) ? expression 1 : expression 2
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive or negative number : ");
        int inputValue = scanner.nextInt();
        
        if(inputValue < 0){
            inputValue = -inputValue;
        }
            
       inputValue = (inputValue<0) ? -inputValue : inputValue;
       
        System.out.println("The corresponding positive number is :" 
                + ((inputValue<0)?-inputValue:inputValue));
       
       
       // if one expression is double and other expression is int result is double       
//       inputValue = (true) ?  4.4F : 5;

        //the first expression and second expression should be type compatable.
//       inputValue = (true) ? 4 : true;
       

        
        
        System.out.print("Enter a positive number between 1 and 10 : ");
        inputValue = scanner.nextInt();
        
        if(inputValue % 2 == 0){
            System.out.println(inputValue + "is divisible by 2");
        }
        else{
            System.out.println(inputValue + "is not divisible by 2");
        }
        
         
        System.out.println(inputValue 
                + ( (inputValue % 2 == 0) ? " is " : " is not ") 
                + "divisible by 2");
        
//        from Java Language specifiation
//        The conditional operator is syntactically right-associative (it groups right-to-left)
//         a?b:c?d:e?f:g means the same as a?b:(c?d:(e?f:g)).

            
    }
}
