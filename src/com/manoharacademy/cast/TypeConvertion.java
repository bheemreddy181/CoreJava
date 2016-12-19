package com.manoharacademy.cast;


public class TypeConvertion {
    public static void main(String[] args) {
        
        boolean booleanValue = true;
        char charValue = 'A';
        
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long longValue = 1L;
        
        float floatValue = 1.0F;
        double doubleValue = 1.0;
        
        // TYPE CONVERTIONS WITH IN WHOLE NUMBERS AND  WITH IN FLOATING NUMBERS
        
        //Implicit convertions from low range/precision to high range/precision
        shortValue = byteValue; //byte to short, int and long 
        intValue = shortValue;  //short to int and long
        longValue = intValue;   //int to long
        
        doubleValue = floatValue;
        

        
        //Explicit convertion or cast from high range/precision to low range/precision
        byteValue = (byte) shortValue;
        shortValue = (short) intValue; // short and byte
        intValue = (int) longValue; // int, short and byte
        
        floatValue = (float) doubleValue;
        
        System.out.println((byte) 120);
        System.out.println((byte) 20000);
        
        // TYPE CONVERTIONS ACROSS WHOLE NUMBERS AND FLOATING NUMBERS
        
        //floating type to integer(all 4) is always explicit cast
        longValue = (long) floatValue; //1.2f
        longValue = (long) doubleValue; //1.2
        
        //Integer type to floating point is always implicit with loss of precision
        //**with exception of int to double
        
        //Implicit convertion with loss of precision
        floatValue = intValue;
        doubleValue = intValue; //** double(15 or 16 bit precision) and int(only 10 digits)
        
        
        floatValue = longValue;        
        doubleValue = longValue;
        

    }
}
