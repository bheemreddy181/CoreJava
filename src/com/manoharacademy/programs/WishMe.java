package com.manoharacademy.programs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WishMe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hi, What is your name? : ");
        String name = in.nextLine();

        System.out.print("Hi, What is your Birth Year ? : ");
        int birthYear = in.nextInt();

        System.out.print("Hi, What is your Birth Month (1 - 12) ? : ");
        int birthMonth = in.nextInt();

        System.out.print("Hi, What is your day of Birth (1 - 31) ? : ");
        int dayOfBirth = in.nextInt();

        System.out.println();
        System.out.println("Hi " + name + ".");

        String greeting = getGreeting(birthYear, birthMonth, dayOfBirth);
        System.out.println(greeting + ".");

    }

    private static String getGreeting(
            int birthYear,
            int birthMonth,
            int dayOfBirth) {
        LocalDate birthDay = LocalDate.of(birthYear, birthMonth, dayOfBirth);
        LocalDate today = LocalDate.now();

        String message;
        if (birthDay.getMonth() == today.getMonth()
                && birthDay.getDayOfMonth() == today.getDayOfMonth()) {
            message = "Happy Birthday. You are now" + ChronoUnit.YEARS.between(birthDay, today) + "Year(s) old";
        } else {
            message = "Happy " + ChronoUnit.DAYS.between(birthDay, today) + " UnBirthday";
        }

        return message;
    }

}
