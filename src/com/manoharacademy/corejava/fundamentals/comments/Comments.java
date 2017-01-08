/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manoharacademy.corejava.fundamentals.comments;

/**
 *
 * @author nncma
 */
public class Comments {
    
    public static void main(String[] args) { // \u005b is [ , \u005d is ]
        
        //Single line comments
        
        int index = 0; // Index used for looping
        for( ; index <= 10 ; index++)
               System.out.println(index);
          
        int loanTerm = 24; //lt is loan Term
        
        /*
        Multiline
        comments
        as manu lines
        as you want
        \u000a
        
        */
        
        //single line comment error :: newline character ::   manohar \u000a
        //single line comment error :: code unit error   :: find in directory \u0000 to \uffff
        
        
        
        //comments do not nest  /*
         int i =  34;   /*you can 
        write 
        any thig her
          //singleline comment
        */
    }
    
}
