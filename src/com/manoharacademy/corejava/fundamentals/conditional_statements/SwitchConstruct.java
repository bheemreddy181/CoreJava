package com.manoharacademy.corejava.fundamentals.conditional_statements;

import java.util.Scanner;


public class SwitchConstruct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 12 : ");
        int inputValue = scanner.nextInt();
        
        if(inputValue >= 1 && inputValue <= 6){
            System.out.println(inputValue + " is between 1 and 6.");
        }else if(inputValue >= 7 && inputValue <= 12){
            System.out.println(inputValue + " is between 7 and 12.");
        }else {
            System.out.println(inputValue + " is not between 1 and 12.");
        }
        
        System.out.println("=================================================");
        
        if(inputValue == 1) System.out.println("Jan");
        else if(inputValue == 2) System.out.println("Feb");
        else if(inputValue == 3) System.out.println("Mar");
        else if(inputValue == 4) System.out.println("Apr");
        else if(inputValue == 5) System.out.println("May");
        else if(inputValue == 6) System.out.println("June");
        else if(inputValue == 7) System.out.println("July");
        else if(inputValue == 8) System.out.println("Aug");
        else if(inputValue == 9) System.out.println("Sep");
        else if(inputValue == 10) System.out.println("Oct");
        else if(inputValue == 11) System.out.println("Nov");
        else if(inputValue == 12) System.out.println("Dec");
        else System.out.println("Invalid Month.");
        
        System.out.println("=================================================");
        
        switch (inputValue) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid Month.");
                break;
        }
        
        System.out.println("=================================================");
        
        //https://en.wikipedia.org/wiki/Season	 
        //For temperate areas in the northern hemisphere, 
        //	spring begins on 1 March, 
        //	summer on 1 June, 
        //	autumn on 1 September, and 
        //	winter on 1 December. 
        
        if(inputValue == 3 || inputValue == 4 || inputValue == 5)
            System.out.println("Spring.");
        else if(inputValue == 6 || inputValue == 7 || inputValue == 8)
            System.out.println("summer.");
        else if(inputValue == 9 || inputValue == 10 || inputValue == 11)
            System.out.println("Autumn.");
        else if(inputValue == 12 || inputValue == 1 || inputValue == 2)
            System.out.println("Winter.");
        else System.out.println("Invalid Month.");
        
        switch (inputValue) {
            case 3:
            case 4:
            case 5:
                System.out.println("Spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn.");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter.");
                break;
            default:
                System.out.println("Invalid Month.");
                break;
        }
        
        //Switch case using grades from 1 to 5 
//        5 is best
//                4 is good
//                        3,2 needs improvement
//                                1 needs re-evaluation
        System.out.println("Please enter a value between 1 and 5:");
        inputValue = scanner.nextInt();
        
        switch(inputValue){
            case 5: System.out.println("Best.");
                    break;
            case 4: System.out.println("Good.");
                    break;
            case 3:
            case 2:System.out.println("Needs Improvement.");
                    break;
            case 1: System.out.println("Needs re-evaluation.");
                    break;
            default: 
                    System.out.println("Grade is not on the scale of 1 to 5.");
                    break;

        }
        
        
        //execution of statements in a switch block "falls through labels."
        //case labels should be compatable with case expression
        //Expression must be char, byte, short, int, String, or an enum type
        //No two of the case constants can be same
        //can not have case with null
        //only one default case statement 
        
        
        char char1 = 'A';
        String greeting = "Morning";
        Direction northDirection = Direction.NORTH;
        
        switch(northDirection){
            case NORTH:
                System.out.println("");
                break;
                
            case SOUTH:
                System.out.println("");
                break;
            default:
                System.out.println("");
                break;
        }
        
    }
}

enum Direction{
    NORTH,SOUTH,EAST,WEST
}
