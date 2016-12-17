package com.manoharacademy.literals;

public class Literals {
    
    public static void main(String[] args) {
        int age = 24; // int literal
        age = 25;
        
        long abc = 20000000000L;
        
        long population = 20000000000L;
        
        int score1 = 1_00;  //decimal literal 0-9
        int score2 = 0x6_4; //hexa decimal literal 0-F
        int score3 = 0b110_0100; //binary literal
        int score4 = 0144; //octal literal 0-7
        System.out.println("score1 : " + score1);
        System.out.println("score2 : " + score2);
        System.out.println("score3 : " + score3);
        System.out.println("score4 : " + score4);
        
        //320 million
        long populationOfAmerica1 = 320_000_000L;
        long populationOfAmerica  = 0b1_0011_0001_0010_1101_0000_0000_0000L;
        System.out.println("American Population : " + populationOfAmerica);
        
        //by default whole numbers we use are integer literals
        //but if want a long literal we need to append with L
        
        float interestRate1 =  3.2F;
        float interestRate2 =  .32F;
        float interestRate3 =  32.F;
        float interestRate4 =  6.022137e+23F;
        
        double hourlySalaryRate1 =  70.49;
        double hourlySalaryRate2 =  7049.;
        double hourlySalaryRate3 =  .7049;
        double hourlySalaryRate4 =  7.049e+2;
        
        //by default fractional numbers we use are double literals
        //but if want a float literal we need to append with F
        
        boolean isMinor = true;
        boolean isMajor = false;
        
        char char1 = 'A';
        char char2 = 65;
        char char3 = '\u0041';
        
        char char4 = '\'';
        
        char char5 = '\n'; //new line escape sequence
        char char6 = '\t'; //tab escapse sequence
        
        char char7 = '\\';
        
        System.out.println( " " + char1 + char7 + char2 + char4 +  char3);
    }
    
}
