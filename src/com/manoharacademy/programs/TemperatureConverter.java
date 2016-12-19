package com.manoharacademy.programs;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        
        System.out.print("Enter the temperature value in Fahrenheit : ");
        
        Scanner scanner = new Scanner(System.in);
        int FahrenheitTemperature = scanner.nextInt();
        
//         [°C] = ([°F] − 32) x 5 ⁄ 9
        int celsiusTemperature =  (FahrenheitTemperature - 32) * (5/9) ;
        
        System.out.printf("%dF = %dC\n",FahrenheitTemperature,celsiusTemperature );
    }
}
