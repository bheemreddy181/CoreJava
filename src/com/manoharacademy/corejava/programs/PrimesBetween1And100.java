package com.manoharacademy.corejava.programs;


public class PrimesBetween1And100 {
    public static void main(String[] args) {
//        https://en.wikipedia.org/wiki/Prime_number
        
        System.out.println("1 is not prime. Prime number should be greater than 1.");
        System.out.println("2 is prime. In fact it is the only even prime number.");
        
        for(int i = 3 ; i <= 100 ; i++){
            
            //assuming i is prime
            boolean isPrime = true;
            //looping through to see if i has any divisors
            for(int j = 2 ; j<= i/j ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }                    
            }  
//            System.out.println(i+ (isPrime?" is ":" is not ") + "a prime.");
            if(isPrime) System.out.println(i);
            

            
        }
    }
    
}
