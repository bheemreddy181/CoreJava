package com.manoharacademy.enumeration;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class LearnEnums {
    
    public static void main(String[] args) {
        
        Color redColor = Color.RED;
        Color greenColor = Color.GREEN;
        Color blueColor = Color.BLUE;
        Color blackColor = Color.BLACK;
        Color whiteColor = Color.WHITE;
        

                
        System.out.println(redColor);
        System.out.println(greenColor);
        System.out.println(blueColor);
        System.out.println(blackColor);
        System.out.println(whiteColor);
        
        Color whiteColor2 = Color.valueOf("WHITE");
        Color blueColor2 = Enum.valueOf(Color.class, "BLUE");
        
        System.out.println(whiteColor2);
        System.out.println(blueColor2);
        
        if (whiteColor == whiteColor2) System.out.println("They are same");       
        
        if (blueColor == blueColor2) System.out.println("They are same");       
        
        if(blueColor.equals(blueColor2)) System.out.println("they are same");
        
        System.out.println(whiteColor.ordinal());
        
        for (Month m : Month.values()) {
            System.out.println("" + m + m.ordinal());
        }
        
        for (Month m : Month.values()) {
            Month nextMonth = m.plus(1);
            System.out.println("" + m + "(next month is " + nextMonth + ")"  );
        }
        
        LocalDate NewYearEveIn2000 = LocalDate.of(2000,Month.JANUARY,1);
        LocalDate NewYearEveIn2017 = LocalDate.of(2017,Month.JANUARY,1);
        
        System.out.println("Number of days between 2 dates is" 
                + ChronoUnit.DAYS.between(NewYearEveIn2000, NewYearEveIn2017));
        
        System.out.println("Number of weeks between 2 dates is" 
                + ChronoUnit.WEEKS.between(NewYearEveIn2000, NewYearEveIn2017));
        
        System.out.println("Number of years between 2 dates is" 
                + ChronoUnit.YEARS.between(NewYearEveIn2000, NewYearEveIn2017));
        
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                DayOfWeek nextDayOfWeek = dayOfWeek.plus(1);
                System.out.println("" + dayOfWeek + " Next day is : " + nextDayOfWeek);
        }
    } 
    

}


enum Direction {
    EAST,WEST,NORTH,SOUTH;    
}

enum Color{
    
    RED("Red",255,0,0),
    GREEN("Green",0,255,0),
    BLUE("Blue",0,0,255),
    BLACK("Black",0,0,0),
    WHITE("White",255,255,255);
    
    private String colorName;
    private int r;
    private int g;
    private int b;

    private Color(String colorName, int r, int g, int b) {
        this.colorName = colorName;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getColorName() {
        return colorName;
    }    

    @Override
    public String toString() {
        return "Color{" + "colorName=" + colorName + ", r=" + r + ", g=" + g + ", b=" + b + '}';
    }
    
}