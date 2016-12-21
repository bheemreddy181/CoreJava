package com.manoharacademy.promotion;

public class NumericPromotion {

    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long longValue = 1L;
        
        float floatValue = 1.0F;
        double doubleValue = 1.0;
        
        
        byte byteValue1 = 1;
        byte byteValue2 = 1;
        
        byte byteValue3 = 1 + 1;
        
        byteValue1 = (byte) (byteValue1 + byteValue2);
        
        byteValue1 += byteValue2;
        
        
        
//        
         byteValue3 = (byte)(byteValue3 + 1);
         byteValue3++;
         
//        
       doubleValue = doubleValue + longValue;
        floatValue = floatValue + longValue;
        longValue = longValue + intValue;
//        
//        byteValue = intValue + byteValue;
//        byteValue = intValue + shortValue;
        
//    • If either operand is of type double, the other is converted to double.
//    • Otherwise, if either operand is of type float, the other is converted to float.
//    • Otherwise, if either operand is of type long, the other is converted to long.
//    • Otherwise, both operands are converted to type int
        
        
    
    }
}
