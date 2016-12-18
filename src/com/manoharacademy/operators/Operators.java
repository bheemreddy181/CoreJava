/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manoharacademy.operators;

/**
 *
 * @author nncma
 */
public class Operators {
    
    public static void main(String[] args) {

//        We will discuss Integer and Float operators in this class
//                
//	Assignment Operator
        int int1 = 21;
        int1 = 22;
     
        
        boolean bool1 = true;
//        
//
//	Additive Operators
//		i1 = i1 + 2;
//		i1 = i1 - 2;
        int studentsInClass1 =  23;
        int studentsInClass2 =  22;
        int totalStudents  = studentsInClass1 + studentsInClass2;
        
        int amoutIOweYou = 34;
        int amountYouOweMe = 56;
        
        int netAmountYouOweMe = amountYouOweMe - amoutIOweYou;        

        
//		
//	multiplicative operators
//		
//		i1 = i1 * 2;
//		i1 = i1 / 2;
//		i1 = i1 % 2; // modulus operator

        int i1 = 7;
        int i2 = 12;
        int resultOfMultiplication = i1 * i2;
        int resultOfDivision = i1 / i2;
        int resultOfModulus  = i1 % i2;
        System.out.printf("%d * %d = %d\n", i1, i2, i1*i2);
        System.out.printf("%d / %d = %d\n", i1, i2, i1/i2);
        System.out.printf("%d %% %d = %d\n", i1, i2, i1%i2);
//		
//	uniary + or - operator
//	
//		i1 = +i1;
//		i2 = -i2;

//               2 * +1 = 2
//               2 * -1 = -2;

        int positiveNumber =  24;
        int positiveNumber2 = +positiveNumber;
        int negativeNumber = -positiveNumber;
        
        System.out.println("positiveNumber2 = " + positiveNumber2);
        System.out.println("negativeNumber = " + negativeNumber);
//	
//	Comparison operators
//	
//		int i1 = 10;
//		int i2 = 10;
//		
//		i1 == i2
//		i1 != i2
//		
//		i1 < i2
//		i1 <= i2
//		i1 < i2
//		i1 >= i2

            int firstComparisonOperand = 11; 
            int secondComparisonOperand = 10;
            
            System.out.printf("%d == %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand == secondComparisonOperand);
            
            System.out.printf("%d != %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand != secondComparisonOperand);
            
            System.out.printf("%d < %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand < secondComparisonOperand);
            
            System.out.printf("%d <= %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand <= secondComparisonOperand);
            
            System.out.printf("%d > %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand > secondComparisonOperand);
            
            System.out.printf("%d >= %d :: %b\n",
                    firstComparisonOperand,
                    secondComparisonOperand,
                    firstComparisonOperand >= secondComparisonOperand);
            
            boolean result =  firstComparisonOperand == secondComparisonOperand;
            System.out.println("result is " + result);
            
//		
//	increment operator
//		prefix increment operator
//			++i1; (increment and then use)
//		postfix increment operator
//			i1++; (use and then increment)
//	

        int increasingIndex = 0;
        increasingIndex = increasingIndex + 1; //1
        increasingIndex++; //the value of expression is 1; after statement it is 2;
        ++increasingIndex; //the value of expression is 3; after statement it is 3;
        System.out.println("increasingIndex current value = " + increasingIndex);
        
        int increasingIndex2 = increasingIndex;
        int increasingIndex3 = increasingIndex;
        
        
        System.out.println("with postfix = " + increasingIndex2++);
        System.out.println("with prefix = " + ++increasingIndex3 );
        
        System.out.println("After 2 statements are executed they are "+
                increasingIndex2 + " and " + increasingIndex3);
        
        
        
//	decrement operator
//		prefix decrement operator
//			++i1;
//		postfix decrement operator
//			++i1;

        int decreasingIndex = 10;
        decreasingIndex = decreasingIndex - 1; //9
        decreasingIndex--; //the value of expression is 9; after statement it is 8;
        --decreasingIndex; //the value of expression is 7; after statement it is 7;
        System.out.println("decreasingIndex current value = " + decreasingIndex);
        
        int decreasingIndex2 = decreasingIndex;
        int decreasingIndex3 = decreasingIndex;
        
        
        System.out.println("with postfix = " + decreasingIndex2--);
        System.out.println("with prefix = " + --decreasingIndex3 );
        
        System.out.println("After 2 statements are executed they are "+
                decreasingIndex2 + " and " + decreasingIndex3);
        
//			
//	Compound Assignment Operator
//		+= -= *= /= %=
//		

        int baseValue = 10;
        int incrementalValue = 2;
        
        baseValue = baseValue + incrementalValue;
        //below statement is same as above one
        baseValue += incrementalValue;
        //to be precise a += b is equal to a = (int) (a+b);
        

//	shift operators (signed and unsigned)
//		I will cover in different lesson
//		>>
//		>>>
//		<<
//	
//	integer bitwise operators
//		I will cover in different lesson
//		& ^ |
//	
//	bitwise complement operator
//		I will cover in different lesson
//		~
//          ternary operator
//          ? :: 

    }
    
}
