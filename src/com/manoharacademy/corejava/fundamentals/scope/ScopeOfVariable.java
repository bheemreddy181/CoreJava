package com.manoharacademy.corejava.fundamentals.scope;

public class ScopeOfVariable {

    public static void main(String[] args) {
        int i1 = 2;
        //we can not use the value of un-initialized variable 
        //we can not create duplicate variable in same scope
        //method parameters are in scope inside method body

        {
            int i2;
            //you can nest blocks inside blocks
        }
        //a vairable declared inside a inner block is not visible outside in outer block
        {
            //we can not create duplicate variable inside inner block
        }

        //Just like method input parameters, for loop initialized parameters are visible
        //inside for loop, but not outside for block
        //parameters defined inside do block are not visible in while expression
        //paramters defined inside try block are not visible in catch and finally blocks
    }
    
    //editbox plugin for eclipse
    //BlueJ editor
}
