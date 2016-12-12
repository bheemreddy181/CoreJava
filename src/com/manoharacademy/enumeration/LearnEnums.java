package com.manoharacademy.enumeration;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LearnEnums {

    public static void main(String[] args) throws Exception {

        Color redColor = Color.RED;
        Color greenColor = Color.GREEN;
        Color BlueColor = Color.BLUE;
        Color whiteColor = Color.WHITE;
        Color blackColor = Color.BLACK;

        Color redColor2 = Enum.valueOf(Color.class, "RED");
        Color redColor3 = Color.valueOf("RED");
        printMessage("");
        if (redColor == redColor2 & redColor2 == redColor3) {
            System.out.println("Same");
        }
        printMessage("");
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        printMessage("");
        Direction north = Direction.NORTH;

        DayOfWeek monday = DayOfWeek.MONDAY;
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println("" + dayOfWeek + " next day of week is " + dayOfWeek.plus(1));
        }
        printMessage("");
        
        for (Month month : Month.values()) {
            System.out.println("" + month + " next month is " + month.plus(1));
        }
        printMessage("");
        
        LocalDate newYearEveOf2000 = LocalDate.of(2000, Month.JANUARY, 1);
        LocalDate newYearEveOf2017 = LocalDate.of(2017, Month.JANUARY, 1);

        for (ChronoUnit chronoUnit : ChronoUnit.values()) {
            System.out.println(chronoUnit);
        }
        printMessage("");
        
        System.out.println("Number of days between two eves are  "
                + ChronoUnit.DAYS.between(newYearEveOf2000, newYearEveOf2017));

        System.out.println("Number of Month between two eves are  "
                + ChronoUnit.MONTHS.between(newYearEveOf2000, newYearEveOf2017));

        System.out.println("Number of years between two eves are  "
                + ChronoUnit.YEARS.between(newYearEveOf2000, newYearEveOf2017));
    }
    
    private static void printMessage(String message){
        System.out.println("=========================" + message + "=========================");
    }

}

enum Direction {
    NORTH, SOUTH, EAST, WEST;
}
